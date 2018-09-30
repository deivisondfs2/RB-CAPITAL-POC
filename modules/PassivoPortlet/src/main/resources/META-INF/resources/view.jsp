<%@ include file="/init.jsp" %>

<div class="row row-spacing">
	<div class="col-md-12">
		<h3 id="table-list">Opera��es</h3>

		<blockquote class="blockquote-sm blockquote-success">			
		</blockquote>

		<table class="table table-autofit table-list">
			<thead>
				<tr>					
					<th class="hidden-sm hidden-xs">C�D. RB</th>
					<th class="table-cell-content">
						<span class="truncate-text" title="Description">C�D CETIP</span>
					</th>
					<th class="hidden-sm hidden-xs">APELIDO DA OPERA��O</th>
					<th class="hidden-sm hidden-xs">DATA EMISS�O</th>
					<th class="hidden-sm hidden-xs">DATA DE VENCIMENTO</th>
					<th>TAXA DE SPREAD (A.A)</th>
					<th class="hidden-sm hidden-xs">REMUNERA��O FLUTUANTE</th>					
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${listPassivos}" var="passivo">
					<tr>					
						<td class="hidden-sm hidden-xs">${passivo.codigoRB}</td>
						<td class="hidden-sm hidden-xs">${passivo.codigoCetipBbb}</td>
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
	</div>
</div>