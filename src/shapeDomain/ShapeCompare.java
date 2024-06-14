package shapeDomain;

import java.util.Comparator;

/**
 * class to compare student ages with comparator
 * is an external class so it can accept 2 student arguments
 * 
 * return -1 if first object is less than second
 * if first object is greater return 1
 * if ages are equal then compare names with string.compareto
 */

public class ShapeCompare implements Comparator<Shape>
{
	@Override
	public int compare( Shape s1, Shape s2)
	{
		if( s1.area() < s2.area() )
		{
			return -1;
		}
		else if( s1.area() > s2.area())
		{
			return 1;
		}
		else // stud1 age = stud2 age
		{
			return 0;
		}
	
	}

}

