package portfolio.designpattern.gof.creational.abstractfactory.abstractfactory;

import portfolio.designpattern.gof.creational.abstractfactory.item.make.ItemMakeProcess;
import portfolio.designpattern.gof.creational.abstractfactory.item.make.WeaponMakeProcess;
import portfolio.designpattern.gof.creational.abstractfactory.item.material.ItemMaterialProcess;
import portfolio.designpattern.gof.creational.abstractfactory.item.material.WeaponMaterialProcess;

public class WeaponFactory implements ItemFactory {
	@Override
	public ItemMaterialProcess createItemMaterialProcess() {
		return new WeaponMaterialProcess();
	}
	@Override
	public ItemMakeProcess createItemMakeProcess() {
		return new WeaponMakeProcess();
	}
}
