package linxiao.he.menu;
/**
 * @author 何林虓
 *
 */
public class Main {
	public static int isloginsuccess;	
	public static void main(String[] args){
		boolean exit=true;
		SetMenu setmenu=new SetMenu();	
		MyMenu menu=new MyMenu();
		do{
			menu.menubegin();
			int operation=menu.judg();
			switch (operation){
			case 1:
				setmenu.loginregister();
				break;
			case 2:				
			case 3:
			case 4:	
				menu.remindre();
				break;
			case 5:
				System.out.println("谢谢使用，再见");
				exit=false;
				break;
			default:
				System.out.println("输入不对，请重新选择");
		}
		}while(exit);
	}
}
