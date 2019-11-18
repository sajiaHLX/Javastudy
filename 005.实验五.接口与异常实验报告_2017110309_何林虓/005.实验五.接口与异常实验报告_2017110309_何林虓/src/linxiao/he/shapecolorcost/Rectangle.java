package linxiao.he.shapecolorcost;

public class Rectangle extends Shape2D implements BorderColorable,SolidColorable {
	private double length;
	private double width;
	private boolean flag1=false;
	private boolean flag2=false;
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	@Override
	public void paintShape() {
		// TODO 自动生成的方法存根
		System.out.println("已经将长方形着色");
		flag1=true;
	}

	@Override
	public boolean isShapePainted() {
		// TODO 自动生成的方法存根
		return flag1;
	}

	@Override
	public void paintBorder() {
		// TODO 自动生成的方法存根
		System.out.println("已经将长方形的边着色");
		flag2=true;
	}

	@Override
	public boolean isBorderPainted() {
		// TODO 自动生成的方法存根
		return flag2;
	}

	@Override
	public double getCircumference() {
		// TODO 自动生成的方法存根
		return (length+width)*2;
	}

	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		return length*width;
	}
	
}
