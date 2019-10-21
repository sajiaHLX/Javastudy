/**
 * @author 2017110309
 * @date 2019年10月16日
 */
package linxiao.he.line2D;

public class Line2D {
	private double a,b,c;
	public Line2D(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public Line2D(Point2D point,double slope) {
		this.a=slope;
		this.b=-1;
		this.c=-slope*point.getX()+point.getY();
	}
	public Line2D(Point2D point1,Point2D point2) {
		if (point1.getX()==point2.getX()&&point1.getY()==point2.getY()) {
			System.out.println("输入了相同点，直线构造失败");
			System.exit(0);
		}
		this.a=point2.getY()-point1.getY();
		this.b=-point2.getX()+point2.getX();
		this.c=point2.getX()*point1.getY()-point1.getX()*point2.getY();
	}
	public Line2D(double interceptX,double interceptY) {
		this.a=interceptY;
		this.b=interceptX;
		this.c=-(interceptX*interceptY);
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public boolean equals(Object obj) {
		Line2D line2d = (Line2D) obj;
		double num1=this.getA()*line2d.b;
		double num2=this.getB()*line2d.a;
		double num3=this.getA()*line2d.c;
		double num4=this.getC()*line2d.a;
		if(num1==num2&&num3==num4) {
			return true;
		}
		return false;
	}
	public boolean isParallel(Line2D anotherLine) {
		Line2D anoLine2d=(Line2D) anotherLine;
		double num1=this.getA()*anoLine2d.b;
		double num2=this.getB()*anoLine2d.a;
		double num3=this.getA()*anoLine2d.c;
		double num4=this.getC()*anoLine2d.a;
		if(num1==num2&&num3==num4) {
			System.out.println("为同一条直线");
			System.exit(0);
		}
		if(num1==num2) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Point2D point1 = new Point2D(3, 3);
		Point2D point2 = new Point2D(3, 4);
		Line2D l1 = new Line2D(point1, point2);
		Line2D l2 = new Line2D(3,-1,-6);
		Line2D l3 = new Line2D(3, -1, -6);
		System.out.println(l1.isParallel(l2));
		System.out.println(l2.equals(l3));
	}

}
