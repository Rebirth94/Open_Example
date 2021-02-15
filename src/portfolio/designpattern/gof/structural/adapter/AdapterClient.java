package portfolio.designpattern.gof.structural.adapter;

import portfolio.designpattern.gof.structural.adapter.adaptee.acompany.ACompanyWarrior;
import portfolio.designpattern.gof.structural.adapter.adaptee.bcompany.BCompanyWarrior;
import portfolio.designpattern.gof.structural.adapter.adapter.ACompanyAdapter;
import portfolio.designpattern.gof.structural.adapter.adapter.AvatarAction;
import portfolio.designpattern.gof.structural.adapter.adapter.BCompanyAdapter;
import portfolio.designpattern.gof.structural.adapter.classadapter.AWarriorAdapter;
import portfolio.designpattern.gof.structural.adapter.classadapter.BWarriorAdapter;

/**
 * 어댑터 패턴
 * 한 클래스의 인터페이스를 사용자가 기대하는 다른 인터페이스로 변환하여
 * 호환성 없는 인터페이스 때문에 같이 동작 할 수 없는 클래스들을 호환시켜준다.
 * 어댑터라는 뜻이 변환기와 같은 의미로 일상에서는 전원 단자나 콘센트 등으로 흔히 볼 수있다.
 * 
 * 어댑터 패턴에서 사용하는 객체이다
 * Adaptee : 변환이 필요한 객체 
 * Target : 사용자가 필요한 인터페이스
 * Adapter : Adaptee객체를 Target인터페이스에 맞게 변환하는 객체
 * 
 * 어댑터 패턴의 구현 방법에는
 * 클래스 어댑터와 오브젝트 어댑터 2가지 방법이 있다.
 * 
 * 클래스 어댑터
 * 상속을 이용한 방법으로 어댑터 객체를 따로 구현 할 필요가 없어지지만
 * 코드가 유연하지 못하고 다중상속을 해야하기때문에
 * 다중상속을 지원하지 않는 자바에서는 사용하기 어려움(편법으로 가능은 하다...)
 * 
 * 오브젝트 어댑터
 * 어댑터 객체를 만들어서 인터페이스를 통일 하는 방법으로
 * 상속 대신 생성자로 대상 객체를 받아서 
 * 클래스 어댑터와 비교 했을 때 어댑터를 별도로 구현하는것을 제외하면 더 나은 방법이다.
 * 특히나 자바에서는 다중상속 불가로 상속이 정말 필요한게 아니라면
 * 가능한 인터페이스 구현으로 처리하는게 추천된다.
 * 
 * 게임 예시로 A회사와 B회사 캐릭터를 놓고 동일한 기능의 인터페이스가 다른경우을 보자
 * 보통 같은 사내에서는 거의 없으나 타 업체와 인수,합병 되는 경우 가능성은 있다 (예시일 뿐이다)
 */

public class AdapterClient {
	public static void main(String[] args) {
		AvatarAction action;
		
		System.out.println("*****오브젝트 어댑터*****");
		action = new ACompanyAdapter(new ACompanyWarrior());
		action.attack();
		
		action = new BCompanyAdapter(new BCompanyWarrior());
		action.attack();
		
		System.out.println();
		
		System.out.println("*****클래스 어댑터*****");
		action = new AWarriorAdapter();
		action.move();
		
		action = new BWarriorAdapter();
		action.move();
	}
}
