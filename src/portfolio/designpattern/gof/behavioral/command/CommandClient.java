package portfolio.designpattern.gof.behavioral.command;

import java.util.Scanner;

import portfolio.designpattern.gof.behavioral.command.actions.Potion;
import portfolio.designpattern.gof.behavioral.command.actions.Shield;
import portfolio.designpattern.gof.behavioral.command.actions.Weapon;
import portfolio.designpattern.gof.behavioral.command.shortcut.buttons.ShortcutButton;
import portfolio.designpattern.gof.behavioral.command.shortcut.buttons.ShortcutButtonOne;
import portfolio.designpattern.gof.behavioral.command.shortcut.buttons.ShortcutButtonThree;
import portfolio.designpattern.gof.behavioral.command.shortcut.buttons.ShortcutButtonTwo;
import portfolio.designpattern.gof.behavioral.command.shortcut.command.AttackShortcutCommand;
import portfolio.designpattern.gof.behavioral.command.shortcut.command.DefenseShortcutCommand;
import portfolio.designpattern.gof.behavioral.command.shortcut.command.DrinkShortcutCommand;

/**
 * 커맨드 패턴
 * 명령을 캡슐화(객체화)함으로 특정 클래스에 대한 의존성을 제거하여
 * 코드의 확장성과 유연성을 늘리는 패턴
 * 
 * 클라이언트가 요청하는 부분과 실제로 명령하는 역할을 분리하는 방법으로
 * 클라이언트는 어디에서 어떤 요청이 들어왔다는 사실만을 알면 되고
 * 실제 명령은 캡슐화된 명령 객체에서 실행하게 된다
 * 
 * 게임에서 퀵슬롯 단축키 설정을 예로 들어보자
 **/
public class CommandClient {
	
	private static Scanner scanner = new Scanner(System.in);;

	public static void main(String[] args) {
		ShortcutButtonOne button1 = new ShortcutButtonOne();
		ShortcutButtonTwo button2 = new ShortcutButtonTwo();
		ShortcutButtonThree button3 = new ShortcutButtonThree();
		
		System.out.println("단축키에 스킬을 세팅하세요.");
		System.out.println("attack : 공격");
		System.out.println("defense : 방어");
		System.out.println("drink : 물약 마시기\n");
		
		setShortcut(button1);
		setShortcut(button2);
		setShortcut(button3);

		while(true) {
			System.out.print("\n단축번호를 입력하세요. (1~3번, 종료:exit) : ");
			String inputNum = scanner.next();
			switch (inputNum) {
				case "exit" : System.out.println("종료"); return;
				case "1" : button1.action(); break;
				case "2" : button2.action(); break;
				case "3" : button3.action(); break;
				default : System.out.println("단축키를 다시 입력하세요.");break;
			}
		}
	}
	
	private static void setShortcut(ShortcutButton button) {
		
		while(true) {
			System.out.print(button.getButtonName() + " : ");
			String input = scanner.next();
			
			boolean isSetCommand = false;
			switch (input) {
				case "attack" : button.setCommnad(new AttackShortcutCommand(new Weapon())); 
								isSetCommand = true;
								break;
				case "defense" : button.setCommnad(new DefenseShortcutCommand(new Shield())); 
								isSetCommand = true;
								break;
				case "drink" : button.setCommnad(new DrinkShortcutCommand(new Potion())); 
								isSetCommand = true;
								break;
	
				default: System.out.println("스킬을 다시 입력해주세요."); break;
			}
			
			if(isSetCommand == true) {
				break;
			}
		}
	}
	

}
