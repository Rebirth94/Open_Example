package portfolio.designpattern.gof.creational.singleton.lazy;

/* LazyDoubleCheckedLocking */
public class SingletonLazyDoubleCheckedLocking {
		
	private static SingletonLazyDoubleCheckedLocking instance;
	
	private SingletonLazyDoubleCheckedLocking(){}
	
	public static  SingletonLazyDoubleCheckedLocking getInstance() {
		if(instance == null) {
			synchronized (SingletonLazyDoubleCheckedLocking.class) {
				if(instance == null) {
					instance = new SingletonLazyDoubleCheckedLocking();
				}
			}
		}
		return instance;
	}
}
