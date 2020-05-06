package portfolio.designpattern.gof.behavioral.observer;

import portfolio.designpattern.gof.behavioral.observer.leader.TeamLeader;
import portfolio.designpattern.gof.behavioral.observer.member.TeamMember;
import portfolio.designpattern.gof.behavioral.observer.member.TeamMemberOne;
import portfolio.designpattern.gof.behavioral.observer.member.TeamMemberThree;
import portfolio.designpattern.gof.behavioral.observer.member.TeamMemberTwo;

/**
 * 감시자 패턴 (Observer)
 *  
 */

public class ObserverClient {
	private static TeamLeader leader = new TeamLeader();
	
	private static TeamMember mOne = new TeamMemberOne(leader);
	private static TeamMember mTwo = new TeamMemberTwo(leader);
	private static TeamMember mThree = new TeamMemberThree(leader);
	
	public static void main(String[] args) {
		leader.attack();
		leader.killEnemy();
		mOne.observableDataPull();
	}

	
	
}
