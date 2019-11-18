/**
 * @author 2017110309
 * @date 2019年10月25日
 */
package linxiao.he.shapecolorcost;

public class Triangle extends Shape2D implements SolidColorable{
	private double a;
	private double b;
	private double c;
	private boolean flag =false;
	
	public Triangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public void paintShape() {
		// TODO 自动生成的方法存根
		System.out.println("已经将三角形着色");
		flag=true;
	}

	@Override
	public boolean isShapePainted() {
		// TODO 自动生成的方法存根
		return flag;
	}

	@Override
	public double getCircumference() {
		// TODO 自动生成的方法存根
		return a+b+c;
	}

	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		double p = (a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
}
