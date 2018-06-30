package core.collections.warburton.commongotcha;

public class Product {

	private final String name;
	private final int weight;
	
	//constructors
	public Product (String name, int weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	//getters & setters
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	
	
	//toString
	@Override
	public String toString()
	{
		return "Product{" +
	"name='" + name + '\'' +
	",weight=" + weight +
	'}';
	}
	
	
}
