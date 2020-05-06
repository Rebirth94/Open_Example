package portfolio.designpattern.gof.behavioral.observer.handler;

import java.util.Observable;

import portfolio.designpattern.gof.behavioral.observer.event.ObservablePull;

public class HandlerOne extends EventHandler {
	
	private final String name = "핸들러1";
	
	public HandlerOne(ObservablePull observable) {
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
