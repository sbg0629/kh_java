package Chapter07_Generic;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트 TV");
		
		Tv tv =product1.getKind(); //new tv()
		System.out.println(tv);
		
		String modle = product1.getModel(); //스마트Tv
		System.out.println(modle);
		
		Product<Car,String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		Car car = product2.getKind(); //new Car
		System.out.println(car);
		
		product2.setModel("디젤");
		String carmodel = product2.getModel(); //new Car
		System.out.println(carmodel);
	}
}
