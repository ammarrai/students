package testing.warburton.cafe.tests;

import org.junit.Assert;
import org.junit.Test;

import testing.warburton.cafe.Cafe;
import testing.warburton.cafe.Coffee;
import testing.warburton.cafe.CoffeeType;

public class CafeTest {

	@Test
	public void canBrewEspresso() {

		// given clause
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);

		// when clause
		Coffee coffee = cafe.brew(CoffeeType.Espresso);

		// then clause
		Assert.assertEquals(CoffeeType.Espresso, coffee.getType()); // make sure
																	// it is an
																	// Espresso!
		Assert.assertEquals(0, coffee.getMilk()); // no milk; expected value vs
													// actual
		Assert.assertEquals(7, coffee.getBeans());
	}

	@Test
	public void brewingEspressoConsumesBeans() {

		// given

		Cafe cafe = new Cafe();
		cafe.restockBeans(7);

		// when
		Coffee coffee = cafe.brew(CoffeeType.Espresso);

		// then
		Assert.assertEquals(1, cafe.getBeansInStock());

	}

	// then
	@Test(expected = IllegalStateException.class)
	
	public void latteRequiresMilk() {

		// given
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);

		// when

		cafe.brew(CoffeeType.Latte);
	}
}
