package portfolio.designpattern.gof.structural.adapter.adaptee.bcompany;

public class BCompanyArcher implements BCompanyAction {

	@Override
	public void offense() {
		System.out.println("B업체 궁수 활쏘기");
		
	}

	@Override
	public void run() {
		System.out.println("B업체 궁수 이동");
		
	}
}
