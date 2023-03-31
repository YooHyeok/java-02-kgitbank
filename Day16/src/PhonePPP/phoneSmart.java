package PhonePPP;

public class phoneSmart {

	static int a;
	
	public static void main(String[] args) {
		PhoneS p1 = new PhoneS("갤럭시10","SKT",1200000);
		PhoneS p2 = new PhoneS("G8","LGT",900000);
		PhoneS p3 = new PhoneS("아이폰11","KT",900000);
		
		PhoneS[] arrayM = new PhoneS[] {p1,p2,p3};
		
		p1.disp(1);
		p2.disp(2);
		p3.disp(3);
		
		System.out.println("번호 정보 출력");
		for (int i=0; i<3; i++) {
			arrayM[i].disp(i+1);
		}
		
//		p1.compare(p2);
//		p1.compare(p3);
//		p2.compare(p3);
//		
//		p1.setData("갤럭시노트10", "KT", 600000);
//		
		PhoneS.compare(p1,p2);
		PhoneS.compare(p1,p3);
		PhoneS.compare(p2,p3);
		/*
		변수의 초기화
			-멤버변수 :
				초기화를 하지 않아도 자동으로 변수의 자료형에 맞는 기본값으로 초기화가 이루어진다.
			-지역변수 :
				반드시 초기화를 진행한 후에 사용해야 한다.
		초기화 방법
			- 자동 초기화
			- 명시적 초기화
			- 초기화 블럭
			- 생성자
			
		- 명시적 초기화 -
		class test{	
			static int a;
			PhoneS p1;
			float f = 3.14;	
		}
		
		- 초기화 블럭 -
		{	
			a = 10;
			p1 = new PhoneS();
		}
		
		Test(){
			a = 100;
			p1.setName("갤럭시10");
		}
		Test t1() = new Test();
		Test t2() = new Test();
		*/
		
	}
	
}
class PhoneS{
	private String name;
	private String telecom;
	private int price;
	
	PhoneS(){
		setName(name);
	}
	
	PhoneS(String name){
		this.name = name;
	}
	
	PhoneS(String name, String telecom, int price){
		this.name = name;
		this.telecom = telecom;
		this.price = price;
	}
	


	
	public void setData(String name, String telecom, int price) {
		if(name != null) {
			System.out.println("장치 이름은 변경할수 없습니다.");
		}
		this.telecom = telecom;
		this.price = price;
		if(price < 900000) {
			this.price = 900000;
			}
	}
	
	private void setName(String name) {
		this.name = name;
	}
	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	public void setPrice(int price) {
		this.price = price;
		
		if(price < 900000) {
		this.price = 900000;
		}
	}
	
	public String getName() {
		return this.name;
	}
	public String getTelecom() {
		return this.telecom;
	}
	public int getPrice() {
		return this.price;
	}
	
	public void disp() {
		System.out.print("\t"+getName());
		System.out.print("\t"+getTelecom());
		System.out.println("\t"+getPrice()+"원");
	}
	public void disp(int num) {
		System.out.print("["+num+"]");
		System.out.print("\t"+getName());
		System.out.print("\t"+getTelecom());
		System.out.println("\t"+getPrice()+"원");
	}
	public void compare(PhoneS p) {
		if(this.price > p.price) {
			System.out.println(this.name + "이(가) 더 비쌉니다.");
		}
		else if (this.price<p.price) {
			System.out.println(p.name + "이(가) 더 비쌉니다");
			
		}
		else {
			System.out.println(this.name + "과" + p.name+"은(는) 가격이 같습니다.");
		}
		
	}
	public static void compare(PhoneS p1, PhoneS p2) { //static 
		if(p1.price > p2.price) {
			System.out.println(p1.name + "이(가)"+p2.name+"보다 더 비쌉니다.");
		}
		else if(p1.price < p2.price) {
			System.out.println(p2.name + "이(가)"+p1.name+"보다 더 비쌉니다.");
		}
		else {
			System.out.println(p1.name + "과" + p2.name+"은(는) 가격이 같습니다.");
		}
	}
}


