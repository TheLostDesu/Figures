public class Rectangle extends Figure implements Moveable{
	double height, width;
	public Rectangle(double x, double y, double height, double width) {
		super(x, y);
		this.height = height;
		this.width = width;
	}
	public double getArea() {
		return this.height * this.width;
	}
	public double getPerimeter() {
		return 2 * (this.height + this.width);
	}
	@Override
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	@Override
	public void resize(double koeff) {
		this.height *= koeff;
		this.width *= koeff;
	}
	@Override
	public String toString() {
		String ans = "Rectangle\n";
		ans += "Center: (" + Double.toString(x + this.height / 2) + ", " + Double.toString(y + this.width / 2) + ")\n";
		ans += "Height: " + Double.toString(this.height) + "\n";
		ans += "Width: " + Double.toString(this.width);
		return ans;
	}
}