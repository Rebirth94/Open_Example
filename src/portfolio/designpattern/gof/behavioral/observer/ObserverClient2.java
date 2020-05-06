package portfolio.designpattern.gof.behavioral.observer;

import portfolio.designpattern.gof.behavioral.observer.event.EventTrigger;
import portfolio.designpattern.gof.behavioral.observer.handler.HandlerOne;
import portfolio.designpattern.gof.behavioral.observer.handler.HandlerThree;
import portfolio.designpattern.gof.behavioral.observer.handler.HandlerTwo;

public class ObserverClient2 {
	private static EventTrigger trigger = new EventTrigger();
	
	private static HandlerOne hOne = new HandlerOne(trigger);
	private static HandlerTwo hTwo = new HandlerTwo(trigger);
	private static HandlerThree hThree = new HandlerThree(trigger);
	
	public static void main(String[] args) {
//		pushCase();
		pullCase();
//		pushAndPullCaseOne();
//		pushAndPullCaseTwo();
	}
	
	@SuppressWarnings("unused")
	private static void pushCase() {
		trigger.init();
		
		trigger.setIntPush(1);
		trigger.setIntPush(5);
	}

	@SuppressWarnings("unused")
	private static void pullCase() {
		trigger.init();
		
		trigger.setIntNotPush(1);
		trigger.setIntNotPush(2);
		trigger.setIntNotPush(5);
		
		hTwo.observableDataPull();
	}

	@SuppressWarnings("unused")
	private static void pushAndPullCaseOne() {
		trigger.init();
		
		trigger.setIntPush(1);

		hOne.observableDataPull();
		hOne.observableDataPull();
		hTwo.observableDataPull();
		hThree.observableDataPull();
	}

	@SuppressWarnings("unused")
	private static void pushAndPullCaseTwo() {
		trigger.init();
		
		trigger.setIntPush(1);

		hOne.observableDataPull();
		hOne.observableDataPull();

		trigger.setIntNotPush(5);

		hOne.observableDataPull();
	}
}
