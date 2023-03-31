
public class Main {

	public static void main(String[] args) {
		/*
		생성자 : 
			- 객체가 생성될 때, 필드에게 초기값을 제공하고 필요한 초기화 절차를 실행하는 메소드
			- 리턴값이 없지만, void키워드를 사용하지 않는다.
			- 클래스 내에서 선언
			- 하나의 클래스에 여러 개의 생성자가 있을 수 있다.
			- 모든 클래스는 반드시 하나 이상의 생성자가 정의 되어있어야 한다.
			- 기본 생성자가 컴파일러에 의해 자동으로 생성 된다.
			- 기본 생성자는 소스파일에 생성자가 하나도 정의되지 않았을때 에만 자동으로 추가된다.
			- 클래스의 접근제어자가 public인 경우, 기본생성자도 'public 클래스이름() {}' 형식으로 자동으로 생성된다.

		생성자 조건
			- 생성자의 이름은 클래스의 이름과 같아야 한다.
			- 생성자의 리턴값은 없다

		생성자 정의
			- 클래스이름(데이터타입 변수1, 데이터타입 변수2,...){
				  this.age = 변수1;
		}

		 */

		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		Data2 d3 = new Data2(300);

		System.out.println("d1.value = "+d1.value);
		System.out.println("d2.value = "+d2.value);
		System.out.println("d3.value = "+d3.value);
		System.out.println(" ");

	}
}
class Data1{
	int value;

}
class Data2{
	int value;

	Data2(){ //생성자
		value = 100;
	}
	Data2(int value){
		this.value = value;
	}
}
