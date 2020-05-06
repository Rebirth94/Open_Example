package portfolio.designpattern.gof.creational.singleton;

import portfolio.designpattern.gof.creational.singleton.basic.SingletonBasic;
import portfolio.designpattern.gof.creational.singleton.holder.SingletonHolder;
import portfolio.designpattern.gof.creational.singleton.lazy.SingletonLazyDoubleCheckedLocking;
import portfolio.designpattern.gof.creational.singleton.lazy.SingletonLazyInitialization;
import portfolio.designpattern.gof.creational.singleton.lazy.SingletonThreadSafeLazy;

/**
 * 싱글톤 패턴
 * 객체가 유일해야 할 때 사용하는 패턴으로 (프로그램 전역에서 공통적으로 사용하는 등)
 * 인스턴스가 유일하도록 최초 1회 객체를 생성하고 생성자 접근제한자를 private로 객체 생성을 막는다
 * 객체에 접근 하려면 생성이 아닌 1개 뿐인 인스턴스를 가져와서 접근해야 한다.
 * 
 * 싱글톤 패턴에서 사용되는 객체
 * Singleton : 패턴에 사용되는 인스턴스가 1개뿐인 자신 객체
 * 
 * 싱글톤 생성 방식은 몇 가지가 존재한다
 * 각 방식마다 단점을 보완하기 위해 여러차례 개선된 방식이 있으며
 * 최종적으로는 Holder 방식이나 Enum을 이용한 생성을 주로 사용한다.
 * 
 * 기본 방식 (Basic)
 * 가장 기본적인 모습으로 JVM 구동과 동시에 인스턴스를 생성한다
 * 클래스 로더에 의해 처음부터 생성되며 종료시까지 메모리에 고정으로 할당된다.
 * 장점 : 초기 생성으로 Thread-Safe 하다.
 * 단점 : 무조건 시작부터 생성하므로 사용하지 않더라도 메모리를 사용하며
 * 		 , 생성 비용이 크다면 최초 로딩시에(재시작 마다) 부하가 걸릴 수도 있다.
 * 
 * 늦은 초기화 방식 (Lazy)
 * 기본 방식의 단점을 보완하기 위해 사용하는 방식으로
 * 처음부터 객체를 생성하지 않고 필요할 때 최초 1회에 한하여 인스턴스를 생성하는 방식이다.
 * 장점 : 필요할 때 생성하므로 기본 방식의 단점을 보완했다.
 * 단점 : 런타임중에 인스턴스를 생성하는데 최초 생성시 멀티쓰레드에서 동시 접근이 가능하여
 * 		  기본 방식의 장점인 Thread-Safe가 깨지고 인스턴스가 2개 이상이 될 수 있다.
 * 
 * 쓰레드에 안전한 늦은 초기화 방식 (Thread-Safe Lazy)
 * 늦은 초기화 방식의 장점을 유지하고 단점을 보완하기 위해 나온 방식으로
 * getInstance() 함수에 synchronized 키워드로 동기화 처리하여 멀티쓰레드 환경에서 동시접근을 제한한다.
 * 장점 : 멀티쓰레드의 동시접근이 불가능하여 Thread-Safe 하게되었다
 * 단점 : synchronized의 동작 특성상 lock, unlock 처리로 동기화하여 동시접근을 제한하므로
 * 		 , 여러 쓰레드가 접근을 요청하면 대기시간이 길어져 성능이 저하된다.
 * 
 * 더블 체크 방식 (Lazy Double Checked Locking)
 * 기존 Lazy 방식들의 단점을 모두 보완하기위해 나온 방식으로
 * Thread-Safe를 위한 synchronized 키워드 동작 이전에 인스턴스 null 체크를 한 번 더 하여
 * 최초 생성시에만 synchronized 키워드가 사용 되도록 하여 다른 방식의 단점을 모두 보완한 방식
 * 
 * 홀더 방식 (Holder)
 * 늦은 초기화 방식의 장점을 유지하면서 holder라는 inner class를 이용하여
 * 단점인 Thread-Safe한 생성의 책임을 클래스 로더(JVM)에 맡기는 방식이다.
 * 동작 원리는 내부(inner)클래스는 최초 로딩시가 아닌
 * 런타임중 처음 참조가 일어나는 순간에 인스턴스를 생성 한다고 한다.
 * 더블 체크 방식보다 간결한 코드로 단점을 해결하여 많이 사용한다.
 * 
 * 추가로 자바에서는 일반적인 클래스 이외에 지원하는 타입중에
 * 열거형 상수를 생성 할 때 사용하는 Enum 이라는 타입이 있는데
 * Enum은 특성 자체가 싱글톤 객체로서 생성된다.
 */

public class SingletonClient {
	public static void main(String[] args) {
		 System.out.println(SingletonBasic.getInstance());
		 System.out.println(SingletonLazyInitialization.getInstance());
		 System.out.println(SingletonThreadSafeLazy.getInstance());
		 System.out.println(SingletonLazyDoubleCheckedLocking.getInstance());
		 System.out.println(SingletonHolder.getInstance());
	}
}
