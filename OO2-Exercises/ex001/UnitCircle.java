public class UnitCircle implements Comparable<UnitCircle> {
	int radius;
	
	public UnitCircle(int radius) {
		this.radius = radius;
	}

	public int compareTo(UnitCircle other) {
		return this.radius - other.radius;
	}
	
	public String toString() {
		return String.format("UnitCircle[r=%d]", radius);
	}
}
