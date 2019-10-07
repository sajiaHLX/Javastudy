/**
 * @author 2017110309
 * @date 2019年10月7日
 */
package linxiao.he.doubleconverter_test3;
public class Doubleconverter {
	private double result;
	
	public boolean convert(String value){
		result = 0;
		boolean isDouble=true;
		int numint=1; 
		int xsd=0;
		
		char[] chr=value.toCharArray();
		int[] in=new int[chr.length];
		for(int i=0;i<chr.length ;i++) {
			if(chr[i]>='0'&&chr[i]<='9') {
				in[i]=chr[i]-'0';
			}
			else if(chr[i]=='.'&&xsd==0){
				in[i]=-1;
				numint=i;
				xsd++;
			}
			else {
				isDouble=false;
				break;
			}
			
		}
		if(xsd==0||isDouble==false) {
			return false;
		}
		for(int i=0;i<in.length;i++) {
			if(i==numint) {
				continue;
			}
			if(i<numint) {
				result+=in[i]*Math.pow(10, numint-i-1);
			}
			if(i>numint) {
				result+=in[i]*Math.pow(10, numint-i);
			}
		}
		return isDouble ;
	}
	public double getResult() {
		return result;
	}
}
