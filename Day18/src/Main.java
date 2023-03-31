
public class Main {

	public static void main(String[] args) {
		/*
		super : 자손 클래스에서 조상 클래스로 부터 상속 받은 멤버를 참조하는데
				사용되는 참조 변수
			- 상속 받은 멤버와 자신의 클래스에 정의된 멤버의 이름이 같을 때 super 사용
			- super대신 this를 사용할 수 도 있다.
			- static메서드는 인스턴스와 관련이 없다
			- static메서드에서는 사용할 수 없고, 인스턴스에서만 사용.
		*/
		
//		Child c = new Child();
//		c.method();
//		Person people1 = new Person("people1", 18); 
//		Person people2 = new Person("people2", 28); 
//		
//		people1.dispInfo();
//		people2.dispInfo();
//		
//		Person saram = new Person();
//		saram.name = "saram.1";
//		saram.age = 30;
//		saram. dispInfo();
//		
//		Worker man = new Worker("김강사", 28, 178.5, 75.5);
//		man.dispInfo();
//		Worker man1 = new Worker();
//		man1.name = "man1";
//		man1.age = 38;
//		man1.dispInfo();
		
		/*
		final modifier(제어자) : 상태와 기능을 변경 할 수 없는 상수로 만들어 준다.
		 - 클래스 : 상속이 안된다.
		 - 메서드 : 오버라이딩이 안된다.
		 - 변수 : 값을 변경할 수 없다.
		*/
//		FinalEx fe = new FinalEx();
//		System.out.println("Scale : " + fe.getScale());
//
//		fe.setScale(10);
//		
//		CFinalEx cfe = new CFinalEx();
//		cfe.setScale(10);
//		System.out.println("cScale : " + cfe.getScale());
//		System.out.println();
		/*
		abstract : 추상화
			- 추상화 : 구체적 개념에서 공통된 성질을 뽑아 일반적인 개념으로 접근
			- 클래스 간의 공통점을 찾아 내서 공통의 조상을 만드는 작업
		추상 클래스
			- 추상 메서드를 포함하는 클래스
			- 추상클래스로 인스턴스를 생성할 수 없다.
			- 상속을 통해서만 자손 클래스에 의해서 완성될 수 있다.
		추상 메서드 선언
			- abstract class AbsEx{
				abstract void setArea();
			}
		*/
//		AbsEx ae = new AbsEx();
//		CAbsEx cae = new CAbsEx();
//		
//		cae.setArea();
//		System.out.println("Area : " + cae.getArea());
		
		/*
		interface
			-모든 멤버 변수는 public static final(상수)이어야 한다.
			-모든 메서드는 public abstract이어야 한다.
			-생략된 제어자는 컴파일러가 자동적으로 추가해 준다
			-클래스를 작성하는 것과 같지만, 키워드로 class대신 interface를 사용한다.
		*/
		/*
		CAbsEx cex = new CAbsEx();
		cex.setArea();
		System.out.println("Area : " + cex.getArea());
		
		다형성
			- 한 타입의 참조변수로 여러 타입이 객체를 참조 할 수 있다
			- 조상 클래스 타입의 참조 변수로 자손 클래스의 인스턴스를 참조 할 수 있다.
			- 상속 관계에 있는 클래스 사이에서 형 변환이 가능하다.
			- 간접 적인 상속 관계의 경우에도 형 변환이 가능 하다.
		Up Casting
			- 자손 타입의 참조 변수를 조상 타입으로 형 변환 하는것.
			- 형 변환 생략이 가능
		Down Casting
			- 조상 타입의 참조변수를 자손 타입으로 형 변환 하는 것 
			- 형 변환 생략이 불가능.
		*/
	}

}
//abstract class AbsEx{
interface AbsEx{
	public static final int width = 10;
	int height = 20;
//	int area;
	
	abstract public void setArea();
	
//	public int getArea() {
//		return this.area;
	abstract public int getArea();
	
//추상클래스 상속	
//	class CAbsEx extends AbsEx{
//		public void setArea() {
//			width = 10;
//			height = 20;
//			area = width * height;
//		}
//		
//	}	
//인터페이스 구현 (상속)
class CAbsEx implements AbsEx{
	abstract public void setArea() {
		this.area = width * height;
	}
	abstract public int getArea() {
		return this.area;
	}
}
//class CAbsEx extends AbsEx{
//	CabsEx1(){
//}



abstract class FinalEx{
	final int defaultScale = 100000;
	int scale;
	abstract void setScaleII();
	public void setScale(int scale) {
		final int level = 1;
//		defaultScale = defaultScale / (scale*level);
		this.scale = defaultScale / (scale*level);
	}
	public int getScale() {
		return this.scale;
	}
}
class CFinalEx extends FinalEx{
	public void setScale(int scale) {
		final int level = 1;
//		level = scale * scale
		this.scale = defaultScale / (scale*scale);
	} 
}

class Parent{
	int x = 10;
	void method() {
		System.out.println("Parent method()");
	}
	
}
class Child extends Parent{
	void method() {
		int x = 20; 
//		System.out.println("x =" + x); //스택영역에있는, 메소드 내에 있는 x
//		System.out.println("this.x=" + this.x); // 200번지에 있는 x
//		System.out.println("super.x=" + super.x); // 100번지에 있는 x
		super.method();
//		this.method();
		System.out.println("Child method()");
	}
}
class Person{
	protected String name; //같은패키지내 혹은, 다른 패키지에 있는 나를 상속받은 모든자식들 클래스까지
	protected int age;	//private = 클래스내에서만
	//static -
	//클래스 영역에 선언된 멤버들 (instance) 앞에 붙으면 클래스 멤버가됨? 12.09 -02, 23분
	//클래스 안에 만들어놓고 모든 인스턴스들이 공유하는 변수 - 메소드 영역에 생성
	//
	Person(){
		System.out.println("Person()");
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age)");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	void dispInfo() {
		System.out.println("이름: "+getName());
		System.out.println("나이: "+getAge());
	}
}
class Student extends Person{
	int hakbun;
	int hakjum;
	
	Student(){
		System.out.println("Student()");
		
	}
	Student(String name, int age, int hakbun, int hakjum){
		this.hakbun = hakbun;
		this.hakjum = hakjum;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public void setHakjum(int hakjum) {
		this.hakjum = hakjum;
	}
	public int getHakbun() {
		return this.hakbun;
	}
	public int getHakjum() {
		return this.hakjum;
	}
	void dispInfo() {
		super.dispInfo();
		System.out.println("학번: "+getHakbun());
		System.out.println("학점: "+getHakjum());
	}	
	
}
class Worker extends Person{
	private double height;
	private double weight;
	
	Worker(){
		System.out.println();
	}
	Worker(String name, int age, double height, double weight){
//		super.setAge(age);
//		super.setName(name);
		/*
		조상 클래스의 생성자 : 
					-자손 클래스의 인스턴스가 조상클래스의 멤버를 사용하기
					위해서는 조상클래스의 멤버들이 초기화작업이 먼저 이루어
					져야 한다.
						 
		super() : 조상클래스의 생성자 호출
		this() : 같은 클래스의 다른 생성자 호출
		 */
		
		super(name, age);
 		this.height = height;
		this.weight = weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
	void dispInfo() {
		super.dispInfo();
		System.out.println("키 : " + getHeight());
		System.out.println("몸무게 : " + getWeight());
	}
}














