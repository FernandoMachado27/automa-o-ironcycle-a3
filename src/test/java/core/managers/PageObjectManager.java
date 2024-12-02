package core.managers;

import org.openqa.selenium.WebDriver;

import test.logic.ClienteLogic;
import test.logic.HomeLogic;
import test.logic.VeiculoLogic;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomeLogic homeLogic;
	private VeiculoLogic veiculoLogic;
	private ClienteLogic clienteLogic;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomeLogic getHomeLogic() {
		return (homeLogic == null) ? homeLogic = new HomeLogic(driver) : homeLogic;
	}
	
	public VeiculoLogic getVeiculoLogic() {
		return (veiculoLogic == null) ? veiculoLogic = new VeiculoLogic(driver) : veiculoLogic;
	}
	
	public ClienteLogic getClienteLogic() {
		return (clienteLogic == null) ? clienteLogic = new ClienteLogic(driver) : clienteLogic;
	}

}
