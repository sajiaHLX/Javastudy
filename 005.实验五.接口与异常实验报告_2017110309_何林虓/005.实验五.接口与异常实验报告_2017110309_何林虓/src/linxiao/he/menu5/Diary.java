/**
 * @author 2017110309
 * @date 2019年10月21日
 */
package linxiao.he.menu5;
import java.text.SimpleDateFormat;
import java.util.Scanner;

enum Weather{
	cloudy,//多云	
	sunny,//晴天
	rain,//下雨
	overcast,//阴天
	windy,//有风
	snow,//雪
};

enum Mood{
	happy,//开心
	sad,//伤心
	angry,//生气
	nervous,//紧张
	excited,//兴奋
};
public class Diary {
	private Date date;
	private Weather weather;
	private Mood mood;
	private String title;
	private String content;
	
	public String toString (){
		String diary = "日记日期:"+date.getDate()+"\n"+"天气:"+weather+"\n"+"心情:"+mood+"\n"+"标题:"+title+"\n"+"内容:"+content;
		return diary;
	}
	
	//写日记
	public Diary write(){
		Diary diary = new Diary();
		Scanner input = new Scanner(System.in); 	
		boolean exit=false;
		
		//设置天气
		Weather weather=Weather.cloudy;
		do{
			System.out.println("今天的天气怎样：");
			System.out.println("1.多云");
		    System.out.println("2.晴天");
		    System.out.println("3.有雨");
		    System.out.println("4.雪天");
		    System.out.println("5.有风");
		    System.out.println("6.阴天");
		    System.out.println("请选择：");
			int operation=input.nextInt();
			switch (operation){
			case 1:
				weather = Weather.cloudy;
				exit=false;
				break;
			case 2:
				weather = Weather.sunny;
				exit=false;
				break;
			case 3:
				weather = Weather.rain;
				exit=false;
				break;
			case 4:
				weather = Weather.snow;
				exit=false;
				break;
			case 5:
				weather = Weather.windy;
				exit=false;
				break;
			case 6:
				weather = Weather.overcast;
				exit=false;
				break;
			default:
				System.out.println("输入不对，请重新选择！");
				exit=true;
			}
		}while(exit);	
		diary.setWeather(weather);
		System.out.println("天气选择成功");
		
		//设置心情
		Mood mood=Mood.angry;
		do{
			System.out.println("今天的心情怎样：");
			System.out.println("1.开心");
		    System.out.println("2.伤心");
		    System.out.println("3.紧张");
		    System.out.println("4.生气");
		    System.out.println("5.兴奋");
		    System.out.println("请选择：");
			int operation=input.nextInt();
			switch (operation){
			case 1:
				mood = Mood.happy;
				exit=false;
				break;
			case 2:
				mood = Mood.sad;
				exit=false;
				break;
			case 3:
				mood = Mood.nervous;
				exit=false;
				break;
			case 4:
				mood = Mood.angry;
				exit=false;
				break;
			case 5:
				mood = Mood.excited;
				exit=false;
				break;
			default:
				System.out.println("输入不对，请重新选择！");
				exit=true;
			}
		}while(exit);
		diary.setMood(mood);
		System.out.println("心情选择成功");
		
		//设置日期
		Date diarydate = new Date("");
		System.out.println("请输入日期：年-月-日");
		String uglyString = input.nextLine();
		String date = input.nextLine();
		do{
			if(diarydate.isNull(date)==false){
				if(Date.isDate(date)){
					diarydate = new Date(date);
					exit = false;
				}
				else{
					System.out.println("日期输入不对，请重新输入");
					date=input.next();
					exit=true;
				}
			}
			else{//当日期为空，为当前日期
				SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
				date = formatter.format(System.currentTimeMillis());
				diarydate = new Date(date);
				exit = false;			
			}
		}while(exit);
		diary.setDate(diarydate);
		System.out.println("日期设置成功");
		
		//设置标题
		System.out.print("请输入标题，且不能超过 12 个字:");
		String title = input.next();
		while(!diary.setTitle(title)){
			System.out.println("字数不符合要求，请重新输入");
	    	title=input.next();
		}
	    System.out.println("标题设置成功");
	    
	    //设置日记内容
	    System.out.print("请输入您的日记内容:");
	    String context=input.next();
	    diary.setContent(context);
	    System.out.println("日记内容设置成功");
	    
	    System.out.println(diary.toString());
	    
	    return diary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public Mood getMood() {
		return mood;
	}
	public void setMood(Mood mood) {
		this.mood = mood;
	}
	public String getTitle() {
		return title;
	}
	public boolean setTitle(String title) {
		if(title.length()>0&&title.length()<12){
			this.title = title;
			return true;
		}
		else{
			return false;
		}
		
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
