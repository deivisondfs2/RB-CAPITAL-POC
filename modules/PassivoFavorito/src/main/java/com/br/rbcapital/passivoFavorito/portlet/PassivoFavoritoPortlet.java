package com.br.rbcapital.passivoFavorito.portlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.br.rbcapital.passivoFavorito.constants.PassivoFavoritoPortletKeys;
import com.favorito.model.Favorito;
import com.favorito.service.FavoritoLocalService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author dfs2
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PassivoFavoritoPortletKeys.PassivoFavorito,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class PassivoFavoritoPortlet extends MVCPortlet {

	public static final String URL_PRIVADA = "https://gestaofiduciariaapi20180920073158.azurewebsites.net/api/operacoes/passivo/buscar?idsOperacoes=%s&pagina=1&tamanhoPagina=10";

	public static final String LIST_PASSIVOS = "listPassivos";

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

			boolean userIsLogged = themeDisplay.isSignedIn();

			String filtro = StringUtils.EMPTY;

			String output = StringUtils.EMPTY;
			
			boolean ShowGrid = false;

			if (userIsLogged) {

				Favorito favorito = findByUserAttr(themeDisplay.getUserId(), "userId");
				
				if(ObjectUtils.notEqual(favorito, null)) {
					
					ShowGrid = true;
					
					filtro = favorito.getFavoritos_itenscol();
					
					if (StringUtils.isNotBlank(filtro)) {
						output = callURL(String.format(URL_PRIVADA, filtro));
					}
					
					if (StringUtils.isNotBlank(output)) {
						GeneralData generalData;
						generalData = JacksonConverter.readFrom(output, GeneralData.class);
						generalData.getContent();
						if (!ObjectUtils.equals(generalData.getContent().getItens(), null)) {
							renderRequest.setAttribute(LIST_PASSIVOS, generalData.getContent().getItens());
						}
					}
				}
			}
			
			renderRequest.setAttribute("ShowGrid", ShowGrid);

		} catch (JacksonConverterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		super.doView(renderRequest, renderResponse);

	}

	public static String callURL(String myURL) {
		System.out.println("Requeted URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(), Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
			in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:" + myURL, e);
		}

		return sb.toString();
	}

	private Favorito findByUserAttr(Long value, String attr) throws SystemException {
		System.out.println("findByUserAttr. attr[" + attr + "], value[" + value + "]");

		DynamicQuery query = DynamicQueryFactoryUtil.forClass(Favorito.class);

		query.add(PropertyFactoryUtil.forName(attr).eq(value));

		@SuppressWarnings("unchecked")
		List<Favorito> results = _favoritoLocalService.dynamicQuery(query);

		System.out.println("results[" + results + "]");
		return results != null && results.size() > 0 ? results.get(0) : null;

	}

	private FavoritoLocalService _favoritoLocalService;

	@Reference(unbind = "-")
	protected void setFavoritoLocalService(FavoritoLocalService favoritoLocalService) {
		_favoritoLocalService = favoritoLocalService;
	}

}