package test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class ClientePage {
	
	WebDriver driver;
	
	public ClientePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='nomeCompletoInput']")
	private WebElement nome;
	
	@FindBy(how = How.XPATH, using = "//input[@id='cpfInput']")
	private WebElement cpf;
	
	@FindBy(how = How.XPATH, using = "//input[@id='dataNascimentoInput']")
	private WebElement nascimento;
	
	@FindBy(how = How.XPATH, using = "//input[@id='telefoneInput']")
	private WebElement telefone;
	
	@FindBy(how = How.XPATH, using = "//input[@id='emailInput']")
	private WebElement email;
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnCadastrar']")
	private WebElement btCadastrar;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/table/tbody/tr/td[3]")
	private WebElement obterCpf;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Home']")
	private WebElement home;

}
