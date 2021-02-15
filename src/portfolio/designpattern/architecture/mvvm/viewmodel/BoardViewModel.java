package portfolio.designpattern.architecture.mvvm.viewmodel;

import java.util.List;
import java.util.Observable;

import portfolio.designpattern.architecture.mvvm.model.BoardService;

public class BoardViewModel extends Observable {
	private static final BoardViewModel instance = new BoardViewModel();
	public static BoardViewModel getInstance() {
		return BoardViewModel.instance;
	}
	
	private BoardService boardService = new BoardService();
	
	public List<String> getData(){
		return boardService.getData();
	}

	public void postData(String content) {
		boardService.addData(content);
		setChanged();
		notifyObservers();
	}

}
