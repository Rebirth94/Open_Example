package portfolio.designpattern.gof.behavioral.observer.member;

import java.util.Observer;

import portfolio.designpattern.gof.behavioral.observer.leader.ObservablePull;

public abstract class TeamMember implements Observer {
	
	ObservablePull observable;
	
	protected TeamMember(ObservablePull observable){
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
		System.out.println(name + " 이(가) 남은 적군 수를 확인하고 싶어합니다.\n");
	}
	
	protected void printDataResponse(String name, Object arg) {
		System.out.println(name + " 이(가) 데이터를 받았습니다.");
		System.out.println("받은 데이터 : " + arg + "\n");
	}

}
