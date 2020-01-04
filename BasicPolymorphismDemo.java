/*
	Johan Pena
	1-04-2020
	Basic Polymorphism Demo
*/

public class BasicPolymorphismDemo
{
	public static void main(String[] args)
	{
		/*
			Declare BasicPolymorphismInterface reference variable.
			The variable will call the different versions of the print method
		*/
		BasicPolymorphismInterface reference;

		// Print Class A
		reference = new A();
		reference.Print();

		// Print Class B
		reference = new B();
		reference.Print();

		// Print Class C
		reference = new C();
		reference.Print();
	}
}