package test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class HomePage {
	
	WebDriver driver;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/header/h1")
	private WebElement logo;
	
	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[2]/a")
	private WebElement pagCadastroVeiculo;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Cadastrar clientes']")
	private WebElement pagCadastroCliente;
}
