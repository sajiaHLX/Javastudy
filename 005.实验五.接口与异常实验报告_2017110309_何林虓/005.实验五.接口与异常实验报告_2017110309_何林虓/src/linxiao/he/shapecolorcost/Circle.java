/**
 * @author 2017110309
 * @date 2019年10月25日
 */
package linxiao.he.shapecolorcost;

public class Circle extends Shape2D implements BorderColorable {
	private double r;
	private boolean flag=false;
	public Circle(double r) {
//		super();
		this.r=r;
	}
	
	@Override
	public double getCircumference() {
		return 2*Math.PI*r;
	}
	@Override
	public double getArea() {
		return Math.PI*r*r;
	}
	@Override
	public void paintBorder() {
		System.out.println("已经将圆形的边着色");
		flag=true;
	}
	@Override
	public boolean isBorderPainted() {
		return flag;
	}
	
}
