package designpatterns.creational.singleton;

public class SingletonInstantiator {

	public SingletonInstantiator() {
		Singleton instance = Singleton.getInstance();
		Singleton anotherInstance = new Singleton();
		Singleton andAnotherInstance = new Singleton();
	}

	public static void main(String[] args) {
		System.out.println("We are in the SingletonIstantiator class.");
	}


}