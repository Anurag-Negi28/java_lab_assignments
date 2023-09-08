package exp2;

public class largest_number {
	//find the largest of three numbers
	static int biggestofThree(int x,int y,int z)
	{
		return z>(x>y?x:y)?z:((x>y)?x:y);
	}
	
	//main driver function
	public static void main(String[]args)
	{
		//Declaring variable for three numbers
		int a, b, c;
		//Variables holding the largest number
		int largest;
		a=10;	
		b=20;
		c=30;
		//Calling the above functions in main
		largest=biggestofThree(a,b,c);
		//Print the largest number
		System.out.println(largest+" is the largest number");
	}
}