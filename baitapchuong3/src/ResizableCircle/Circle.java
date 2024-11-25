package ResizableCircle;

public class Circle implements GeometricObject{
	protected Double radius = 1.0;
	public double getPerimeter() {
		return 2*Math.PI*radius;
	};
	public double  getArea() {
		return Math.PI*Math.pow(radius,2);
	}
	
	public Circle(Double radius) {
		this.radius = radius;
	}
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea()
				+ ", getRadius()=" + getRadius() + "]";
	};
 
}
