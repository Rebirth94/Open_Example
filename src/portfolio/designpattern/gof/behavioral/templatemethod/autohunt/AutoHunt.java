package portfolio.designpattern.gof.behavioral.templatemethod.autohunt;

abstract public class AutoHunt {
	protected final String name;
	
	protected AutoHunt(String name) {
		this.name = name;
	}
	
	public final void autoHunting() {
		setCombatMode();
		battleFormExecution();
		setDisableCombatMode();
	}
	
	private void setCombatMode() {
		System.out.println(name + " 이(가) 전투모드로 변경 하였습니다.");
	}
	
	abstract protected void battleFormExecution();
	
	private void setDisableCombatMode() {
		System.out.println(name + " 이(가) 전투모드를 해제 하였습니다.");
	}
}
