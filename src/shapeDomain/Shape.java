package shapeDomain;


public abstract class Shape implements Comparable<Shape>{

	private int height;
	
	public int getHeight() {
		return height;
	}
	
	/**abstract area method for inheritance
	 * 
	 */
	public abstract int area();
	
	/**abstract volume method
	 * 
	 */
	public abstract int volume();
	
	/**
	 * Compares shapes based on their height
	 * //uses string.compareto method to return -1 if first height is less than the second!
	 */
	@Override
	public int compareTo(Shape that) {
		if( this.height < that.height)
		{
			return -1;
		}
		else if( this.height > that.height)
		{
			return 1;
		}
		else // stud1 age = stud2 age
		{
			return 0;
		}
	}
}
