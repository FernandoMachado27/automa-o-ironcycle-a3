package test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class VeiculoPage {
	
	WebDriver driver;
	
	public VeiculoPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"nomeInput\"]")
	private WebElement nome;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"marcaInput\"]")
	private WebElement marca;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"modeloInput\"]")
	private WebElement modelo;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"placaInput\"]")
	private WebElement placa;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"anoInput\"]")
	private WebElement ano;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"opcaoInput\"]/option[2]")
	private WebElement gold;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cadastrarButton\"]")
	private WebElement btCadastrar;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/table/tbody/tr/td[6]")
	private WebElement obterPlaca;
	
	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[1]/a")
	private WebElement home;

}
