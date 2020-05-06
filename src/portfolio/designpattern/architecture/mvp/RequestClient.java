package portfolio.designpattern.architecture.mvp;

import portfolio.designpattern.architecture.mvp.domain.PageView;

public class RequestClient {

	public static void main(String[] args) {
		PageView landingView = new PageView();
		
		landingView.startLanding();
	}

}

