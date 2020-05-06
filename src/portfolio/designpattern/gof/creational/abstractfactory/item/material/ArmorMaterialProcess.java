package portfolio.designpattern.gof.creational.abstractfactory.item.material;

public class ArmorMaterialProcess implements ItemMaterialProcess {

	@Override
	public void materialCheck() {
		System.out.println("방어구 재료 확인");
	}

}
