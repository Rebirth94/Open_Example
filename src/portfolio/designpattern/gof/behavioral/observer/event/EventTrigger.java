package portfolio.designpattern.gof.behavioral.observer.event;

import java.util.Observable;
import java.util.Observer;

public class EventTrigger extends Observable implements ObservablePull {

	private int intValue = 0;

	public void init() {
		intValue = 0;
	}
	
	@Override
	protected synchronized void setChanged() {
		super.setChanged();
		System.out.println("값 변경 : " + intValue + "\n");
	}

	@Override
	public void notifyObservers(Object arg) {
		System.out.println("[옵저버 전체 알림]\n");
		super.notifyObservers(arg);
	}

	public void setIntPush(int value) {
		this.intValue = value;
		
		setChanged();
		notifyObservers(intValue);
	}

	public void setIntNotPush(int value) {
		this.intValue = value;
		setChanged();
	}
	
	@Override
	public void getDataPull(Observer o) {
		if(hasChanged() == true) {
			o.update(this, intValue);
		}
	}

}
