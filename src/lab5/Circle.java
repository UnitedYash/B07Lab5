package lab5;

public class Circle {
	
	Point center;
	double radius;
	
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI  * radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public boolean containsPoint(Point point) {
		double diffX = point.x - center.x;
		double diffY = point.y - center.y;
		return Math.sqrt(diffX * diffX + diffY * diffY) <= radius;
	}
	
	// Returns true if passed circle touches or is inside of this circle
	public boolean intersectsCircle(Circle circle) { 
		double diffX = circle.center.x - center.x;
		double diffY = circle.center.y - center.y;
		return Math.sqrt(diffX * diffX + diffY * diffY) <= radius + circle.radius;
	}
}
