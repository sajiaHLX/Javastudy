/**
 * @author 2017110309
 * @date 2019年10月7日
 */
package linxiao.he.menu_test2;
import java.util.Scanner;
public class Menu_test2 {
	public static void func(){
		System.out.println("正在执行，请稍后");
	}
	public static void main(String[] args){
		boolean exit1=true;
		Scanner input=new Scanner(System.in);
		do{
			boolean cont1=true;
			System.out.println("1.登录系统");
	  	    System.out.println("2.登录设置");
		    System.out.println("3.写日记");
		    System.out.println("4。查找日记");
		    System.out.println("5.退出系统");
		    System.out.println("请选择：");
		    while(cont1){
		       	if(!input.hasNextInt()){
		       		input.nextLine();
	    		 	System.out.println("1.按标题查找");
	    	  	    System.out.println("2.按内容查找");
	    		    System.out.println("3.按日期查找");
	    		    System.out.println("4.按心情查找");
	    		    System.out.println("5.按天气查找");
	    		 	System.out.println("6.返回上一层菜单");	
	    		    System.out.println("请选择");
	    		}
	    		else{
  	    			cont1=false;
	    		}
    		}
		    int operation=input.nextInt();
		    switch (operation){
			case 1:
			case 2:
			case 3:
				func();
				break;
			case 4:		
				boolean exit2=true;
				do{
					boolean cont2=true;
					System.out.println("1.按标题查找");
	    	  	    System.out.println("2.按内容查找");
	    		    System.out.println("3.按日期查找");
	    		    System.out.println("4.按心情查找");
	    		    System.out.println("5.按天气查找");
	    		 	System.out.println("6.返回上一层菜单");	
	    		    System.out.println("请选择");
				    while(cont2){
					if(!input.hasNextInt()){
						System.out.println("11111");	
						System.out.println("1.��������ң�");
						System.out.println("2.�����ݲ��ң�");
						System.out.println("3.�����ڲ��ң�");
						System.out.println("4.��������ң�");
						System.out.println("5.���������ң�");
						System.out.println("6.������һ���˵���");	
						System.out.println("������ѡ��");
						input.nextLine();
					}
					else{
						cont2=false;
					}
				  }
				    int operation1=input.nextInt();
				    switch (operation1){
				    case 1:
				    case 2:
				    case 3:
				    case 4:
				    case 5:
				  	      func();
					      break;
				    case 6:
				    	exit2=false;
				    	break;
				    default:
						System.out.println("输入错误请重新输入�");	
				    }
				}while(exit2);
				break;
			case 5:
				System.out.println("再见！");
				exit1=false;
				break;	
			default:
				System.out.println("输入错误请重新输入");	
		     }
		}while(exit1);
	}
}

