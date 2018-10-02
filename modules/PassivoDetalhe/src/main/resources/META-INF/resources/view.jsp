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
							<div class="panel-heading">Apelido da Opera��o:</div>
							<div class="panel-body">${content.apelidoOperacao}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">T�tulo:</div>
							<div class="panel-body">${content.titulo.descricao}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Emiss�o:</div>
							<div class="panel-body">${content.emissao}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">S�rie:</div>
							<div class="panel-body">${content.serie}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Gestor da Opera��o:</div>
							<div class="panel-body">${content.gestorOperacao}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Analista da Opera��o:</div>
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
						href="#panelCollapse00" role="button" class=""> C�digos </a>
				</div>
			</div>
			<div aria-labelledby="heading00" class="panel-collapse collapse in"
				id="panelCollapse00" role="tabpanel" aria-expanded="false" style="">
				<div class="panel-body">
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">C�digo bolsa:</div>
							<div class="panel-body">${content.codigoBolsa}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">C�digo B3/Cetip:</div>
							<div class="panel-body">${content.codigoCetipBbb}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">C�digo ISIN:</div>
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
							<div class="panel-heading">Gestor Fiduci�rio:</div>
							<div class="panel-body">${content.gestorFiduciario.empresaPrestadora.razaoSocial}</div>
						</div>
					</div>

					<div class="col-md-6">
						<div class="panel panel-blank">
							<div class="panel-heading">Coordenador L�der:</div>
							<div class="panel-body">${content.coordenadorLider.empresaPrestadora.razaoSocial}</div>
						</div>
					</div>

					<div class="col-md-6">
						<div class="panel panel-blank">
							<div class="panel-heading">Agente Fiduci�rio:</div>
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
						href="#panelCollapse00" role="button" class=""> Caracter�sticas da Oferta </a>
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
							<div class="panel-heading">Regime Fiduci�rio:</div>
							<div class="panel-body">${content.regimeFiduciario}</div>
						</div>
					</div>

					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">C�mara de Liquida��o:</div>
							<div class="panel-body">${content.camaraLiquidacao.empresaPrestadora.razaoSocial}</div>
						</div>
					</div>
					
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Forma de C�lculo:</div>
							<div class="panel-body">${content.formaCalculo.value}</div>
						</div>
					</div>
					
					<div class="col-md-4">
						<div class="panel panel-blank">
							<div class="panel-heading">Classe da opera��o:</div>
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
							<div class="panel-heading">Concentra��o:</div>
							<div class="panel-body">${content.concentracao.value}</div>
						</div>
					</div>


				</div>
			</div>
		</div>
		
		

	</div>

</div>