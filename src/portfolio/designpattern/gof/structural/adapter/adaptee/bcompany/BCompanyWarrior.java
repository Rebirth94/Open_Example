package portfolio.designpattern.gof.structural.adapter.adaptee.bcompany;

public class BCompanyWarrior implements BCompanyAction {

	@Override
	public void offense() {
		System.out.println("B업체 전사 공격");
		
	}

	@Override
	public void run() {
		System.out.println("B업체 전사 이동");
		
	}
}
