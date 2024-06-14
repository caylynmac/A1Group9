package shapeDomain;

public class SquarePrism extends Shape {
	private double edgeLength;
	
	public SquarePrism(double h, double e) {
		super(h);
		this.edgeLength = e;
		
		setVolume(volume());
		setArea(area());
	}
	
	@Override
	public Double volume() {
		Double v = (edgeLength * edgeLength * getHeight());
		return v;
	}
	
	@Override
	public Double area() {
		Double a = (edgeLength * edgeLength);
		return a;
	}
}
