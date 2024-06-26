package shapeDomain;

public class Pyramid extends Shape{

	private double edgeLength;
	
	public Pyramid(double h, double e) {
		super(h);
		this.edgeLength = e;
		
		setVolume(volume());
		setArea(area());
	}
	
	@Override
	public Double volume() {
		Double v = (edgeLength * edgeLength * getHeight()) / 3;
		return v;
	}
	
	@Override
	public Double area() {
		Double a = (edgeLength * edgeLength);
		return a;
	}

}
