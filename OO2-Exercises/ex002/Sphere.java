public class Sphere implements GeometricSolid{
	
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}

	public double getVolume() {
		return (4.0/3.0) * (Math.PI) * (Math.pow(radius, 3));
	}

	public double getSurfaceArea() {
		return 4.0 * Math.PI * Math.pow(radius, 2);
	}

}
