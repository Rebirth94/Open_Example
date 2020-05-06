package portfolio.designpattern.gof.behavioral.observer.member;

import java.util.Observable;

import portfolio.designpattern.gof.behavioral.observer.leader.ObservablePull;

public class TeamMemberThree extends TeamMember {
	
	private final String name = "팀원3";
	
	public TeamMemberThree(ObservablePull observable) {
		super(observable);
	}

	@Override
	public void update(Observable o, Object arg) {
		super.printDataResponse(name, arg);
	}

	@Override
	public void observableDataPull() {
		printDataRequest(name);
		super.observableDataPull();
	}
	
}
