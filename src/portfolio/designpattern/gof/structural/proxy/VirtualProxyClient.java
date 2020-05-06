package portfolio.designpattern.gof.structural.proxy;

import portfolio.designpattern.gof.structural.proxy.basic.BasicProxy;
import portfolio.designpattern.gof.structural.proxy.basic.BasicProxyRealSubject;
import portfolio.designpattern.gof.structural.proxy.basic.BasicProxySubject;

/**
 * 가상 프록시 패턴
 * 
 * 게임을 로딩 하는데 자원을 다운로드 하는 동안
 * 화면을 업데이트 해야하는 경우로 확인 해보자
 * 
 */
public class VirtualProxyClient {
	public static void main(String[] args) {
		BasicProxySubject subject = new BasicProxy(new BasicProxyRealSubject());
		subject.action();	
	}
}
