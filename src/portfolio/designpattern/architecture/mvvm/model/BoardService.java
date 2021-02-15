package portfolio.designpattern.architecture.mvvm.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardService {
	List<String> datas = new ArrayList<>(
		Arrays.asList(new String[] {
			"게시글1",
			"게시글2",
			"게시글3",
			"게시글4",
			"게시글5",
		})
	);
	
	public List<String> getData(){
		return datas; 
	}
	
	public void addData(String content) {
		datas.add(content);
	}
}
