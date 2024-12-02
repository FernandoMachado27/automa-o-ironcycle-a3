package test.steps;

import core.cucumber.TestContext;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import test.logic.VeiculoLogic;

public class VeiculoSteps {
	
	private TestContext testContext;
	private VeiculoLogic veiculoLogic;
	
	public VeiculoSteps(TestContext context) {
		this.testContext = context;
		this.veiculoLogic = testContext.getPageObjectManager().getVeiculoLogic();
	}
	
	@E("preenche os dados {string}, {string}, {string}, {string}, {string}")
	public void preencheOsDados(String nome, String marca, String modelo, String ano, String placa) throws InterruptedException {
		this.veiculoLogic.preencherNome(nome);
		this.veiculoLogic.preencherMarca(marca);
		this.veiculoLogic.preencherModelo(modelo);
		this.veiculoLogic.preencherAno(ano);
		this.veiculoLogic.preencherplaca(placa);
		this.veiculoLogic.preencherPlanoGold();
		this.veiculoLogic.clicarBtCadastrar();
	}
	
	@Então("veiculo e cadastrado com sucesso {string}")
	public void veiculoCadastradoComSucesso(String placa) throws InterruptedException {
		this.veiculoLogic.validarVeiculo(placa);
	}

}
