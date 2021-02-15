package portfolio.designpattern.gof.structural.decorator.component;

public class ProductA implements Product {
	
	@Override
	public String getName() {
		return "제품A";
	}

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getDescription() {
		return "기본가(" +getPrice() + "원)";
	}
}
