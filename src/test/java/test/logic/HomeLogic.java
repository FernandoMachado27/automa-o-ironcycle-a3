package test.logic;

import static core.support.Context.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.managers.FileReaderManager;
import test.page.HomePage;

public class HomeLogic {
	
	WebDriver driver;
	private WebDriverWait wait;
	private HomePage homePage;
	
	public HomeLogic(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		this.homePage = PageFactory.initElements(driver, HomePage.class);
	}
	
	public void paginaInicial() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		actions().waitVisibilityOf(homePage.getLogo());
	}

	public boolean validarPaginaInicial() {
		boolean nome = wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("(//img[@alt='My Shop'])[1]")))
				.isDisplayed();
		return nome;
	}

	public void acessarTelaCadastroVeiculos() {
		actions().click(homePage.getPagCadastroVeiculo());
	}

	public void acessarTelaCadastroClientes() {
		actions().click(homePage.getPagCadastroCliente());
	}

}
