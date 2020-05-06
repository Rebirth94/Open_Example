package portfolio.designpattern.gof.creational.singleton.basic;

/* Basic */
public class SingletonBasic {
		
	private static final SingletonBasic instance = new SingletonBasic();
	
	private SingletonBasic(){}
	
	public static SingletonBasic getInstance() {
		return instance;
	}
}
