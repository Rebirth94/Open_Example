package portfolio.designpattern.gof.creational.abstractfactory.abstractfactory;

import portfolio.designpattern.gof.creational.abstractfactory.item.make.ItemMakeProcess;
import portfolio.designpattern.gof.creational.abstractfactory.item.material.ItemMaterialProcess;

// AbstractFactory
public interface ItemFactory {
	ItemMaterialProcess createItemMaterialProcess();
	ItemMakeProcess createItemMakeProcess();
}
