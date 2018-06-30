package core.collections.warburton.commongotcha;

import java.util.ArrayList; // implements the List interface
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

	public static void main(String[] args) {

		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 25);
		Product window = new Product("Glass Window", 10);

		Collection<Product> productcontainer = new ArrayList<>();
		productcontainer.add(door);
		productcontainer.add(floorPanel);
		productcontainer.add(window);

		//we're iterating over our collection and we're modifying it at the same time...
		for (Product productiteration : productcontainer) {
			if (productiteration.getWeight() > 20) {
				System.out.println(productiteration);
			} else {
				productcontainer.remove(productiteration);
			}
		}
	}
}

// If you're looping over a collection with a for loop DO NOT MODIFY IT!
// If you want to remove an element, use an iterator, instead!