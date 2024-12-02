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

import test.page.HomePage;
import test.page.VeiculoPage;

public class VeiculoLogic {
	
	WebDriver driver;
	private WebDriverWait wait;
	private VeiculoPage veiculoPage;
	private HomePage homePage;
	
	public VeiculoLogic(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.veiculoPage = PageFactory.initElements(driver, VeiculoPage.class);
		this.homePage = PageFactory.initElements(driver, HomePage.class);
	}

	public void preencherNome(String nome) throws InterruptedException{
		actions().sendKeys(veiculoPage.getNome(), nome);
		Thread.sleep(1000);
	}

	public void preencherMarca(String marca) throws InterruptedException{
		actions().sendKeys(veiculoPage.getMarca(), marca);
		Thread.sleep(1000);
	}

	public void preencherModelo(String modelo) throws InterruptedException{
		actions().sendKeys(veiculoPage.getModelo(), modelo);
		Thread.sleep(1000);
	}

	public void preencherplaca(String placa)throws InterruptedException {
		actions().sendKeys(veiculoPage.getPlaca(), placa);
		Thread.sleep(1000);
	}

	public void preencherAno(String ano) throws InterruptedException{
		actions().sendKeys(veiculoPage.getAno(), ano);
		Thread.sleep(1000);
	}

	public void preencherPlanoGold() throws InterruptedException{
		actions().click(veiculoPage.getGold());
		Thread.sleep(1000);
	}
	
	public void clicarBtCadastrar() throws InterruptedException {
		actions().click(veiculoPage.getBtCadastrar());
		Thread.sleep(1000);
	}

	public void validarVeiculo(String placa) throws InterruptedException {
		actions().click(veiculoPage.getHome());
		actions().click(homePage.getPagCadastroVeiculo());
		
		 WebElement elemento = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[6]"));
         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elemento);
         
		Thread.sleep(1000);
		assertEquals(veiculoPage.getObterPlaca().getText(), placa);
	}

}
