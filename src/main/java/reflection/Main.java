package reflection;

import reflection.olives.Olive;
import reflection.olives.OliveName;

public class Main {

	public static void main(String[] args) {
		Olive o = new Olive(OliveName.PICHOLINE, 0x00FF00);

		Class<?> c = o.getClass();
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
	}

}
