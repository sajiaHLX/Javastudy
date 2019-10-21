package menu4;

import java.util.Scanner;
import java.util.regex.*;
import java.util.Random;

public class Menu4 {
    public static String showName = null;
    public static String nowusernameString=null;
	static User user = new User();
	//注册用户名输入
    public static String nameInput() {
        String name = null;
        boolean isRight = true;
        while (isRight) {
            Scanner input = new Scanner(System.in);
            name = input.nextLine();
            if (name.length() > 20 || name.length() < 6) {
                System.out.println("用户名长度不符合规则！请重新输入：");
                continue;
            }
            String pattern = "^[a-zA-Z][a-zA-Z_0-9]+";
            boolean isSame = name.matches(pattern);
            if (!isSame) {
                System.out.println("用户名不符合规则！请重新输入：");
                continue;
            }
            isRight = false;
        }
        return name;
    }

    //注册显示名输入
    public static String shownameInput() {
        String showname = null;
        boolean isRight = true;
        while (isRight) {
            Scanner input = new Scanner(System.in);
            showname = input.nextLine();
            if (showname.length() > 20 || showname.length() < 3) {
                System.out.println("显示名长度不符合规则！请重新输入：");
                continue;
            }
            isRight = false;
        }
        return showname;
    }

    //注册密码输入
    public static String passwordInput() {
        String pd = null;
        Scanner input = new Scanner(System.in);
        boolean isRight = true;
        while (isRight) {
            pd = input.nextLine();
            if (pd.length() < 8 || pd.length() > 30) {
                System.out.println("密码长度太短！请重新输入：");
                continue;
            }
            String pattern = "([0-9].*([a-zA-Z].*[!$#%@&*()_?<>,.;]|[!$#%@&*()_?<>,.;].*[a-zA-Z])|[a-zA-Z].*([0-9].*[!$#%@&*()_?<>,.;]|[!$#%@&*()_?<>,.;].*[0-9])|[!$#%@&*()_?<>,.;].*([0-9].*[a-zA-Z]|[a-zA-Z].*[0-9]))";
            boolean isSame = pd.matches(pattern);
            if (!isSame) {
                System.out.println("密码不符合规则，请重新输入：");
                continue;
            }
            isRight = false;
        }
        return pd;
    }

    //注册密码校验
    public static String pdCheaking(String pd) {
        String pd1 = pd;
        Scanner input = new Scanner(System.in);
        boolean isSame = true;
        while (isSame) {
            String pd2 = input.nextLine();
            isSame = pd2.equals(pd1);
            if (!isSame) {
                System.out.println("两次输入密码不同，请重新输入：");
                isSame = true;
                continue;
            }
            isSame = false;
        }
        return null;
    }

    //注册邮箱校验
    public static String emailInput() {
        String email = null;
        Scanner input = new Scanner(System.in);
        boolean isRight = true;
        while (isRight) {
            email = input.nextLine();
            String pattern = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
            isRight = email.matches(pattern);
            if (!isRight) {
                System.out.println("请输入正确的邮箱！");
                isRight = true;
                continue;
            }
            isRight = false;
        }
        return email;
    }

    //注册选择密保问题
    public static String question(int option) {
        String answer = null;
        int question = 1;
        Scanner in = new Scanner(System.in);
        boolean isOver = true;
        while (isOver) {
            switch (option) {
                case 1:
                    System.out.println("请输入答案：");
                    answer = in .next();
                    if (answer.length() == 0) {
                        continue;
                    }
                    isOver = false;
                    break;
                case 2:
                    System.out.println("请输入答案：");
                    answer = in .next();
                    if (answer.length() == 0) {
                        continue;
                    }
                    isOver = false;
                    break;
                case 3:
                    System.out.println("请输入答案：");
                    answer = in .next();
                    if (answer.length() == 0) {
                        continue;
                    }
                    isOver = false;
                    break;
                case 4:
                    System.out.println("请输入答案：");
                    answer = in .next();
                    if (answer.length() == 0) {
                        continue;
                    }
                    isOver = false;
                    break;
                case 5:
                    System.out.println("请输入答案：");
                    answer = in .next();
                    if (answer.length() == 0) {
                        continue;
                    }
                    isOver = false;
                    break;
            }
        }
        return answer;
    }

