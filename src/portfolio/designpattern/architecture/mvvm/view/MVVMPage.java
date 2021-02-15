package portfolio.designpattern.architecture.mvvm.view;

public interface MVVMPage {
	public void view();
	
	default void refreshPage() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
	}
}
