
public class Main {
	public static void main(String[] args) {
		//		FireCar fc = new FireCar();
		//		Ambulance ac = new Ambulance();
		//		//		ac = (Ambulance)fc;
		//
		//		Car car = new Car();
		//		car = fc;
		//		car.drive(car);

		//		FireCar fc2 = null; 
		//		fc2 = (FireCar)car;

		//		Buyer b = new Buyer();
		//		Tv t = new Tv();
		//		Computer c = new Computer();
		//		Audio a = new Audio();
		//
		//		b.buy(t);
		//		b.buy(c);
		//		b.buy(a);
		//		b.buy(t);
		//		b.buy(c);
		//		b.buy(a);
		//	
		//
		//		b.showList();
		//		System.out.println("현재 남은 돈 : " + b.money);
		//		System.out.println("보너스 점수 : " + b.bonusPoint);
		ExceptionEx eex = new ExceptionEx();
		eex.method();
		System.out.println("프로그램 종료");
	}
}
class ExceptionEx{
	//메서드의 선언부에 throws를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어준다
	//	-메서드를 사용 할 때 어떤 예외들이 처리되어야 하는지 caller에게 정보를 전달하기 위한 목적
	void method() {
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("method()에서 예외처리");
			e.printStackTrace();
		}
	}
	void method1() throws Exception {
		method2();
	}
	void method2() throws Exception {
		try {
			System.out.println("method2()에서 사용자 예외 발생");
			Exception ex = new Exception();
			throw ex;
	
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("method2()에서 예외처리");
			throw e;
		}
	}	
}

/*
class ExceptionEx{
	void method() {
		//예외가 발생했을 때 생성되는 예외 클래스의 인스턴스에는 발생한 예외에 대한
		//정보가 담겨져 있다
		
		//catch()선언되어 있는 참조 변수를 통해서 인스턴스에 접근 할 수 있다
		
		//	- printStrackTrace();
		//	  :예외 발생 당시의 호출 스택에 있는 메서드의 정보와 예외 메시지를 화면에 출력
		//	- getMessage();
		//	  : 발생한 예외 클래스의 인스턴스에 저장된 메시지를 출력
		
		try {
			System.out.println("method()실행");
			return;
//			Exception e = new Exception("ExceptionEx method() 에서 예외 발생");
//			System.out.println(0/0);
//			System.out.println(2);
//			throw e;
		}
		catch(Exception e) {
			System.out.println("catch실행");
		}
		finally {
			System.out.println("finally실행");
		}
	}
}
*/
		
/*
class ExceptionEx{
	void method() {
		System.out.println(1);
		//throw 키워드를 사용해서 사용자 예외를 발생 시킬 수 있다.
		// - 연산자 new를 이용해서 발생 시키려는 예외 클래스의 객체를 만든다.
		try {
			Exception e = new Exception("사용자 예외 발생");
			System.out.println(2);
			throw e;
//			System.out.println(3);
		}
//		catch(ArithmeticException e) {
		catch(Exception e) {
			System.out.println("사용자 예외 처리");
			System.out.println(4);
		}
		System.out.println(5);

	}
}
*/

class Product{
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product{
	Audio(){
		super(300);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Product [] item = new Product[10];
	int i = 0;
	//	void buy(Tv t) {
	//		money -= t.price;
	//		bonusPoint += t.bonusPoint;
	//	}
	//	void buy(Computer c) {
	//		money -= c.price;
	//		bonusPoint += c.bonusPoint;
	//	}
	//	void buy(Audio a) {
	//		money -= a.price;
	//		bonusPoint += a.bonusPoint;
	//	}
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;

		if (i>=10) {
			System.out.println("더이상 제품을 구입할 수 없습니다.");
			return;
		}
		item[i++] = p;
		System.out.println(p+"을(를) 구입하셨습니다.");
	}

	void showList() {
		String itemList = " ";

		for(int i = 0; i<item.length; i++) {
			if(item[i] == null) {
				break;
			}
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 제품은 " + itemList+"입니다.");
	}
}


class Car{
	String color;
	int door;
	/*
	instanceof 연산자
		- 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위한 연산자
		- 왼쪽에는 참조변수, 오른쪽에는 클래스이름을 위치한다
		- boolean값을 리턴한다.
	 */

	void drive(Car c) {
		System.out.println("출발");
		if(c instanceof FireCar) {
			FireCar fc = (FireCar)c;
			fc.water();
		}
		else if(c instanceof Ambulance) {
			Ambulance ac = (Ambulance)c;
			ac.hospital();
		}
		System.out.println("출발");

	}

	void park() {
		System.out.println("정지");
	}

}

class FireCar extends Car{
	void water() {
		System.out.println("[ 소방차 ]");
	}
}
class Ambulance extends Car{
	void hospital() {
		System.out.println("[ 앰뷸런스 ]");
	}
}


