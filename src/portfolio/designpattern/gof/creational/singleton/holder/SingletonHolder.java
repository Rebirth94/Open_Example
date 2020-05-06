package portfolio.designpattern.gof.creational.singleton.holder;

/* Holder */
public class SingletonHolder {
		
	private SingletonHolder(){}
	
	private static class SingletonHolderInner{
		private static final SingletonHolder instance = new SingletonHolder();
	}
	
	public static SingletonHolder getInstance() {
		return SingletonHolderInner.instance;
	}
}
