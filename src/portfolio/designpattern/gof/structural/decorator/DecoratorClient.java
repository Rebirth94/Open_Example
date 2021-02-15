package portfolio.designpattern.gof.structural.decorator;

import portfolio.designpattern.gof.structural.decorator.component.Product;
import portfolio.designpattern.gof.structural.decorator.component.ProductA;
import portfolio.designpattern.gof.structural.decorator.decorator.SaleACardDecorator;
import portfolio.designpattern.gof.structural.decorator.decorator.SaleBCardDecorator;

/**
 * 데코레이터 패턴
 * 
 * Component :
 * ConcreteComponent :
 * Decorator :
 * ConcreteDecorator1 :
 * ConcreteDecorator2 :
 *   
 */

public class DecoratorClient {
	public static void main(String[] args) {
		Product product = new ProductA();
		product = new SaleACardDecorator(product);
		product = new SaleBCardDecorator(product);
		
		System.out.println("[" + product.getName() + "]");
		System.out.println(product.getDescription());
		System.out.println("최종금액 : " + product.getPrice() + "원");
	}
}