    //注册验证码生成
    public static String vCode() {
        Scanner input = new Scanner(System.in);
        int numb = 0;
        int answer = 0;
        boolean isTrue = true;
        while (isTrue) {
            if (numb < 5 && 1 <= numb) {
                System.out.println("还剩" + (5 - numb) + "次机会！");
            }
            if (numb == 5) {
                System.out.println("输入错误次数超过5次，请明天再试！");
                System.exit(0);
            }
            Random r = new Random();
            int a = r.nextInt(9);
            int b = r.nextInt(9);
            int c = r.nextInt(9);
            int d = r.nextInt(2);
            int e = r.nextInt(2);
            String[] num = {
                "+",
                "-",
                "*"
            };
            System.out.println("请输入验证码答案：");
            System.out.println(a + num[d] + b + num[e] + c + ":");
            switch (num[d]) {
                case "+":
                    switch (num[e]) {
                        case "+":
                            answer = a + b + c;
                            break;
                        case "-":
                            answer = a + b - c;
                            break;
                        case "*":
                            answer = a + b * c;
                            break;
                    }
                    break;
                case "-":
                    switch (num[e]) {
                        case "+":
                            answer = a - b + c;
                            break;
                        case "-":
                            answer = a - b - c;
                            break;
                        case "*":
                            answer = a - b * c;
                            break;
                    }
                    break;
                case "*":
                    switch (num[e]) {
                        case "+":
                            answer = a * b + c;
                            break;
                        case "-":
                            answer = a * b - c;
                            break;
                        case "*":
                            answer = a * b * c;
                            break;
                    }
                    break;
            }
            int ans = input.nextInt();
            if (ans != answer) {
                numb++;
                System.out.println("答案错误，请重新输入！");
                continue;
            }
            isTrue = false;
        }
        return null;
    }

    //登录用户名验证
    public static String nameCheak() {
        Scanner input = new Scanner(System.in);
        String[] na = new String[100];
        System.out.println("请输入用户名：");
        String namec = input.next();
        String itemString=null;
        boolean isCheak = true;
        boolean isRight = true;
        boolean isTrue = false;
        while (isCheak) {
            System.out.println("请输入密码：");
            String pwd = input.next();
            for (int i = 0; i < user.getNowUser(); i++) {
                String string = user.getUserNameArray()[i];
                if (string.equals(namec)) {
                    isTrue = true;
                    na=user.getNameArray();
                    itemString = na[i];
                    String string1 = user.getPassWordArray()[i];
                    isRight = string1.equals(pwd);
                    if (isRight) {
                        System.out.println("登录成功");
                        nowusernameString=namec;
                        user.setLogin(true);
                        isCheak = false;
                        return itemString;
                    } else {
                        System.out.println("用户名或密码错误");
                        break;
                    }
                }
            }
            if (!isTrue) {
                System.out.println("用户名或密码错误");
            }
        }
        return itemString;
    }

