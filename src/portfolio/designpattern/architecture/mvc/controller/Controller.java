package portfolio.designpattern.architecture.mvc.controller;

import portfolio.designpattern.architecture.mvc.model.ModelData;
import portfolio.designpattern.architecture.mvc.model.ModelValidator;
import portfolio.designpattern.architecture.mvc.view.View;
import portfolio.designpattern.architecture.mvc.model.ModelLogin;

public class Controller {
	
	private ModelValidator modelValidator = new ModelValidator();
	private ModelData modelData = new ModelData();
	private ModelLogin modelLogin = new ModelLogin();

	public void requestMapping(String url) {
		switch (url) {
			case "/landing" : landing(); break;
			case "/main" : mainPage(); break;
			case "/login" : restPostLogin(); break;
			default : System.out.println("404 Not Found");
		}
	}
	
	private void landing() {
		modelData.getData();
		View.jspLanding();
	}
	
	private void mainPage() {
		modelValidator.validate();
		modelData.getData();
		View.jspMain();
	}

	private void restPostLogin() {
		modelValidator.validate();
		modelLogin.login();
		View.jspLoginScript(true);
	}
}
