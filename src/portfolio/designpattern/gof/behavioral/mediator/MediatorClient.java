package portfolio.designpattern.gof.behavioral.mediator;

import portfolio.designpattern.gof.behavioral.mediator.avatar.Avatar;
import portfolio.designpattern.gof.behavioral.mediator.avatar.Warrior;
import portfolio.designpattern.gof.behavioral.mediator.field.ExampleField;
import portfolio.designpattern.gof.behavioral.mediator.field.ExampleFieldOne;
import portfolio.designpattern.gof.behavioral.mediator.mediator.ActionMediator;
import portfolio.designpattern.gof.behavioral.mediator.mediator.AvatarActionMediator;

/**
 * 중재자 패턴 (Mediator)
 * 
 * 
 * 예시로 게임에서 캐릭터의 액션과 상호작용 하는 것으로 확인 해보자 
 * 캐릭터 액션은 3가지로 이동, 아이템을 줍기, 몬스터 공격이 있다고 가정한다
 * 각각 캐릭터(아바타) 객체, 필드 객체, 아이템 객체, 몬스터 객체가  상호작용을 할 때
 * 캐릭터의 액션을 담당하는 중재자 객체를 만들어서 확인해보자
 * */

public class MediatorClient {
	public static void main(String[] args) {
		ExampleField exampleField = new ExampleFieldOne();
		ActionMediator actionMediator = new AvatarActionMediator();
		Avatar warrior = new Warrior();
		
		warrior.setActionMediator(actionMediator);
		
		actionMediator.registerCurrentField(exampleField);
		actionMediator.registerAvatar(warrior);
		

		
		
		
		warrior.move("포션 아이템 있는 곳");
		warrior.pickUpItem();
		
	}
}
