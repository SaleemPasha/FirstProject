package FirstPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample {

	public static void main(String pasha[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("this is the output"); 
		/*System.out.println("user input:");
		int x=in.nextInt();
		System.out.println("user input is " + x);
	
	int y= in.nextInt();
	System.out.println(" y value is "+ y);
	double d= in.nextDouble();
	System.out.println("double value is "+d);*/
	/*int a=20, b=23;
	if( a<2 || b>20)
	System.out.println(a%b);
	*/
		
		int[] c={1,2,3,4,5,6,7,8,9};
		
		ArrayList<Integer> arr = new ArrayList<Integer>(4);
		arr.add(3);
		arr.add(25);
		arr.add(45);
		  arr.clear();
	for(int i:arr)
	{
		System.out.println(i);
	}
	System.out.println(arr.size());
		
		//Student sam = new Student ();
		//sam.setAge(12);
		//System.out.println(sam.getAge());
		int i=1^0;
	System.out.println("This is the end of line "+i);
	}
}
