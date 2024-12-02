package test.steps;

import core.cucumber.TestContext;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import test.logic.HomeLogic;

public class HomeSteps {
	
	private TestContext testContext;
	private HomeLogic homeLogic;
	
	public HomeSteps(TestContext context) {
		this.testContext = context;
		this.homeLogic = testContext.getPageObjectManager().getHomeLogic();
	}
	
	@Dado("que o usuario acessa o site")
	public void queOUsuarioAcessaOSite() {
		this.homeLogic.paginaInicial();
	}
	
	@Quando("acessa a tela de cadastro de veículos")
	public void acessaTelaDeCadastroDeVeiculos() {
		this.homeLogic.acessarTelaCadastroVeiculos();
	}
	
	@Quando("acessa a tela de cadastro de Clientes")
	public void acessaTelaDeCadastroDeClientes() {
		this.homeLogic.acessarTelaCadastroClientes();
	}

}
