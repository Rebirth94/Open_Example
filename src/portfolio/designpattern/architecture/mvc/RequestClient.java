package portfolio.designpattern.architecture.mvc;

import java.util.Scanner;

import portfolio.designpattern.architecture.mvc.controller.Controller;

/**
 * MVC (Model-View-Controller) 패턴
 */

public class RequestClient {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
		while(true) {
			System.out.println("\nURL을 입력 하세요 {/landing, /main, /login} [종료 : exit]\n");
			System.out.print("주소창 : http://mvc.com");
			String url = scanner.next();
			System.out.println();
			
			if(url.equals("exit")) {
				break;
			}		
			controller.requestMapping(url);
		}
		
		System.out.println("브라우저 종료");
		
	}

}
