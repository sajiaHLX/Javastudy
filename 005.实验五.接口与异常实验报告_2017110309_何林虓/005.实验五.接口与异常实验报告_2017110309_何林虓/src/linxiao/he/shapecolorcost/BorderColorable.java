/**
 * @author 2017110309
 * @date 2019年10月25日
 */
package linxiao.he.shapecolorcost;

public interface BorderColorable {
	public void paintBorder(); //在实现类中该方法需要输出“已经将什么形状着色”
	public boolean isBorderPainted();//返回形状的边是否已经着色
}
