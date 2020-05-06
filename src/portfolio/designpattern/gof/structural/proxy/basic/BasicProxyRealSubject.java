package portfolio.designpattern.gof.structural.proxy.basic;

public class BasicProxyRealSubject implements BasicProxySubject {

	@Override
	public void action() {
		System.out.println("객체 동작");
	}

}
