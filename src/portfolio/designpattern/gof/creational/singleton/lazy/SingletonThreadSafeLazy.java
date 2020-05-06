package portfolio.designpattern.gof.creational.singleton.lazy;

/* Thread-Safe Lazy */
public class SingletonThreadSafeLazy {
		
	private static SingletonThreadSafeLazy instance;
	
	private SingletonThreadSafeLazy(){}
	
	public static synchronized SingletonThreadSafeLazy getInstance() {
		if(instance == null) {
			instance = new SingletonThreadSafeLazy();
		}
		return instance;
	}
}