    //找回密码
    public static String pdFind(){
    	System.out.println("请输入要找回密码的用户名！");
    	Scanner input =new Scanner(System.in);
    	String namec =input.next(); 
    	String anString;
    	String[] nameStrings=user.getUserNameArray();
    	int[] questionStrings=user.getQuestionOptionArray();
    	String[] ansStrings=user.getAnswerArray();
    	String[] pwdStrings=user.getPassWordArray();
    	int nowuser=user.getNowUser();
    	for (int i = 0; i < nowuser  ; i++) {
            String string = nameStrings[i];
            if (string.equals(namec)) {
            	switch (questionStrings[i]) {
				case 1:	
					System.out.println("1.你小学的名字是什么？");
					System.out.println("请输入答案：");
					anString=input.next();
					if (anString.equals(ansStrings[i])) {
						System.out.println("请输入新密码：（密码必须包含字母数字和特殊符号，密码最短为 8 位，最长不能超过 30 位）");
						String password= passwordInput();
						System.out.println("请再次输入密码：");
		                pdCheaking(password);
		                System.out.println("恭喜你密码修改成功!"+"新的密码是："+password);
		                pwdStrings[i]=password;
					}
					break ;
				case 2:
					System.out.println("2.你初中的名字是什么？");
					System.out.println("请输入答案：");
					anString=input.next();
					if (anString.equals(ansStrings[i])) {
						System.out.println("请输入新密码：（密码必须包含字母数字和特殊符号，密码最短为 8 位，最长不能超过 30 位）");
						String password= passwordInput();
						System.out.println("请再次输入密码：");
		                pdCheaking(password);
		                System.out.println("恭喜你密码修改成功!"+"新的密码是："+password);
		                pwdStrings[i]=password;
					}
	                break;
				case 3:
					System.out.println("3.你高中的名字是什么？");
					System.out.println("请输入答案：");
					anString=input.next();
					if (anString.equals(ansStrings[i])) {
						System.out.println("请输入新密码：（密码必须包含字母数字和特殊符号，密码最短为 8 位，最长不能超过 30 位）");
						String password= passwordInput();
						System.out.println("请再次输入密码：");
		                pdCheaking(password);
		                System.out.println("恭喜你密码修改成功!"+"新的密码是："+password);
		                pwdStrings[i]=password;
					}
	                break;
				case 4:
					System.out.println("4.你大学的名字是什么？");
					System.out.println("请输入答案：");
					anString=input.next();
					if (anString.equals(ansStrings[i])) {
						System.out.println("请输入新密码：（密码必须包含字母数字和特殊符号，密码最短为 8 位，最长不能超过 30 位）");
						String password= passwordInput();
						System.out.println("请再次输入密码：");
		                pdCheaking(password);
		                System.out.println("恭喜你密码修改成功!"+"新的密码是："+password);
		                pwdStrings[i]=password;
					}
	                break;
				case 5:
					System.out.println("5.你的名字是什么？");
					System.out.println("请输入答案：");
					anString=input.next();
					if (anString.equals(ansStrings[i])) {
						System.out.println("请输入新密码：（密码必须包含字母数字和特殊符号，密码最短为 8 位，最长不能超过 30 位）");
						String password= passwordInput();
						System.out.println("请再次输入密码：");
		                pdCheaking(password);
		                System.out.println("恭喜你密码修改成功!"+"新的密码是："+password);
		                pwdStrings[i]=password;
					}
					break;
				}
            }
    	}
    	return null;
    }

    
    //显示一级菜单
    public static void showMenu1() {
    	Diary diary=new Diary();
        Scanner input = new Scanner(System.in);
        if (user.getIsLogin()) {
            System.out.println("1.[" + showName + "]退出登录");
        } else {
            System.out.println("1. 登录系统");
        }
        System.out.println("2. 系统设置;");
        System.out.println("3. 写日记;");
        System.out.println("4. 查找日记;");
        System.out.println("5. 退出系统");
        System.out.println("请选择");
        int option = input.nextInt();
        while (option < 1 || option > 5) {
            System.out.println("输入错误，请重新输入");
            option = input.nextInt();
        }
        if (!user.getIsLogin()) {
            if (option == 5) {
                System.out.println("再见！");
                System.exit(0);
            }
            if (option != 1) {
                System.out.println("用户未登录，清先登录。");
                showMenu1();
            }
        }
        switch (option) {
            case 1:
                if (user.getIsLogin()) {
                    user.setLogin(false);
                    showMenu1();
                }
                showMenu2();
                break;
            case 2:
                System.out.println("正在执行设置功能...");
                showMenu1();
                break;
            case 3:
            	diary.write();
                showMenu1();
                break;
            case 4:
                System.out.println("正在执行查找功能...");
                showMenu1();
                break;
            case 5:
                System.out.println("再见！！");
                System.exit(0);
            default:
                System.out.println("输入错误请重新输入！");
                showMenu1();
        }
    }

