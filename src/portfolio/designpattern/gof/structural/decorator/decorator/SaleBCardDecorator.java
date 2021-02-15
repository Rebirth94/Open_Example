package portfolio.designpattern.gof.structural.decorator.decorator;

import portfolio.designpattern.gof.structural.decorator.component.Product;

public class SaleBCardDecorator extends ProductDecorator {

	public SaleBCardDecorator(Product decoratorProduct) {
		super(decoratorProduct);
	}

	@Override
	public String getName() {
		return decoratorProduct.getName();
	}
	
	@Override
	public int getPrice() {
		return decoratorProduct.getPrice() - 300;
	}

	@Override
	public String getDescription() {
		return decoratorProduct.getDescription() + " + 300원 할인";
	}

}
