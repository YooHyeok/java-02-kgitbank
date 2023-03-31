
public class Main {

	public static void main(String[] args) {
		//int add(int a, int b)
		//	int result = a+b;
		//	return result;
		//}
		//메서드 호출
		//	- 참조변수.메서드이름();
		//	- 참조변수.메서드이름(값1, 값2, ...);
		
		Main res = new Main(); //인스턴스 변수 생성
		int result;
		result = res.add(3, 10);
		System.out.println("result(3, 10) = " +result);
		
		int[] result1 = {0};
		res.addArray(3, 10, result1);
		System.out.println("result1[0]="+result1[0]);
		System.out.println("result1[1]="+result1[1]);
		
		//static메서드는 같은 클래스 내의 인스턴스 메서드를 호출할 수 없다.
	}
	
	int add(int a, int b) {
		int result = a+b;
		
		return result;
		//return a+b;
	}
	void addArray(int a, int b, int[] result ) {
		result[0] = a+b;
		//같은 클래스의 메서드끼리는 참조변수를 사용하지 않는다.
		result[1] = add(3,10) + 10;
		//result[1] = result[0] + 10;
	}
	/*
	접근 제어자
	캡슐화, 정보은닉을 구현하기 위한 시스템
		-외부로 부터 데이터를 보호하기 위해 접근을 제한한다.
		-객체를 캡슐로 싸서 객체의 내부를 보호한다.
		-객체의 실제 구현 내용을 외부에 감춘다
		
	접근 제어자 종류
	 	- private : 같은 클래스 내에서만 접근 가능
	 	- default(package) : 같은 패키지 내에서만 접근 가능
	 	- protected : 같은 패키지, 그리고 다른 패키지의 자손 클래스에서 접근 가능
	 	- public : 접근 제한이 없다.
	
	사용 가능한 접근 제어자
		- class : public, default
		- method/variable : public, protected, default, private
		- local 변수 : 사용하지 않는다.
	*/
	
}
