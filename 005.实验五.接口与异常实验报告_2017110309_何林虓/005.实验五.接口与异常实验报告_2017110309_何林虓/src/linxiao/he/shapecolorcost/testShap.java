/**
 * @author 2017110309
 * @date 2019年10月25日
 */
package linxiao.he.shapecolorcost;

public class testShap {
	public static void main(String[] args) {
		CostCalculator cost=new CostCalculator(1,1);
		Rectangle Rectangle=new Rectangle(5, 6); 
		System.out.println(cost.calculate(Rectangle));
		Square square=new Square(4);
		System.out.println(cost.calculate(square));
        Circle circle=new Circle(5);  
        System.out.println(cost.calculate(circle));
        Triangle triangle=new Triangle(3,4,5);
        System.out.println(cost.calculate(triangle));
	}
}
