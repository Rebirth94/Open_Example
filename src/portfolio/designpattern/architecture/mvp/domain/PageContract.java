package portfolio.designpattern.architecture.mvp.domain;

public interface PageContract {
	interface View {
		void changeGeneralView();
		void changeMemberView(String loginId);
		void changePostView(String content);
	}
	
	interface Presenter {
		void setView(PageContract.View view);
		
		void login(String loginId);
		void logout();
		void postShow();
		void postClose();
	}
}
