/**
 * @author 2017110309
 */
package linxiao.he.sort;

import linxiao.he.sort.FrequencyCalculator;

public class Test {
	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
		
		//创建大量的整数，可以重复
		int[] a={1,2,3,4,4,3,3,27,7,8,8,8,8,11,9,9,9};
		int[] b=null;
        int[] c={};
		FrequencyCalculator f=new FrequencyCalculator();
		f.add(a);
		f.add(3);
		f.add(5);
		f.add(b);
		f.add(2);
		f.add(1);
		f.add(c);
		f.add(5);
		f.add(9);
		System.out.println(f.getHighest());
		System.out.println(f.getLowest());
	} 
}
