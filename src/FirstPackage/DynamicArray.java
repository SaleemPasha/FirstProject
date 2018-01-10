package FirstPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
	
	ArrayList<ArrayList<Integer>> temporary;
	int n,lastAnswer=0; 
	public DynamicArray(){
		
		//ArrayList<Integer> temp = new ArrayList();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n value"); 
		n= sc.nextInt();
		temporary = new ArrayList<>(n); //2
		
		System.out.println("enter q value");
		int q=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			temporary.add(new ArrayList<>());
		}
		System.out.println("array lists created");
		
		for(int i=0;i<=q;i++) {
			//q=5
			
		
			int a=sc.nextInt();	//1
			int x=sc.nextInt();	//0
			int y=sc.nextInt(); //5
			
			
			if(a==1)
				temporary.get(m(x)).add(y);
			if(a==2)
			{
				lastAnswer=temporary.get(m(x)).get(y%(temporary.get(m(x)).size()));
				System.out.println(lastAnswer);
			}
				
				
			
		}
		
	}
	
	int m(int x) //m(0)
	{
		return ((x^lastAnswer)%n);
	}
			//ArrayList al = new ArrayList();
		     
		
		
		
		//temporary.add(temp);
		//temporary = new ArrayList<>();
		
		
//		System.out.println(temporary.get(0).get(0));
	//System.out.println(temporary.get(0).size());
		
//		temporary.add(new ArrayList<>());
//		
//		temporary.get(0).add(33);
//		temporary.add(temp);
//		//temp.add(10);
//				
//		System.out.println(temporary.get(0).get(3));
//		
	
}
