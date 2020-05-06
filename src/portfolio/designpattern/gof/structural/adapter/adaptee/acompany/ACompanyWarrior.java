package portfolio.designpattern.gof.structural.adapter.adaptee.acompany;

public class ACompanyWarrior implements ACompanyAction {
	
	@Override
	public void attacking() {
		System.out.println("A업체 전사 공격");
	}

	@Override
	public void moving() {
		System.out.println("A업체 전사 이동");
	}
}
