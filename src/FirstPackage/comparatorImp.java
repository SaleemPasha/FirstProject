package FirstPackage;

import java.util.Comparator;

public class comparatorImp implements Comparator<Integer> {
	
	public int compare(Integer o1, Integer o2)
	{
		
		if(o1%10>o2%10)
			return 1;
		
		return -1;
	}

	

}
