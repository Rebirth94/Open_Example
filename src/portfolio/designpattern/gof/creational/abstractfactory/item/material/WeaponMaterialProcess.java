package portfolio.designpattern.gof.creational.abstractfactory.item.material;

public class WeaponMaterialProcess implements ItemMaterialProcess {

	@Override
	public void materialCheck() {
		System.out.println("무기 재료 확인");
	}
}
