package OOps;

interface InterfaceAbstract {
	
	void printInfo() ;
	default void printInfo1() {
		System.out.println("Printing from Interface!");
	}
	
}

abstract class B implements InterfaceAbstract{
	int value = 100;
	
	@Override
	public void printInfo() {
		System.out.println("Printing from abstract class");
	}
	
}

class C extends B{
	C(){
		super.printInfo();
	}
	int value = 200;
	public void printInfo() {
		System.out.println("Printing from class " + super.value);
	}
}
