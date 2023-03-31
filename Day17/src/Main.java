
public class Main {

	public static void main(String[] args) {
//		InitEx ie = new InitEx();
//		for(int i=0; i<InitEx.x.length; i++ ) {
//			System.out.println("x["+i+"]= "+InitEx.x[i]);
//		}
//		
//		System.out.println();
//		InitEx ie1 = new InitEx();
//		for(int i=0; i<InitEx.x.length; i++ ) {
//			System.out.println("x["+i+"]= "+InitEx.x[i]);
//		}
		
//		Production p1 = new Production();
//		Production p2 = new Production();
//		Production p3 = new Production();
//		System.out.println("p1의 제품번호 : "+Production.p1);
//		System.out.println("p2의 제품번호 : "+Production.p2);
//		System.out.println("p3의 제품번호 : "+Production.p3);
//		System.out.println("총 제품 수 : " + Production.cnt);
//		System.out.println("=================");
//		Product Pr1 = new Product();
//		Product Pr2 = new Product();
//		Product Pr3 = new Product();
//		System.out.println("Pr1의 제품번호 : "+Pr1.serialNo);
//		System.out.println("Pr2의 제품번호 : "+Pr2.serialNo);
//		System.out.println("Pr3의 제품번호 : "+Pr3.serialNo);
//		System.out.println("총 제품 수 : " + Product.pCount);
		
		/*
		상속 : 이미 작성된 클래스(부모클래스)를 이어받아 새로운 클래스(자식클래스)를 생성하는 기법
			- 기존의 코드를 재활용하기 위한 기법
			- 자바에서는 단일 상속만을 허용
			- 상속받고자 하는 클래스의 이름을 키워드 extends와 함께 사용
			- 생성자와 초기화 블럭은 상속되지 않는다
		사용 예
		class child extends Parent{
		멤버선언;
		}
		
		조상클래스 : 부모 클래스, 상위 클래스, 기반 클래스
		자손클래스 : 자식 클래스, 하위 클래스, 파생 클래스
		클래스간의 관계에서 형제 관계는 허용하지 않는다.
		*/
		Parent prnt = new Parent();
		ChildFst fst = new ChildFst();
		fst.age = 10;
		System.out.println("fst.age = "+ fst.age);
		fst.method();
		ChildSnd snd = new ChildSnd();
		snd.age = 7;
		System.out.println("snd.age = "+ snd.age);
		snd.method();
		prnt.method();		
		
//		System.out.println("parent.age = "+ prnt.age); //인스턴스변슈ㅜ는 디폴트값으로 초기화된다.
		/*
		메소드 오버라이딩 : 조상 클래스로 부터 상속받은 메서드의 내용을 변경할 수 있다.
		오버라이딩 조건
			- 조상 클래스의 메서드와 이름이 같아야 한다.
			- 조상 클래스의 메서드와 매개 변수가 같아야 한다.
			- 조상 클래스의 메서드와 리턴 타입이 같아야 한다.
			- 인스턴스 메서드를 static메서드로 또는 그 반대로 변경할 수 없다.
			- 
		*/
	}

}
class Parent{
	int age = 47;
	void method() {
		System.out.println("parent.method = "+ age);
	}
}
class ChildFst extends Parent{
	int age = 10;
	void method() {
		System.out.println("parentFst.method = "+ age);
	}
}
class ChildSnd extends Parent{
	int age = 7;
	void method() {
		System.out.println("parentSnd.method = "+ age);
	}
}

class Product{
	static int pCount = 0; //static => class
	int serialNo=0; //인스턴스 변수이기때문에 인스턴스가 생성될 때 마다 한번만 실행
	{
		pCount++;
		serialNo = pCount;
	}
	Product(){
		serialNo = pCount;
	}
}

class Production{
	static int [] p = new int [] {};
	
	static int p1;
	static int p2;
	static int p3;
	static int cnt;
	
	{
		for(int i=0; i<3; i++) {
			p[i] = i+1;
			
		}
		cnt++;
	}
	
	Production(){
		p1 = p[0];
		p2 = p[1];
		p3 = p[2];
		
	}
	
	
}
class InitEx{
	static int[] x= new int [10];
	int y;	
	
	//블록 앞에 static 클래스 변수를 초기화 하겠다는 정의
	static{ 
		System.out.println("static{} x=" + x);
	}
	
	//method변수를 초기화 하겠다는 정의
	{
		for(int i=0; i<x.length; i++) {
			x[i] =(int)(Math.random()*10)+1;
		}
		System.out.println("{} y=" + y);
	}
	
	InitEx(){
		y=200;
		System.out.println("InitEx() x=" + x);
		System.out.println("InitEx() y=" + y);
	}
	
	int method() {
		int a = 0;
		int b = a;
		return a;
		
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		// Alt + 상하  방향키 = 해당 줄로 이동
		// Alt + Ctrl + 상하 방향키 = 커서로부터 복사후 붙여넣기

	}
	

}
