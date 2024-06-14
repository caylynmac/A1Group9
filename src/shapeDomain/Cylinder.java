package shapeDomain;

public class Cylinder extends Shape {
	private double radius;
	
	public Cylinder(double h, double r) {
		super(h);
		this.radius = r;
		
		setVolume(volume());
		setArea(area());
	}
	
	@Override
	public Double volume() {
		Double v = (Math.PI * radius * radius * getHeight());
		return v;
	}
	
	@Override
	public Double area() {
		Double a = (Math.PI * radius * radius);
		return a;
	}
}
