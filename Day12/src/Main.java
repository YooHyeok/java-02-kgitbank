import oop.sample.*; //Info라는 클래스의 경로를 정의해줘야 접근가능
						//oop sample 안의 info라는 클래스에 저장되있는 모든 정보 사용가능.
public class Main {

	public static void main(String[] args) {
		
//		String name = "홍길동";
//		int age = 28;
//		
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
		
		//Info라는 데이터타입의 inf변수를 정의한 후 new라는 연산자를 사용하여 공간확보
//		Info inf = new Info() ;
//		System.out.println("before age = " + inf.age);
//		inf.age = 35;
//		System.out.println("after age = " + inf.age);
//		inf.setInfo("김강사", 35);
//		inf.disp();
		String color = " ";
		Tv t = new Tv();
		System.out.println(t.color); //1.
		System.out.println(t.getColor()); //2.
		
		//클래스에 지정해놓은 setColor함수에 "빨강"이라는 인자값을 넣어 기능을사용
		t.setColor("빨강"); //3. 출력
		System.out.println(t.color);
		System.out.println(t.getColor());
		
		
		t.power();
		t.power();
		t.showChannel();
		t.setChannel(12);
		t.channelUp();
		t.setChannel(32);
		for (int i = 0; i<7; i++) {
			t.channelDown();
		}
		for(int i = 0; i <25; i++) {
			t.channelDown();
		}
	}

}

















