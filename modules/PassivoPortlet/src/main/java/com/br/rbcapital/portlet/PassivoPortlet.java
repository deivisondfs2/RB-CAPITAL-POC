package com.br.rbcapital.portlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Component;

import com.br.rbcapital.constants.PassivoPortletKeys;
import com.br.rbcapital.util.JacksonConverter;
import com.br.rbcapital.util.JacksonConverterException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author dfs2
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PassivoPortletKeys.Passivo,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PassivoPortlet extends MVCPortlet {
	
	public static final String URL_PUBLIC = "https://gestaofiduciariaapi20180920073158.azurewebsites.net/api/operacoes/passivo/buscar?idsOperacoes=1,2,3&pagina=1&tamanhoPagina=10";

	public static final String URL_PRIVADA = "https://gestaofiduciariaapi20180920073158.azurewebsites.net/api/operacoes/passivo/buscar?idsOperacoes=1,2&pagina=1&tamanhoPagina=10";

	public static final String LIST_PASSIVOS = "listPassivos";

	public static final String PASSIVO_PUBLIC = "passivos-cadastrados";
	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		try {
			
			System.out.println("doView Passivo!!!");

			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

			String output = StringUtils.EMPTY;

			String[] urlAccess = themeDisplay.getURLCurrent().split("/");
			
			String palavraChave = urlAccess[urlAccess.length - 1];
			
			boolean userIsLogged = themeDisplay.isSignedIn();
			
			System.out.println("\n USER: \n" + themeDisplay.getUserId());
			
			if(!StringUtils.equals(palavraChave, PASSIVO_PUBLIC)) {
				output = callURL(URL_PRIVADA);				
			}else {
				output = callURL(URL_PUBLIC);
			}

			System.out.println("\n Output: \n" + output);

			if(StringUtils.isNotBlank(output)) {	
			
				GeneralData generalData = JacksonConverter.readFrom(output, GeneralData.class);
				generalData.getContent();
	
				if (!ObjectUtils.equals(generalData.getContent().getItens(), null)) {
					renderRequest.setAttribute(LIST_PASSIVOS, generalData.getContent().getItens());
				}
			}	

		} catch (JacksonConverterException e) {
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
}