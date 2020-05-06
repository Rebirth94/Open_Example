package portfolio.designpattern.gof.creational.abstractfactory.abstractfactory;

import portfolio.designpattern.gof.creational.abstractfactory.item.make.ArmorMakeProcess;
import portfolio.designpattern.gof.creational.abstractfactory.item.make.ItemMakeProcess;
import portfolio.designpattern.gof.creational.abstractfactory.item.material.ArmorMaterialProcess;
import portfolio.designpattern.gof.creational.abstractfactory.item.material.ItemMaterialProcess;

public class ArmorFactory implements ItemFactory {
	@Override
	public ItemMaterialProcess createItemMaterialProcess() {
		return new ArmorMaterialProcess();
	}
	@Override
	public ItemMakeProcess createItemMakeProcess() {
		return new ArmorMakeProcess();
	}
}
