import oop.lab.*;
import oop.lab.AccessModifier;
public class Main {

	public static void main(String[] args) {
		AccessModifier amK = new AccessModifier(); //데이터타입에대한 정보가 없으면 빨간줄 -> import해주면됨
		AccessModifier amP = new AccessModifier();

		//		am.name = "김강사";
		//		am.age = 28;

		String name;
		int age;

		amK.setName("김강사");
		amK.setAge(28);
		name = amK.getName();
		age = amK.getAge();
		System.out.println("나의 이름은 "+name+" 입니다.");
		System.out.println("나의 나이는 "+age+" 살 입니다.");

		amP.setAge(-20);
		amP.setName("박강사");
		System.out.println("나의 이름은 "+amP.getName()+" 입니다.");
		System.out.println("나의 나이는 "+amP.getAge()+" 살 입니다.");

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


		//		Data d = new Data();
		//		d.x = 10;
		//		int[] x = {10};
		//		System.out.println("main():x = "+x[0]);
		//		
		//		
		//		change(x);
		//		System.out.println("After change:x = " + x[0]);
		//	}
		//	static void change(int[] x) {
		//		x[0] = 1000;
		//		
		//		System.out.println("change():x = " + x[0]);

		MethodOvl mo = new MethodOvl();
		
		byte c,d;
		c=1;
		d=2;
		
		System.out.println("mo.add(a,b) = "+mo.add(c,d));
		System.out.println("mo.add(3,5) = "+mo.add(3,5));
		System.out.println("mo.add(3L,5) = "+mo.add(3L,5));
		System.out.println("mo.add(3L,5L) = "+mo.add(3L,5L));
		System.out.println("mo.add(3.14,5) = "+mo.add(3.14,5));
		System.out.println("mo.add(3,5L) = "+mo.add(3,5L));

		int[] a = {3,5,7,9};
		System.out.println(mo.add(a));		
	}
	/*
	메소드 오버로딩(method overloading)
		- 한 클래스 내에 같은 이름의 메서드를 여러 개 정의할 수 있다.
		- 메서드의 타입을 구분하기 위해서 메서드 이름과 매개변수의 정보를 사용한다

	오버로딩의 성립 조건
		- 메서드 이름이 동일해야 한다
		- 매개변수의 개수, 타입이 달라야 한다
		- 리턴 타입은 함수 메서드 타입 구분 정보에 포함되지 않는다
	 */
	
	/*
	this.포인터
		- 메소드에서 this는 현재 객체를 나타낸다.
		- 인스턴스 자신을 가리키는 참조 변수이다.
		- 인스턴스 멤버에 대해서만 사용할 수 있다.
		- 모든 인스턴스에 지역변수로 숨겨진 채로 존재한다.
	*/
}

class MethodOvl{

	int add(int a, int b) {
		return a+b;
	}

	long add(int a, long b) {
		return a+b;
	}

	long add(long a, int b) {
		return a+b;
	}

	long add(long a, long b) {
		return a+b;
	}

	int add(int[] a) {
		int res = 0;

		for(int i=0; i<a.length; i++) {
			res += a[i];
		}
		return res;
	}

	double add( double a, double b) {
		return a+b;
	}
}

class Data{
	int x;
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
	public void setSecond(int second) {
		if(second < 0 || second > 60) {
			System.out.println("초 입력 오류");
		}
		else {
			this.second = second;
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
}
