package portfolio.designpattern.architecture.mvp.domain;

import java.util.Scanner;

public class PageView implements PageContract.View {

	private PageContract.Presenter presenter;
	
	public PageView() {
		this.presenter = new PagePresenter(this);
	}
	
	public void startLanding() {
		Scanner sc = new Scanner(System.in);
		
		command();	
		changeGeneralView();
			
		while(true) {
			System.out.print("액션 : ");
			String action = sc.next();	
			
			switch (action) {
				case "login" 	: presenter.login( getLoginId(sc) ); break;
				case "logout" 	: presenter.logout(); break;
				case "show" 	: presenter.postShow(); break;
				case "close" 	: presenter.postClose(); break;
				case "exit" 	: System.out.println("종료"); return;
				default : System.out.println("액션 없음"); break;
			}			
			
		}		
	}
	
	private void setChangeLine() {
		for(int i=0; i<10; i++) {
			System.out.println("\n");
		}
	}
	
	private String getLoginId(Scanner sc) {
		setChangeLine();
		System.out.println("로그인 아이디를 입력하세요.");
		return sc.next();
	}
	
	private void command() {
		setChangeLine();
		System.out.println("액션을 입력하세요.");
		System.out.println("login 	: 로그인 하기");
		System.out.println("logout 	: 로그아웃 하기");
		System.out.println("show 	: 글 보기");
		System.out.println("close 	: 글 닫기");
		System.out.println("exit	: 종료");
		System.out.println();
	}

	@Override
	public void changeGeneralView() {
		command();
		System.out.println("========================");
		System.out.println("||           (로그인) ||");
		System.out.println("||                    ||");
		System.out.println("||       페이지       ||");
		System.out.println("||                    ||");
		System.out.println("||  ----------------  ||");
		System.out.println("||  |        (보기)|  ||");
		System.out.println("||  |              |  ||");
		System.out.println("||  |              |  ||");
		System.out.println("||  ----------------  ||");
		System.out.println("||                    ||");
		System.out.println("========================");
	}

	@Override
	public void changeMemberView(String loginId) {
		command();
		System.out.println("========================");
		System.out.println("||          ("+loginId+" 님) ||");
		System.out.println("||                    ||");
		System.out.println("||       페이지       ||");
		System.out.println("||                    ||");
		System.out.println("||  ----------------  ||");
		System.out.println("||  |        (보기)|  ||");
		System.out.println("||  |              |  ||");
		System.out.println("||  |              |  ||");
		System.out.println("||  ----------------  ||");
		System.out.println("||                    ||");
		System.out.println("========================");
	}

	@Override
	public void changePostView(String content) {
		command();
		System.out.println("========================");
		System.out.println("||       페이지       ||");
		System.out.println("||  ----------------  ||");
		System.out.println("||  |    글 제목   |  ||");
		System.out.println("||  |--------------|  ||");
		System.out.println("||  |              |  ||");
		System.out.println("||  | "+ content +" |  ||");
		System.out.println("||  |              |  ||");
		System.out.println("||  |              |  ||");
		System.out.println("||  ----------------  ||");
		System.out.println("||                    ||");
		System.out.println("========================");
	}
                                      	
}
