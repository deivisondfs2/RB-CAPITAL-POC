<%@ include file="/init.jsp"%>

<div class="row">
	<div class="col-md-12">
		<nav>
			<ul class="pager">
				<li class="previous"><a href="passivos-cadastrados"> <- VOLTAR</a></li>
			</ul>
		</nav>
	</div>
</div>


<div class="row">

	<div class="col-md-12">
		<h3 id="accordions-with-panels-and-collapse-plugin">Detalhes</h3>

		<div class="panel panel-default">
			<div class="panel-heading" id="heading00" role="tab">
				<div class="panel-title">
					<a aria-controls="collapseOne" aria-expanded="true"
						data-toggle="collapse" data-parent="#accordion00"
						href="#panelCollapse00" role="button" class=""> Geral </a>
				</div>
			</div>
			<div aria-labelledby="heading00" class="panel-collapse collapse in"
				id="panelCollapse00" role="tabpanel" aria-expanded="false" style="">
				<div class="panel-body">
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Emissor:</div>
							<div class="panel-body">${content.emissor.descricao}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Apelido da Operação:</div>
							<div class="panel-body">${content.apelidoOperacao}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Tí­tulo:</div>
							<div class="panel-body">${content.titulo.descricao}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Emissão:</div>
							<div class="panel-body">${content.emissao}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Série:</div>
							<div class="panel-body">${content.serie}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Gestor da Operação:</div>
							<div class="panel-body">${content.gestorOperacao}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Analista da Operação:</div>
							<div class="panel-body">${content.analistaOperacao}</div>
						</div>
					</div>


				</div>
			</div>
		</div>
		
		
		<div class="panel panel-default">
			<div class="panel-heading" id="heading00" role="tab">
				<div class="panel-title">
					<a aria-controls="collapseOne" aria-expanded="true"
						data-toggle="collapse" data-parent="#accordion00"
						href="#panelCollapse00" role="button" class=""> Códigos </a>
				</div>
			</div>
			<div aria-labelledby="heading00" class="panel-collapse collapse in"
				id="panelCollapse00" role="tabpanel" aria-expanded="false" style="">
				<div class="panel-body">
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Código bolsa:</div>
							<div class="panel-body">${content.codigoBolsa}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Código B3/Cetip:</div>
							<div class="panel-body">${content.codigoCetipBbb}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Código ISIN:</div>
							<div class="panel-body">${content.codigoIsin}</div>
						</div>
					</div>


				</div>
			</div>
		</div>
		
		
		<div class="panel panel-default">
			<div class="panel-heading" id="heading00" role="tab">
				<div class="panel-title">
					<a aria-controls="collapseOne" aria-expanded="true"
						data-toggle="collapse" data-parent="#accordion00"
						href="#panelCollapse00" role="button" class=""> Participantes </a>
				</div>
			</div>
			<div aria-labelledby="heading00" class="panel-collapse collapse in"
				id="panelCollapse00" role="tabpanel" aria-expanded="false" style="">
				<div class="panel-body">
					<div class="col-md-6">
						<div class="panel panel-blank">
							<div class="panel-heading">Gestor Fiduciário:</div>
							<div class="panel-body">${content.gestorFiduciario.empresaPrestadora.razaoSocial}</div>
						</div>
					</div>

					<div class="col-md-6">
						<div class="panel panel-blank">
							<div class="panel-heading">Coordenador Líder:</div>
							<div class="panel-body">${content.coordenadorLider.empresaPrestadora.razaoSocial}</div>
						</div>
					</div>

					<div class="col-md-6">
						<div class="panel panel-blank">
							<div class="panel-heading">Agente Fiduciário:</div>
							<div class="panel-body">${content.agenteFiduciario.empresaPrestadora.razaoSocial}</div>
						</div>
					</div>
					
					<div class="col-md-6">
						<div class="panel panel-blank">
							<div class="panel-heading">Assessor Legal:</div>
							<div class="panel-body">${content.assessorLegal.empresaPrestadora.razaoSocial}</div>
						</div>
					</div>


				</div>
			</div>
		</div>
		
		<div class="panel panel-default">
			<div class="panel-heading" id="heading00" role="tab">
				<div class="panel-title">
					<a aria-controls="collapseOne" aria-expanded="true"
						data-toggle="collapse" data-parent="#accordion00"
						href="#panelCollapse00" role="button" class=""> Características da Oferta </a>
				</div>
			</div>
			<div aria-labelledby="heading00" class="panel-collapse collapse in"
				id="panelCollapse00" role="tabpanel" aria-expanded="false" style="">
				<div class="panel-body">
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Tipo Oferta:</div>
							<div class="panel-body">${content.tipoOferta}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Regime Fiduciário:</div>
							<div class="panel-body">${content.regimeFiduciario}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Câmara de Liquidação:</div>
							<div class="panel-body">${content.camaraLiquidacao.empresaPrestadora.razaoSocial}</div>
						</div>
					</div>
					
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Forma de Cálculo:</div>
							<div class="panel-body">${content.formaCalculo.value}</div>
						</div>
					</div>
					
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Classe da operação:</div>
							<div class="panel-body">${content.classeOperacao.descricao}</div>
						</div>
					</div>
					
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Natureza:</div>
							<div class="panel-body">${content.naturezaOperacao.descricao}</div>
						</div>
					</div>
					
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Concentração:</div>
							<div class="panel-body">${content.concentracao.value}</div>
						</div>
					</div>


				</div>
			</div>
		</div>
		
		

	</div>

</div>