/**
 * @author 2017110309
 * @date 2019年10月25日
 */
package linxiao.he.shapecolorcost;

public class CostCalculator {
	private double borderCost;
	private double solidCost;
	
	public CostCalculator(double borderCost,double solidCost) {
		super();
		this.borderCost=borderCost;
		this.solidCost=solidCost;
	}
	
	public double calculate(Shape2D shape) {
		if (shape.getClass().getSimpleName().equals("Rectangle")) {
			return shape.getArea()*solidCost+shape.getCircumference()*borderCost;
		}else if (shape.getClass().getSimpleName().equals("Circle")) {
			return shape.getCircumference()*borderCost;
		}else if (shape.getClass().getSimpleName().equals("Triangle")) {
			return shape.getArea()*solidCost;
		}else {
			return shape.getArea()*solidCost;
		}
	}
}
