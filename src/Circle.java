
public class Circle extends Figure implements Moveable{
	double radius;
	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius=radius;
	}
	public double getArea() {
		return Math.acos(-1) * this.radius * this.radius;
	}
	public double getPerimeter() {
		return 2 * Math.acos(-1) * this.radius;
	}
	@Override
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	@Override
	public void resize(double koeff) {
		this.radius *= koeff;
	}
	@Override
	public String toString() {
		String ans = "Circle\n";
		ans += "Center: (" + Double.toString(this.x) + ", " + Double.toString(this.y) + ")\n";
		ans += "Radius: " + Double.toString(this.radius); 
		return ans;
	}
}
