package capacities;

import abstractClass.Capacity;
import abstractClass.Type;
import capacityType.CapacityType;
import types.Psychic;

public class Psy extends Capacity{
	private final static String name = "Psy";
	private final static int power = 90;
	private final static int precision = 100;
	private final static Type type = new Psychic();
	
	public Psy() {
		super(type, power, precision, CapacityType.Special);
	}

	@Override
	public String toString() {
		return name + "[power=" + power + ", precision=" + precision + ", type=" + type
				+ "]";
	}

	@Override
	public boolean hasStatus() {
		return false;
	}
}
