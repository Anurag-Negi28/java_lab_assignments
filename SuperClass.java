//Write a Java program to show that private member of a super class cannot be
//accessed from derived classes.
package exp1;

public class SuperClass {
	private int privateMember;

	public void setPrivateMember(int value) {
		this.privateMember = value;
	}

	public int getPrivateMember() {
		return privateMember;
	}
}

class DerivedClass extends SuperClass {
	public void accessPrivateMember() {
		// Attempting to access the private member of the superclass directly
		// This will result in a compilation error
		//int value = privateMember; // This line will cause a compilation error
	}
}
