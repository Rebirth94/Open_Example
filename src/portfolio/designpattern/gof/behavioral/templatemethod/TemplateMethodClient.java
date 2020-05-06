package portfolio.designpattern.gof.behavioral.templatemethod;

import portfolio.designpattern.gof.behavioral.templatemethod.autohunt.AutoHunt;
import portfolio.designpattern.gof.behavioral.templatemethod.autohunt.AutoWizard;
import portfolio.designpattern.gof.behavioral.templatemethod.occupation.Wizard;

/**
 * 템플릿 메소드 패턴
 * 슈퍼클래스(상위)에서 흐름을 제어하고 서브클래스(하위)에서 특정 기능을 구현하여
 * 고정된 슈퍼클래스의 메소드를 실행하는 방법으로 코드 중복을 줄이고 확장에 용이한 패턴이다.
 * 
 * 게임에서 특정한 행동(몬스터 행동양식, 자동사냥 등)을 예로 들어보자
 */

public class TemplateMethodClient {
	public static void main(String[] args) {
//		AutoHunt autoHunt = new Beginner();
//		AutoHunt autoHunt = new AutoWarrior(new Warrior());
		AutoHunt autoHunt = new AutoWizard(new Wizard());
		
		autoHunt.autoHunting();
	}
}
