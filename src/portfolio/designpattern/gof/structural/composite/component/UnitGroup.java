package portfolio.designpattern.gof.structural.composite.component;

import java.util.ArrayList;

// Composite
public class UnitGroup implements Units{
	private final String groupName;
	private ArrayList<Units> units = new ArrayList<>();
	
	public UnitGroup() {
		this.groupName = null;
	}
	
	public UnitGroup(String groupName) {
		this.groupName = groupName;
	}
	
	@Override
	public void attack() {
		for(Units unit : this.units) {
			if(groupName != null) {
				System.out.print("[" + groupName + "]의 ");
			}
			unit.attack();
		}
	}
	
	public void add(Units units) {
		this.units.add(units);
	}
	
	public void remove(Units unitsObj) {
		this.units.remove(unitsObj);
	}
	
	public Units getChild(int index) {
		return this.units.get(index);
	}
	
	public int getCount() {
		return this.units.size();
	}
}
