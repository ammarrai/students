package designpatterns.behavioral.observer;

public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(300.00);
		stockGrabber.setGOOGPrice(600.00);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(502.00);
		stockGrabber.setAAPLPrice(407.00);
		stockGrabber.setGOOGPrice(855.00);
		
		stockGrabber.unregister(observer1);
}
}
