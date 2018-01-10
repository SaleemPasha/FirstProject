package FirstPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaCollection {
	public JavaCollection()
	{
		
		List values= new ArrayList();
		values.add(3012);
		values.add(3);
		values.add(56);
		values.add(50);
		/*values.add(3.14f);
		values.add("rakesh");
		values.add(34);
		*/

		/*values.add(1, "adga");
		values.add(1, "sam");
		values.add(1, "asif");
		*/
	Collections.sort(values);
		
		/*for(Object i: values)
			System.out.println(i);
		*/
		
		values.forEach(System.out::println);

		System.out.println("\"After sorting\" ");
		Collections.reverse(values);
		values.forEach(System.out::println);

		System.out.println("\" After reverse\" ");
		
		/*Comparator<Integer> c = new Comparator<Integer>() {
			
			@Override 
			public int compare(Integer o1, Integer o2)
			{
				
				if(o1%10>o2%10)
					return 1;
				
				return -1;
			}

			
		};
*/
		
Comparator<Integer> c = ( o1,  o2) ->
			{
				
				if(o1%10>o2%10)
					return 1;
				
				return -1;
			};

			
		

		
		
		System.out.println(" ");
		Collections.sort(values, c);
		values.forEach(System.out::println);
		
		
		System.out.println(" ");
		System.out.println(values.size());
		
		
		
		
		
		
		
	}

}
