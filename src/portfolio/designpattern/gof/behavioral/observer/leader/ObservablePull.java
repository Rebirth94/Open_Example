package portfolio.designpattern.gof.behavioral.observer.leader;

import java.util.Observer;

public interface ObservablePull {
	void addObserver(Observer o);
	void deleteObserver(Observer o);
	void getDataPull(Observer o);
	void getDataForcePull(Observer o);
}
