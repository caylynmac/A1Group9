package shapeDomain;

public class TriangularPrism extends Shape{
	private double edgeLength;
	
	public TriangularPrism(double h, double e) {
		super(h);
		this.edgeLength = e;
		
		setVolume(volume());
		setArea(area());
	}
	
	@Override
	public Double volume() {
		Double v = (Math.sqrt(3/4) * edgeLength * edgeLength * getHeight());
		return v;
	}
	
	@Override
	public Double area() {
		Double a = (edgeLength * getHeight()) / 2;
		return a;
	}
}
