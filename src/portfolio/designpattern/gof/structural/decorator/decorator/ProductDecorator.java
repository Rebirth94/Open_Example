package portfolio.designpattern.gof.structural.decorator.decorator;

import portfolio.designpattern.gof.structural.decorator.component.Product;

abstract public class ProductDecorator implements Product {
	protected Product decoratorProduct;
	
	public ProductDecorator(Product decoratorProduct) {
		this.decoratorProduct = decoratorProduct;
	}
}
