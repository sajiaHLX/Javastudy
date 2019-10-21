package menu4;

import java.util.Random;
import java.util.Scanner;

public class User {
	
	private boolean isLogin = false;
	private int nowUser = 0;
    private String[] userNameArray = new String[100];
    private String[] passWordArray = new String[100];
    private String[] nameArray = new String[100];
    private String[] emailArray = new String[100];
    private String[] answerArray = new String[100];
    private int[] questionOptionArray = new int[100];
	
    public String[] getUserNameArray() {
		return userNameArray;
	}
    public String[] getAnswerArray() {
		return answerArray;
	}
    public String[] getEmailArray() {
		return emailArray;
	}
    public String[] getNameArray() {
		return nameArray;
	}
    public int getNowUser() {
		return nowUser;
	}
    public String[] getPassWordArray() {
		return passWordArray;
	}
    public int[] getQuestionOptionArray() {
		return questionOptionArray;
	}
    public boolean getIsLogin() {
		return isLogin;
	}
    public void setAnswerArray(String[] answerArray) {
		this.answerArray = answerArray;
	}
    public void setEmailArray(String[] emailArray) {
		this.emailArray = emailArray;
	}
    public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
    public void setNameArray(String[] nameArray) {
		this.nameArray = nameArray;
	}
    public void setNowUser(int nowUser) {
		this.nowUser = nowUser;
	}
    public void setPassWordArray(String[] passWordArray) {
		this.passWordArray = passWordArray;
	}
    public void setQuestionOptionArray(int[] questionOptionArray) {
		this.questionOptionArray = questionOptionArray;
	}
    public void setUserNameArray(String[] userNameArray) {
		this.userNameArray = userNameArray;
	}
}
