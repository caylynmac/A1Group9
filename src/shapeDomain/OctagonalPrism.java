package shapeDomain;

public class OctagonalPrism extends Shape{
	private double edgeLength;
	
	public OctagonalPrism(double h, double e) {
		super(h);
		this.edgeLength = e;
		
		setVolume(volume());
		setArea(area());
	}
	
	@Override
	public Double volume() {
		Double v = area() * getHeight();
		return v;
	}
	
	@Override
	public Double area() {
		Double a = (2 * ( 1 + Math.sqrt(2)) * edgeLength * edgeLength);
		return a;
	}
}
