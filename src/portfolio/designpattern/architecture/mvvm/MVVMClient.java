package portfolio.designpattern.architecture.mvvm;

import java.util.Scanner;

import portfolio.designpattern.architecture.mvvm.view.MVVMPage;
import portfolio.designpattern.architecture.mvvm.view.MainPage;
import portfolio.designpattern.architecture.mvvm.viewmodel.BoardViewModel;
import portfolio.designpattern.architecture.mvvm.viewmodel.LoginViewModel;

public class MVVMClient {

	private static Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
		MVVMPage mainPage = new MainPage();
		
		mainPage.view();
		

		while (true) {
			String input = SC.nextLine();
			
			if(input.isEmpty()) {
				continue;
			}

			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			
			switch (input.toUpperCase()) {
			case "LOGIN" :
				System.out.println("로그인");	
				LoginViewModel.getInstance().login(SC);
				break;
				
			case "LOGOUT" :
				System.out.println("로그아웃");	
				LoginViewModel.getInstance().logout();
				break;
				
			case "POST" :
				System.out.println("글 작성");
				boardAddEvent();
				break;
				
			case "EXIT" : System.out.println("종료"); System.exit(0);
			}
		}
	}
	
	public static void boardAddEvent() {
		BoardViewModel boardViewModel = BoardViewModel.getInstance();
		String content = "게시글" + (boardViewModel.getData().size()+1);
		boardViewModel.postData(content);
	}
	
	public static void boardAddEvent(int repeat) {
		try {
			for(int i=0; i<repeat; i++) {
				Thread.sleep(1000);
				boardAddEvent();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

