<%@ include file="/init.jsp" %>

<portlet:actionURL name="favoritoSubmit" var="favoritoSubmit" />


<div class="row row-spacing">
	<div class="col-md-12">
		<h3 id="table-list">Operações</h3>

		<blockquote class="blockquote-sm blockquote-success">			
		</blockquote>
		
		<form method="post" action="${favoritoSubmit}">

		<table class="table table-autofit table-list">
			<thead>
				<tr>
					<c:if test="${userIsLogged}">
						<th>Favoritos</th>					
					</c:if>
					<th class="hidden-sm hidden-xs">CÓD. RB</th>
					<th class="table-cell-content">
						<span class="truncate-text" title="Description">CÓD CETIP</span>
					</th>
					<th class="hidden-sm hidden-xs">APELIDO DA OPERAÇÃO</th>
					<th class="hidden-sm hidden-xs">DATA EMISSÃO</th>
					<th class="hidden-sm hidden-xs">DATA DE VENCIMENTO</th>
					<th>TAXA DE SPREAD (A.A)</th>
					<th class="hidden-sm hidden-xs">REMUNERAÇÃO FLUTUANTE</th>					
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${listPassivos}" var="passivo">
					<tr>
						<c:if test="${userIsLogged}">
							<td>
								<div class="checkbox">
									<label>
										<input type="checkbox" name="<portlet:namespace/>idsSelecionados" value="${passivo.idPassivo}">
									</label>
								</div>
							
							</td>
						</c:if>					
						<td class="hidden-sm hidden-xs"><a href="passivodetalhe?passivo=${passivo.idPassivo}">${passivo.codigoRB}</a></td>
						<td class="hidden-sm hidden-xs"><a href="passivodetalhe?passivo=${passivo.idPassivo}">${passivo.codigoCetipBbb}</a></td>
						<td class="table-cell-content">
							<span class="truncate-text" title="${passivo.apelidoOperacao}">${passivo.apelidoOperacao}</span>
						</td>
						<td class="hidden-sm hidden-xs">${passivo.dataEmissaoSerie}</td>
						<td class="hidden-sm hidden-xs">${passivo.dataVencimentoSerie}</td>
						<td>${passivo.taxaSpreadCalculado}</td>
						<td class="hidden-sm hidden-xs">${passivo.remuneracaoFlutuante}</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<c:if test="${userIsLogged}">
			<input type="submit" value="SUBMIT">
		</c:if>
	</form>
		
	</div>
</div>

