package portfolio.designpattern.gof.behavioral.memento.savedata;

public class SaveDataCaretaker {

	private SaveDataMemento[] saveDatas = new SaveDataMemento[5];
	
	public SaveDataMemento loadGame(int saveSlotIndex) {
		return saveDatas[saveSlotIndex];
	}
	
	public void saveGame(int saveSlotIndex, SaveDataMemento saveMemento) {
		this.saveDatas[saveSlotIndex-1] = saveMemento;
		System.out.println(saveSlotIndex + "번 슬롯에 게임이 저장되었습니다.");
	}
	
	public void showSaveDatas() {
		System.out.println("[세이브 데이터]");
		String msg = null;
		int saveSlotIndex = 1;
		for(SaveDataMemento saveData : saveDatas) {
			System.out.print(saveSlotIndex + "번 슬롯 : ");
			msg = (saveData == null) ? "저장 데이터 없음" : saveData.toString();
			System.out.println(msg);
			saveSlotIndex++;
		}
	}
	
}