package exp1;

public class Main {
	public static void main(String[] args) {
		DerivedClass derivedClass = new DerivedClass();

		// Attempting to access the private member of the superclass using public
		// methods
		// This is allowed because public methods in the superclass can access private
		// members
		derivedClass.setPrivateMember(42);
		int value = derivedClass.getPrivateMember();
		System.out.println("Accessed private member via public methods: " + value);
	}
}
