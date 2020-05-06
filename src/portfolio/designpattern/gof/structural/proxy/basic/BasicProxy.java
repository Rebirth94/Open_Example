package portfolio.designpattern.gof.structural.proxy.basic;

public class BasicProxy implements BasicProxySubject {

	private final BasicProxySubject subject;
	
	public BasicProxy(BasicProxySubject subject) {
		this.subject = subject;
	}
	
	@Override
	public void action() {
		subject.action();
	}

}
