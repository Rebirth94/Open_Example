package portfolio.designpattern.gof.creational.abstractfactory.item.make;

public class ArmorMakeProcess implements ItemMakeProcess {
	@Override
	public void make() {
		System.out.println("방어구 제작");
	}
}
