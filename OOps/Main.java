package OOps;

public class Main {

	public static void main(String[] args) {

		
		Bank b = new Bank();
		b.customerPin();
		b.printInfo();

		
		C c = new C();
		c.printInfo();
		c.printInfo1();

		Child ex = new Child();
		ex.printInfo();

		InterfaceExampleVehicle v = new Car("BMW", "1000", 35000);
		System.out.println(v.getBrand());

		Circle c = new Circle();
		c.draw();
		c.completedraw();

	}

}
