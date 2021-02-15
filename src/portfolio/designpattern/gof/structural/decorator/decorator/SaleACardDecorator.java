package portfolio.designpattern.gof.structural.decorator.decorator;

import portfolio.designpattern.gof.structural.decorator.component.Product;

public class SaleACardDecorator extends ProductDecorator {

	public SaleACardDecorator(Product decoratorProduct) {
		super(decoratorProduct);
	}

	@Override
	public String getName() {
		return decoratorProduct.getName();
	}
	
	@Override
	public int getPrice() {
		return decoratorProduct.getPrice() - 200;
	}

	@Override
	public String getDescription() {
		return decoratorProduct.getDescription() + " + 200원 할인";
	}

}
