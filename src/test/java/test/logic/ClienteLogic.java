package test.logic;

import static core.support.Context.actions;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.page.ClientePage;
import test.page.HomePage;

public class ClienteLogic {
	
	WebDriver driver;
	private WebDriverWait wait;
	private ClientePage clientePage;
	private HomePage homePage;
	
	public ClienteLogic(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.clientePage = PageFactory.initElements(driver, ClientePage.class);
		this.homePage = PageFactory.initElements(driver, HomePage.class);
	}

	public void preencherNome(String nome) throws InterruptedException {
		actions().sendKeys(clientePage.getNome(), nome);
		Thread.sleep(1000);
	}

	public void preencherCpf(String cpf) throws InterruptedException{
		actions().sendKeys(clientePage.getCpf(), cpf);
		Thread.sleep(1000);
	}

	public void preencherNascimento(String nascimento) throws InterruptedException{
		actions().sendKeys(clientePage.getNascimento(), nascimento);
		Thread.sleep(1000);
	}

	public void preencherTelefone(String telefone) throws InterruptedException{
		actions().sendKeys(clientePage.getTelefone(), telefone);
		Thread.sleep(1000);
	}

	public void preencherEmail(String email) throws InterruptedException{
		actions().sendKeys(clientePage.getEmail(), email);
		Thread.sleep(1000);
	}

	public void clicarBtCadastrar() throws InterruptedException{
		actions().click(clientePage.getBtCadastrar());
		Thread.sleep(1000);
	}

	public void validarCliente(String cpf) throws InterruptedException {
		actions().click(clientePage.getHome());
		actions().click(homePage.getPagCadastroCliente());
		
		 WebElement elemento = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[3]"));
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemento);
         
         
		Thread.sleep(1000);
		assertEquals(clientePage.getObterCpf().getText(), cpf);
	}

}
