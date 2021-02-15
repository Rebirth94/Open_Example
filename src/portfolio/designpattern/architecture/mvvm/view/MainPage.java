package portfolio.designpattern.architecture.mvvm.view;

import java.util.Observable;
import java.util.Observer;

import portfolio.designpattern.architecture.mvvm.viewmodel.BoardViewModel;
import portfolio.designpattern.architecture.mvvm.viewmodel.LoginViewModel;

public class MainPage implements Observer, MVVMPage {

	LoginViewModel loginViewModel = LoginViewModel.getInstance();
	BoardViewModel boardViewModel = BoardViewModel.getInstance();
	
	public MainPage() {
		this.loginViewModel.addObserver(this);
		this.boardViewModel.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		this.refreshPage();
		view();
	}	
	
	@Override
	public void view() {
		System.out.println("==============================");
		System.out.println("--------------------");
		System.out.println("[계정]");
		
		if(loginViewModel.isLogin() == false) {
			System.out.println("로그인을 해주세요.");
		} else {
			System.out.println(loginViewModel.toString());
		}
		
		System.out.println("--------------------");
		System.out.println("[게시판]");
		
		for(String data : boardViewModel.getData()) {
			System.out.println(data);
		}
		
		System.out.println("--------------------");
		System.out.println("==============================");
	}

}
