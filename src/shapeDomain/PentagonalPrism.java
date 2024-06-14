package shapeDomain;

public class PentagonalPrism extends Shape {
	private double edgeLength;
	
	public PentagonalPrism(double h, double e) {
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
		Double a = ((1 / 4) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)) * edgeLength * edgeLength));
		return a;
	}
}
