package FirstPackage;

import java.util.Scanner;

public class LeftRotation {

	public LeftRotation() {
		// TODO Auto-generated constructor stub
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int a[]={1,2,3,4,5};
     //   for(int i=0;i<n;i++)
           // a[i]=sc.nextInt();
        int x=d;
       do {
    	   System.out.print(a[x++]+" ");
    	   if(x==n)
    		   x=0;
       }while(x!=d);
	
	}
}
