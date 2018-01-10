package FirstPackage;

import java.util.Scanner;

public class Crush {

	public Crush() {
		// TODO Auto-generated constructor stub
	
		  
		 Scanner sc= new Scanner(System.in);
		        int n= sc.nextInt();
		        int a[]=new int[n];
		        //a[3]=90;
		        for(int i=0;i<n;i++)
		        		a[i]=0;
		        int q=sc.nextInt();
		        
		        for(int i=0;i<q;i++)
		            {
		            
		            int k=sc.nextInt();
		            int l=sc.nextInt();
		            int m=sc.nextInt();
		            
		            while((k-1)<=(l-1)){
		                a[k-1]+=m;
		            k++; }
		        }
		    int max=Integer.MIN_VALUE;
		    
		    for(int i=0;i<n;i++)
		    {
		    	if(max<a[i])
		    		max=a[i];
		    }
		    
		        System.out.println(max);
	}
}
