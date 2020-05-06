package portfolio.designpattern.gof.behavioral.mediator.mediator;

import portfolio.designpattern.gof.behavioral.mediator.avatar.Avatar;
import portfolio.designpattern.gof.behavioral.mediator.item.Item;
import portfolio.designpattern.gof.behavioral.mediator.monster.Monster;

public class AvatarActionMediator extends ActionMediator {

	@Override
	public void move(String destination) {
		super.getCurrentField().move(super.getAvatar(), destination);
	}

	@Override
	public Item pickUpItem() {
		Item item = super.getCurrentField().pickUpItem();
		if(item != null) {
			super.getAvatar().getInventory().add(item);
		}else {
			System.out.println("아이템이 없습니다.");
		}
		
		return null;
		
		
	}

	@Override
	public void attack() {
		Avatar avatar = super.getAvatar();
		Monster monster = super.getMonster();
		
		if(monster != null) {
			monster.getDamage(avatar.getPower());
		} else {
			System.out.println("몬스터가 없습니다.");
		}
	}
	
}
