/**
 * @author 2017110309
 * @date 2019年10月16日
 */
package linxiao.he.line2D;

public class Point2D {
	private double x;
	private double y;
	public  Point2D(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public boolean equals(Object obj) {
		Point2D point2d = (Point2D) obj;
		if(this.x==point2d.getX() && this.y==point2d.getY()) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Point2D p1 = new Point2D(12, 12);
		Point2D p2 = new Point2D(12, 12);
		System.out.println(p1.equals(p2));
	}
}
