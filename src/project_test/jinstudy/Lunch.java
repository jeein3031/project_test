package project_test.jinstudy;

import java.util.Random;

public class Lunch {
	public static void LunchMenu() {
		String[] menus = {"우육탕면", "샐러드", "마라탕", "칼국수", "김치찌개"};
		
		Random ran = new Random();
		int choice = ran.nextInt(menus.length);
		
		String TodayMenu = menus[choice];
		
		System.out.println("오늘의 점심 메뉴는: " + TodayMenu);
	}
}


//	class MyTestClass  {
//		
//	    public static void Drink() {  	
//	    	String[] drinks = {"아메리카노", "바닐라라떼", "제로콜라","애플쥬스", "비타민쥬스"};
//	    	Random ran = new Random();
//	    	int Choose = ran.nextInt(drinks.length);
//	    	String todaydrink = drinks[Choose];
//	    	
//	    	System.out.println("오늘의 음료수는: " + todaydrink);    	
//	    }
//	    	
//	}