    //显示二级菜单
    public static void showMenu2() {
        String userName = null;
        String password = null;
        String email = null;
        String answer = null;
        int nowUser=user.getNowUser();
        
        Scanner input = new Scanner(System.in);
        user.getUserNameArray()[nowUser] = "qwe123";
        user.getPassWordArray()[nowUser]="qwer1234.";
        user.getNameArray()[nowUser]="qwe";
        user.getEmailArray()[nowUser]="1132@qq.com";
        user.getQuestionOptionArray()[nowUser]=1;
        user.getAnswerArray()[nowUser]="q";
        nowUser+=1;
        user.setNowUser(nowUser);
        
        user.getUserNameArray()[nowUser] = "qwe1234";
        user.getPassWordArray()[nowUser]="qwer1234,";
        user.getNameArray()[nowUser]="qwe123";
        user.getEmailArray()[nowUser]="1132@qq.com";
        user.getQuestionOptionArray()[nowUser]=1;
        user.getAnswerArray()[nowUser]="q";
        nowUser+=1;
        user.setNowUser(nowUser);
        
        
        System.out.println("1.注册；");
        System.out.println("2.登录；");
        System.out.println("3.找回密码；");
        System.out.println("4.返回上一层菜单");
        System.out.println("请选择：");
        int option1 = input.nextInt();
        switch (option1) {
            //注册
            case 1:
                System.out.println("请输入用户名：（用户名只能包含字母、数字和下划线，并且首字母只能为字母，用户名最短不能少于 6 个字符，最长不能超过 20 个字符）");
                userName = nameInput();
                
                System.out.println("请输入显示名：（显示名可以包含任意字符，但是最小只能为 3 个字符，最长可以为 20 个字符）");
                showName=shownameInput();
                
                System.out.println("请输入密码：（密码必须包含字母数字和特殊符号，密码最短为 8 位，最长不能超过 30 位）");
                password = passwordInput();
                
                System.out.println("请再次输入密码：");
                pdCheaking(password);
                
                System.out.println("请输入邮箱：");
                email = emailInput();
                
                System.out.println("请选择密保问题：");
                System.out.println("1.你小学的名字是什么？");
                System.out.println("2.你初中的名字是什么？");
                System.out.println("3.你高中的名字是什么？");
                System.out.println("4.你大学的名字是什么？");
                System.out.println("5.你的名字是什么？");
                System.out.println("请输入前面的序号选择一个作为你的密保问题：");
                Scanner in = new Scanner(System.in);
                int questionNo = in .nextInt();
                answer = question(questionNo);
                vCode();
                System.out.println("注册成功！");
                
                user.getUserNameArray()[nowUser] = userName;
                user.getPassWordArray()[nowUser]=password;
                user.getNameArray()[nowUser]=showName;
                user.getEmailArray()[nowUser]=email;
                user.getQuestionOptionArray()[nowUser]=questionNo;
                user.getAnswerArray()[nowUser]=answer;
                nowUser+=1;
                user.setNowUser(nowUser);
                showMenu2();
                break;
            
            //登录
            case 2:
                showName = nameCheak();
                showMenu1();
                break;
            
            
            //找回密码
            case 3:
                pdFind();
                showMenu2();
                break;
            
            //返回上级
            case 4:
                showMenu1();
                break;
            default:
                System.out.println("输入错误请重新输入！");
                showMenu2();
        }

    }

    //显示三级菜单
    public static void showMenu3() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.按标题查找;");
        System.out.println("2.按内容查找;");
        System.out.println("3.按日期查找;");
        System.out.println("4.按心情查找;");
        System.out.println("5.按天气查找;");
        System.out.println("6.返回上一层菜单;");
        System.out.println("请选择");
        int option = input.nextInt();
        while (option < 1 || option > 6) {
            System.out.println("输入错误，请重新输入");
            option = input.nextInt();
        }
        switch (option) {
            case 1:
                System.out.println("正在执行按标题查找功能");
                break;
            case 2:
                System.out.println("正在执行按内容查找功能");
                break;
            case 3:
                System.out.println("正在执行按日期查找功能");
                break;
            case 4:
                System.out.println("正在执行按心情查找功能");
                break;
            case 5:
                System.out.println("正在执行按天气查找功能");
                break;
            case 6:
                showMenu1();
                break;
        }
    }

    public static void main(String[] args) {
        showMenu1(); //显示菜单1
    }
}
