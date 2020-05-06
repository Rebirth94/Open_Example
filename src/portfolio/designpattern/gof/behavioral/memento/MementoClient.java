package portfolio.designpattern.gof.behavioral.memento;

import portfolio.designpattern.gof.behavioral.memento.occupation.OriginatorOccupation;
import portfolio.designpattern.gof.behavioral.memento.occupation.OriginatorWarrior;
import portfolio.designpattern.gof.behavioral.memento.savedata.SaveDataCaretaker;

/**
 * 메멘토 패턴
 * 캡슐화를 유지하면서 객체를 이전 상태로 되돌리는 패턴이다.
 * 롤백이나, Undo 등에서 사용 할 수 있다.
 * 
 * 메멘토 패턴에서 사용되는 객체이다
 * Originator : 저장하려는 객체의 원본
 * Memento : 오리지네이터 데이터중 저장이 필요한 데이터의 상태를 캡슐화한 객체
 * Caretaker : 메멘토 객체를 저장한 데이터를 가지고 있는 저장 담당 객체
 * 
 * 
 * 예시로 게임에서 죽었을 경우 특정 체크포인트에서 부활하는 것으로 확인 해보자.
 * */

public class MementoClient {
	public static void main(String[] args) {
		OriginatorOccupation warrior = new OriginatorWarrior();
		
		SaveDataCaretaker caretaker = new SaveDataCaretaker();
		
		caretaker.showSaveDatas();
		
		System.out.println();
		caretaker.saveGame(1, warrior.createMement());
		System.out.println();
		caretaker.showSaveDatas();
		
	}
}
