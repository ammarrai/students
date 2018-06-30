package core.collections.warburton;

import java.util.ArrayList; // implements the List interface
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

	public static void main(String[] args) {

		Product door = new Product("Wooden Door", 35);
		Product floorPanel = new Product("Floor Panel", 25);
		Product window = new Product("Glass Window", 10);

		// 1. let's create an ArrayList of type "Product"
		Collection<Product> products = new ArrayList<>();

		// 2. Now let's add our objects into our products collection!
		products.add(door);
		products.add(floorPanel);
		products.add(window);

		System.out.println("*** a simple printing out of our collection ***");
		System.out.println(products);
		System.out.println("----------------------------------");

		// 3. ArrayList implements a toString method that will list our objects
		// in
		// turn.

		System.out.println("*** Let's print them out each in turn now! ***");
		final Iterator<Product> productIterator = products.iterator();
		while (productIterator.hasNext()) // does it have another value?
		{
			Product product = productIterator.next();
			System.out.println(product);

		}
		System.out.println("-------------------------------");

		System.out.println("***4. However, a for each loop is more suited to iterate over things ***");
		for (Product product : products)
			System.out.println(product);
		System.out.println("---------------------------------------");

		System.out.println(
				"***5. one thing we can do with an iterator, that we can't do with a for each loop! we can remove elements with an iterator, i.e");

		final Iterator<Product> secondProductIterator = products.iterator();
		while (secondProductIterator.hasNext()) {
			Product product = secondProductIterator.next();
			if (product.getWeight() > 20) {
				System.out.println(product);
			} else {
				secondProductIterator.remove(); // remove product from
												// collection if weight is less
												// than 20kg
			}

		}
		System.out.println();
		System.out.println(products);
		System.out.println();
		System.out.println("*** 6. let's try some other methods on the collection...***");
		System.out.println(products.size());
		System.out.println(products.isEmpty());
		System.out.println(products.contains(window)); // it was removed, remember?
		System.out.println(products.contains(door)); // yup. still there.
		
		Collection<Product> otherProducts = new ArrayList<>();
		otherProducts.add(window);
		otherProducts.add(door);
		products.removeAll(otherProducts); // read as: remove products FROM otherProducts collection 
		products.remove(window);
		
		System.out.println(products); // only the floorpanel is now left.
	}
}
