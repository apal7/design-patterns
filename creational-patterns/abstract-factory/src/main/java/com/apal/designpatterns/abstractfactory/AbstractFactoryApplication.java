package com.apal.designpatterns.abstractfactory;


import com.apal.designpatterns.abstractfactory.app.Application;
import com.apal.designpatterns.abstractfactory.button.Button;
import com.apal.designpatterns.abstractfactory.checkbox.Checkbox;
import com.apal.designpatterns.abstractfactory.factory.GUIFactory;
import com.apal.designpatterns.abstractfactory.factory.MacOSFactory;
import com.apal.designpatterns.abstractfactory.factory.WindowsFactory;


/**
 * Main class. Everything comes together here.
 */
public class AbstractFactoryApplication {

	private Button button;
	private Checkbox checkbox;


	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();
	}




	/**
	 * Application picks the factory type and creates it in run time (usually at
	 * initialization stage), depending on the configuration or environment
	 * variables.
	 */
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
			app = new Application(factory);
		} else {
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		return app;
	}

}

