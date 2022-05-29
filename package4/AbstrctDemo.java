package package4;

public class AbstrctDemo {
	
	public static void main(String[] args) {
//		Car a = new Car();
//		Black b = new Black();
//		a.m1();
//		a.m2();
//		b.m5();
		
		
		//Tight coupling
		Catch c = new Catch();
		System.out.println(c.x);
		System.out.println(c.y);
		
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m6();
		
		System.out.println();
		Duck d = new Duck();
		d.m5();
		
		System.out.println();
		Flag f = new Flag();
		f.m1();
		f.m2();
		f.m3();
		f.m4();
		
		System.out.println();
		// Loose coupling - easy to test application
		Car c1 = new Catch();
		//Car c1 = new Jam();
		
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		//c1.m6();
		
		// access both child class and parent class method
		Catch c2 = new Catch();
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4();
		c2.m6();
		
		System.out.println();
	//Interface - Loose Coupling
		//Dog aa = new Cat();
		Dog aa = new Black1();
		System.out.println(aa.a);
		System.out.println(aa.b);
		aa.m1();
		aa.m2();
		aa.m3();
		
		System.out.println();
		// Access interface static members
		System.out.println(Dog.a);
		System.out.println(Dog.b);
		Dog.m4();
		
		
		// Access default method
		aa.m5();
		
		

	}

}


//Notes
/*
 * Abstraction: Hiding implementation and giving functionalities
 * 
 * Abstract class - 0- 100% abstraction
 * Interface - 100% abstraction
 * 
 *  Abstract classes can't be instantiated 
 */