package shapeDomain;


public abstract class Shape implements Comparable<Shape>{

	private double height;
	private Double volume;
	private Double area;
	
	public Shape(double height) {
		super();
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public Double getVolume() {
		return volume;
	}
	
	public Double getArea() {
		return area;
	}
	
	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public void setArea(Double area) {
		this.area = area;
	}
	
	/**abstract area method for inheritance
	 * 
	 */
	public abstract Double area();
	
	/**abstract volume method
	 * 
	 */
	public abstract Double volume();
	
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
		
	/**
	 * to compare by height, volume, or area
	 */
	public int typeCompare(Shape that, String input)
	{
		int result = -2;
		
		if (input.equals("h")) 
		{
			result = this.compareTo(that);
		}
		else if (input.equals("v"))
		{
			result = Double.compare(this.volume(), that.volume());
		}
		else if (input.equals("a"))
		{
			result =  Double.compare(this.area(), that.area());
		}
		return result;
	}
	
}
