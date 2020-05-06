package portfolio.designpattern.gof.behavioral.observer.handler;

import java.util.Observable;

import portfolio.designpattern.gof.behavioral.observer.event.ObservablePull;

public class HandlerTwo extends EventHandler {
	
	private final String name = "핸들러2";
	
	public HandlerTwo(ObservablePull observable) {
		super(observable);
	}

	@Override
	public void update(Observable o, Object arg) {
		printDataResponse(name, arg);
	}
	
	@Override
	public void observableDataPull() {
		printDataRequest(name);
		super.observableDataPull();
	}
}
