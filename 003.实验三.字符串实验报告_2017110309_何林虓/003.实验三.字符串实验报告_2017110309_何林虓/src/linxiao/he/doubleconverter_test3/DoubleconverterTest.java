/**
 * @author 2017110309
 * @date 2019年10月7日
 */
package linxiao.he.doubleconverter_test3;

import java.util.Scanner;

public class DoubleconverterTest {
	public static void main(String[] args){
        boolean is=false;
        while(!is) {
        	Scanner input= new Scanner(System.in);
            System.out.print("请输入一个字符串:");
            String str = input.next();
            Doubleconverter dc = new Doubleconverter();
            if(dc.convert(str)) {
                System.out.println("值为"+dc.getResult());
            	System.exit(0);
            }else{
                System.out.println("你输入的不是浮点数。");
                is=false;
            }
        }
         
   }
}
