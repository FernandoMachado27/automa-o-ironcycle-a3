package core.support;

import org.openqa.selenium.WebDriver;

import core.actions.CustomWebActions;

public class Context {
	
	private static ThreadLocal<CustomWebActions> actions = new ThreadLocal<CustomWebActions>();
	
	public static void initialize(WebDriver driver) {
        actions.set(new CustomWebActions(driver));
    }
	
	public static CustomWebActions actions() {
		return actions.get();
	}
	
	public static void tearDown() {
		actions.remove();
	}

}
