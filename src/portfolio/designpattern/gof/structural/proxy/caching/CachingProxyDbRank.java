package portfolio.designpattern.gof.structural.proxy.caching;

import java.util.ArrayList;

public class CachingProxyDbRank implements CachingProxyRank {

	@Override
	public ArrayList<String> getRankList() {
		return selectRank();
	}
	
	// DAO객체를 통한 셀렉트 데이터
	private ArrayList<String> selectRank(){
		System.out.println("[실시간 데이터]");
		ArrayList<String> rankList = new ArrayList<>();
		rankList.add("플레이어1");
		rankList.add("플레이어2");
		rankList.add("플레이어3");
		rankList.add("플레이어4");
		rankList.add("플레이어5");
		return rankList;
	}
}
