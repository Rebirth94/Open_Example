package portfolio.designpattern.gof.structural.adapter.adaptee.acompany;

public class ACompanyArcher implements ACompanyAction {

	@Override
	public void attacking() {
		System.out.println("A업체 궁수 활쏘기");
	}

	@Override
	public void moving() {
		System.out.println("A업체 궁수 이동");
	}
}
