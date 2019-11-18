package linxiao.he.jvm;
import java.util.ArrayList;
import java.lang.Runtime;
import java.util.List;;
public class Jvm {
	public static void main(String[] args) {         
		List<String> list=new ArrayList<String>();
		
		long i=0;
		try {
			while (true) {
				String string = (i++)+"";
				list.add(string.intern());
			}
		} catch (OutOfMemoryError ignored) {
			// TODO: handle exception
			System.out.println("此时总内存为："+Runtime.getRuntime().totalMemory());
			System.out.println("此时空闲内存为："+Runtime.getRuntime().freeMemory());
		}finally {
			System.out.println("进行恢复异常");
            list.clear();
            System.gc(); 
		}
		
     }        
}

