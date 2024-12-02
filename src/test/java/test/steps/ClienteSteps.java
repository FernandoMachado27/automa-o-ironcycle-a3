package test.steps;

import core.cucumber.TestContext;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import test.logic.ClienteLogic;

public class ClienteSteps {
	
	private TestContext testContext;
	private ClienteLogic clienteLogic;
	
	public ClienteSteps(TestContext context) {
		this.testContext = context;
		this.clienteLogic = testContext.getPageObjectManager().getClienteLogic();
	}
	
	@E("preenche os dados cliente {string}, {string}, {string}, {string}, {string}")
	public void preencheOsDadosCliente(String nome, String cpf, String nascimento, String telefone, String email) throws InterruptedException {
		this.clienteLogic.preencherNome(nome);
		this.clienteLogic.preencherCpf(cpf);
		this.clienteLogic.preencherNascimento(nascimento);
		this.clienteLogic.preencherTelefone(telefone);
		this.clienteLogic.preencherEmail(email);
		this.clienteLogic.clicarBtCadastrar();
	}
	
	@Então("cliente e cadastrado com sucesso {string}")
	public void clienteCadastradoComSucesso(String cpf) throws InterruptedException {
		this.clienteLogic.validarCliente(cpf);
	}

}
