package FirstPackage;

import java.util.Scanner;

public class Sparse {
public Sparse() {
	// TODO Auto-generated constructor stub
	Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String[] a=new String[n];
    for(int i=0;i<n;i++)
 	   a[i]=sc.next();
System.out.println("n entered");
    int q=sc.nextInt();
    String[] b=new String[q];
    for(int i=0;i<q;i++){
 	   b[i]=sc.next(); 
 	   
    System.out.println(b[i]);
    }
    int sum;
    for(int i=0;i<q;i++)
    {
   	sum=0;
    	 for(int ii=0;ii<n;ii++)
    	 {
    		 System.out.println(b[i]);
    		 System.out.println(a[ii]);
    		   
    		 if(b[i].equals(a[ii])){ 
    			 
    			 sum++; }
    	 }
    		System.out.println(sum); 
    }
}
}
