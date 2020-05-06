package portfolio.designpattern.gof.structural.proxy;

import portfolio.designpattern.gof.structural.proxy.caching.CachingProxyCacheRank;
import portfolio.designpattern.gof.structural.proxy.caching.CachingProxyDbRank;
import portfolio.designpattern.gof.structural.proxy.caching.CachingProxyRank;

/**
 * 캐싱 프록시 패턴
 * 
 * 
 * 게임의 랭킹을 캐싱하여 보여주는 예제
 * 1분동안 캐싱된 데이터를 보여주고,
 * 1분이 지나면 다시 DB의 데이터를 로드한다고 가정
 * (가정은 1분이지만 설정은 1000밀리초로 확인)
 */
public class CachingProxyClient {
	public static void main(String[] args) {
		CachingProxyRank rank = new CachingProxyCacheRank(new CachingProxyDbRank());
		
		printCachingProxyCase(rank);
		printCachingProxyCase(rank);
		
		try {
			Thread.sleep(1100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		printCachingProxyCase(rank);
	}

	// 캐싱 프록시 출력
	private static void printCachingProxyCase(CachingProxyRank rank) {
		int rankCount = 1;
		for(String player : rank.getRankList()) {
			System.out.println(rankCount++ + "위 " + player);
		}
		System.out.println();
	}
}
