package assSet5.methodOverAss2;

public class Triangle {
	private Point point1;
	private Point point2;
	private Point point3;
	private double a;
	private double b;
	private double c;

	public Triangle(Point point1, Point point2, Point point3) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.point1 = new Point(x1, y1);
		this.point2 = new Point(x2, y2);
		this.point3 = new Point(x3, y3);
	}

	public Triangle() {
		// TODO Auto-generated constructor stub
		this.point1 = new Point(0, 0);
		this.point2 = new Point(1, 1);
		this.point3 = new Point(2, 5);
	}

	public double calculatePerimeter() {
		a = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
		b = Math.sqrt(Math.pow(point3.getX() - point2.getX(), 2) + Math.pow(point3.getY() - point2.getY(), 2));
		c = Math.sqrt(Math.pow(point3.getX() - point1.getX(), 2) + Math.pow(point3.getY() - point1.getY(), 2));

		return Math.round(((a + b + c) / 3) * 100) / 100;
	}

	public double calculateArea() {
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return Math.round(area * 100) / 100;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

}
