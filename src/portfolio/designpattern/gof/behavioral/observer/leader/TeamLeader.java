package portfolio.designpattern.gof.behavioral.observer.leader;

import java.util.Observable;
import java.util.Observer;

public class TeamLeader extends Observable implements ObservablePull {

	private int enemyCount;
	
	public TeamLeader() {
		this.enemyCount = 10;
	}
	
	@Override
	protected synchronized void setChanged() {
		super.setChanged();
		System.out.println("적군 수 : " + this.enemyCount + "\n");
	}

	@Override
	public void notifyObservers(Object arg) {
		System.out.println("리더 명령 : "+ arg +"\n");
		super.notifyObservers(arg);
	}

	public void attack() {
		setChanged();
		notifyObservers("공격 명령");
	}

	public void killEnemy() {
		this.enemyCount = this.enemyCount-1;
		System.out.println("[적군 한 명 사살됨]");
		setChanged();
	}
	
	@Override
	public void getDataPull(Observer o) {
		if(hasChanged() == true) {
			getDataForcePull(o);
		}
	}

	@Override
	public void getDataForcePull(Observer o) {
		o.update(this, "남은 적군 수 " + enemyCount);
	}

}
