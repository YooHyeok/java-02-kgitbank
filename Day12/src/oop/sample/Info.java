package oop.sample;

public class Info {
	String name = "홍길동";
	int age = 20;
	
	public void setInfo(String name1, int age1) {
		if(age1 > 40 || age1 <= 0) {
			return;
		}
		name = name1;
		age = age1;
	}
	
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
