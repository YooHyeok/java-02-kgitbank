package oop.lab;

public class AccessModifier {
	/*
	setter : 멤버 변수의 값을 셋팅하는 메소드
		-매개변수명은 일반적으로 멤버변수명과 동일하게 적는다
		-상황에 따라 줄임말을 적거나 앞에_를 붙이기도 한다.
	 	-형식
	void set멤버변수명(매개변수1,매개변수2,...){
		값 세팅;
	}
	 */
	/*
	getter : 멤버변수의 값을 반환해주는 메소드
		-형식
	반환자료형 get멤버변수명() {
		return 값;
	}
	*/
	//멤버
	//public String name; //public은 다른 패키지에 공유가능
	
	private String name;
	private int age;	//private는 같은 클래스  내에서만 공유가능
	
	
	public void setName(String name1) {
		
		name = name1;
	}
	
	public void setAge(int age1) {
		if(age1 <= 0) {
			age = 1;
		}
		else {
		age = age1; //같은클래스이므로 private로 선언된 변수 age에 접근 가능
		}
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
		
	}

	
}

class Time{
	public int hour;
	public int minute;
	public int second;

	public void setHour(int hour1) {
		if(hour1 == 24) {
			hour = 0;
			System.out.println("자정 12시 입니다.");
		}
		else if (hour1 == 12) {
			hour = hour1;
			System.out.println("오후 12시 입니다.");
		}
		else {
			hour = hour1;
			System.out.println("오전 입니다.");
		}
	}
	public void setMinute(int minute1) {
		if(minute1 <0 || minute1>24) {
			System.out.println("분 입력 오류");
			
		}
		else {
			minute = minute1;
		}
	}
	public void setSecond(int second1) {
		if(second1 < 0 || second1 > 60) {
			System.out.println("초 입력 오류");
		}
		else {
			second = second1;
		}
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void dispTime() {
		System.out.print(getHour() + "시");
		System.out.print(getMinute() + "분");
		System.out.println(getSecond() + "초");
	}
	
	/*
	 메소드 호출 방식 : 기본형과 참조형 매개 변수 사용
	 	- 메서드를 호출 할 때 매개변수로 지정한 값을 복사해서 전달한다
	 	
	 메소드로 기본형 변수가 전달되는 경우
	 	- 기본형 값이 복사된다
	 	- 변수의 값을 읽기만 할 수 있다
	 
	 메소드로 객체가 전달되는 경우
	 	- 객체가 복사되어 전달 되는 것이 아니고, 참조변수의 값이 복사되어서 전달된다.
	 	- 변수의 값을 읽고 변경할 수 있다
	 	- 인수와 매개변수 모두 동일한 객체를 가리킨다.
	 	
	 메소드로 배열이 전달되는 경우
	 	- 배열도 객체
	 	- 배열 참조변수를 복사한다.
	 	
	 */
	
	
}
	























