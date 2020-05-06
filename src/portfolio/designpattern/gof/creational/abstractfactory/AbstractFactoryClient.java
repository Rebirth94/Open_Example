package portfolio.designpattern.gof.creational.abstractfactory;

import portfolio.designpattern.gof.creational.abstractfactory.abstractfactory.ArmorFactory;
import portfolio.designpattern.gof.creational.abstractfactory.abstractfactory.ItemFactory;
import portfolio.designpattern.gof.creational.abstractfactory.abstractfactory.WeaponFactory;

/**
 * 추상 팩토리 패턴
 * 다양한 구성 요소 별로 객체의 집합을 생성해야 할 때 유용한 패턴이다
 * 
 * 팩토리 메소드 패턴과 이름은 비슷해보이지만 사용하는 개념은 다르다
 * 팩토리 메소드 패턴이 객체를 생성하는 클래스 였다면
 * 추상 팩토리 패턴은 이름대로 그 생성하는 팩토리 자체를 추상화 했다고 보면된다.
 * 
 * 추상 팩토리 패턴에서 사용하는 객체
 * AbstractProduct : 생성할 대상 객체의 추상화 타입
 * ConcreteProduct : 생성할 대상 객체 (각 작업의 기능을 구현한 객체)
 * AbstractFactory : 각 작업의 Product를 생성 할 팩토리의 추상화 타입으로
 * 					 , 생성할 Product의 개수만큼의 생성함수를 가짐
 * ConcreteFactory : AbstractFactory를 구현하여 팩토리에 맞게 Product 생성을 담당 할 객체
 * 
 * 공장으로 비유하자면 공장에서 생산을 할 때 라인 작업을 생각해보자
 * 라인을 타고 작업물이 지나가는데 맨 앞사람부터 (작업1)->(작업2)->(작업3) 이런식으로
 * 라인 순서대로 각 파트에 맞는 작업을 진행 할것이다 (조립, 도색, 검사 등) 
 * 
 * 팩토리 메소드 패턴은 공장 라인에서 각 작업의 한 단위(작업1)로 보면 될 것이고
 * 추상팩토리 패턴은 각 작업 단위를 추상화하여 묶어놓은 라인 자체로 보면 된다.
 * 
 * 예제로 게임에서 아이템을 종류별(무기, 방어구)로 제작하는 것을
 * [재료확인 -> 제작 -> 완성] 단계로 진행을 가정하고 확인해보자
 */

public class AbstractFactoryClient {
	public static void main(String[] args) {
		ItemFactory itemFactory;
		
		itemFactory = new WeaponFactory();
		itemFactory.createItemMaterialProcess().materialCheck();
		itemFactory.createItemMakeProcess().make();
		
		itemFactory = new ArmorFactory();
		itemFactory.createItemMaterialProcess().materialCheck();
		itemFactory.createItemMakeProcess().make();
	}
}

/**
 * ItemFactory 라는 추상화 타입으로 공장을 추상화 하고 어떤 공장일지는 모르지만 
 * 추상화 타입의 함수인 createItemMaterialProcess(), createItemMakeProcess() 함수를 이용하여
 * 각 작업을 담당하는 객체를 생성하고 해당 객체에서 각각 처리를 진행한다.
 * 
 * 팩토리 메소드 패턴과 혼동될까봐 일부터 클라이언트 코드에는 넣지 않았지만
 * 위와 같은 메인 로직의 경우 팩토리 메소드 패턴과 같이 사용 할 수있다.
 * 
 * 런타임에서 값을 입력받아(무기, 방어구) 공장을 선택 한 후
 * 팩토리 메소드 패턴으로 무기공장, 방어구공장의 추상 팩토리 객체를 생성하여 사용하면
 * 어떤 추상 팩토리 객체(공장)일지는 모르지만 현재 객체에 맞는 작업을 각각 생성하여 처리 할 것이다.
 */