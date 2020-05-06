package portfolio.designpattern.gof.structural.proxy;

import portfolio.designpattern.gof.structural.proxy.basic.BasicProxy;
import portfolio.designpattern.gof.structural.proxy.basic.BasicProxyRealSubject;
import portfolio.designpattern.gof.structural.proxy.basic.BasicProxySubject;

/**
 * 프록시 패턴
 * 
 * 프록시 패턴에서 사용하는 객체
 * Subject : 사용할 원본 객체의 인터페이스
 * RealSubject : 사용할 원본 객체
 * Proxy : Subject 인터페이스를 구현하며 RealSubject를 참조하여 이용한다.
 * 
 */
public class BasicProxyClient {
	public static void main(String[] args) {
		BasicProxySubject subject = new BasicProxy(new BasicProxyRealSubject());
		subject.action();
	}
}
