package portfolio.designpattern.architecture.mvp.domain;

import portfolio.designpattern.architecture.mvp.domain.PageContract.View;
import portfolio.designpattern.architecture.mvp.model.ModelLogin;
import portfolio.designpattern.architecture.mvp.model.ModelPost;
import portfolio.designpattern.architecture.mvp.model.ModelValidator;

public class PagePresenter implements PageContract.Presenter {
	
	private PageContract.View view;

	private ModelValidator modelValidator;
	private ModelLogin modelLogin;
	private ModelPost modelPost;
	
	private String tempSessionId = null;
	
	public PagePresenter(View view) {
		setView(view);
		this.modelValidator = new ModelValidator();
		this.modelLogin = new ModelLogin();
		this.modelPost = new ModelPost();
	}
	
	@Override
	public void setView(View view) {
		this.view = view;
	}


	@Override
	public void login(String loginId) {
		modelValidator.validate(loginId);
		modelLogin.login(loginId);
		
		tempSessionId = loginId;
		view.changeMemberView(loginId);
	}

	@Override
	public void logout() {
		tempSessionId = null;
		view.changeGeneralView();
	}

	@Override
	public void postShow() {
		view.changePostView( modelPost.getPostData() );
		
	}

	@Override
	public void postClose() {
		if(tempSessionId == null) {
			view.changeGeneralView();
		} else {
			view.changeMemberView(tempSessionId);
		}
	}


}
