package portfolio.designpattern.gof.structural.proxy.caching;

import java.util.ArrayList;

public class CachingProxyCacheRank implements CachingProxyRank {

	private final CachingProxyRank dbRank;		
	private ArrayList<String> cacheRank = new ArrayList<>();
	
	private boolean isUseCache = false;
	private final int cachingTimerMillis = 1000;
	
	public CachingProxyCacheRank(CachingProxyRank dbRank) {
		this.dbRank = dbRank;
	}
	
	public boolean isUseCache() {
		return isUseCache;
	}

	public void setUseCache(boolean isUseCache) {
		this.isUseCache = isUseCache;
	}

	@Override
	public ArrayList<String> getRankList() {
		if(isUseCache() == true) {
			System.out.println("[캐싱 데이터]");
			return cacheRank;
		} else {
			cacheRank = dbRank.getRankList();
			getCachingTimer().start();
			return cacheRank;
		}
	}
	
	private Thread getCachingTimer() {
		Thread cachingTimer = new Thread(new Runnable() {
			@Override
			public void run() {
				setUseCache(true);
				try {
					Thread.sleep(cachingTimerMillis);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					setUseCache(false);
				}
			}
		});
		
		cachingTimer.setDaemon(true);	// 메인 쓰레드 종료시 같이 종료
		return cachingTimer;
	}
}
