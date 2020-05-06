package portfolio.designpattern.gof.behavioral.observer.handler;

import java.util.Observer;

import portfolio.designpattern.gof.behavioral.observer.event.ObservablePull;

public abstract class EventHandler implements Observer {
	
	ObservablePull observable;
	
	protected EventHandler(ObservablePull observable){
		setObservable(observable);
		observable.addObserver(this);
	}
	
	protected void setObservable(ObservablePull observable) {
		this.observable = observable;
	}
	
	protected ObservablePull getObservable() {
		return observable;
	}
	
	public void observableDataPull() {
		observable.getDataPull(this);
	}

	protected void printDataRequest(String name) {
		System.out.println(name + " 이(가) 데이터를 요청 하였습니다.\n");
	}
	
	protected void printDataResponse(String name, Object arg) {
		System.out.println(name + " 이(가) 데이터를 받았습니다.");
		System.out.println("받은 데이터 : " + arg + "\n");
	}

}
