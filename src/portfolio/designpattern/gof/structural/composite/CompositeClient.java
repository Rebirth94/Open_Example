package portfolio.designpattern.gof.structural.composite;

import portfolio.designpattern.gof.structural.composite.component.Unit;
import portfolio.designpattern.gof.structural.composite.component.UnitGroup;
import portfolio.designpattern.gof.structural.composite.component.Units;
import portfolio.designpattern.gof.structural.composite.unit.Archer;
import portfolio.designpattern.gof.structural.composite.unit.Warrior;
import portfolio.designpattern.gof.structural.composite.unit.Wizard;

/**
 * 컴포지트 패턴
 * 객체들의 관계를 트리 구조로 구성하여 부분-전체 계층을 표현하는 패턴
 * 사용자가 단일 객체와 복합 객체를 모두 동일하게 다루도록 하며
 * 동일한 기능의 복합 객체가 계층적으로 필요한 경우 사용된다.
 * 
 * 컴포지트 패턴에서는 Component 인터페이스를 두고
 * Leaf와 Composite를 구현하여 사용한다.
 * 
 * 각 역할을 간단히 정리하면
 * Component : 컴포넌트들의 추상화 타입
 * Leaf : 컴포넌트를 구현한 단일 객체
 * Composite : Leaf 구현체를 그룹화 한 복합 객체 
 * 
 * 일반적으로 파일관리를 예로 보면 간단하다
 * Leaf 객체를 파일 하나라고 생각하고
 * Composite 객체를 폴더 하나라고 생각하면 된다
 * 
 * 폴더 안에 파일이 여러개 있고, 그 중에는 폴더도 있을 수 있다
 * 폴더 안에 폴더가 있는 계층적 모양이 된다.
 * 
 * 게임에서 예로 들면 드래그로 여러 유닛을 선택한다고 가정해보자
 * 전제로는 이미 그룹화 되어있는 유닛 그룹도 드래그되면 선택된다.
 */

public class CompositeClient {
	public static void main(String[] args) {
		Units warrior1 = new Unit(new Warrior("유닛1"));
		Units warrior2 = new Unit(new Warrior("유닛2"));
		Units warrior3 = new Unit(new Warrior("유닛3"));
		
		Units wizard1 = new Unit(new Wizard("유닛1"));
		Units wizard2 = new Unit(new Wizard("유닛2"));
		Units wizard3 = new Unit(new Wizard("유닛3"));
		
		Units archer1 = new Unit(new Archer("유닛1"));
		Units archer2 = new Unit(new Archer("유닛2"));
		Units archer3 = new Unit(new Archer("유닛3"));
		
		UnitGroup group1 = new UnitGroup("팀1");
		group1.add(warrior1);
		group1.add(wizard1);
		group1.add(archer1);
		
		UnitGroup drag = new UnitGroup();
		drag.add(group1);
		drag.add(warrior2);
		drag.add(warrior3);
		drag.add(wizard2);
		drag.add(wizard3);
		drag.add(archer2);
		drag.add(archer3);
		
		drag.attack();
	}
}
