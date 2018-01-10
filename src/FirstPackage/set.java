package FirstPackage;

import java.util.*;
public class set {

	public  set()
	{
		Set<Integer> values= new HashSet<>();
		
		System.out.println(values.add(20));
		System.out.println(values.add(20));
		values.add(120);
		values.add(2320);
		values.add(208);
		values.add(49840);
		
		for(int i: values)
		
			System.out.println(i);
		
		
		values.forEach(System.out::println);
	
		}
	
}
