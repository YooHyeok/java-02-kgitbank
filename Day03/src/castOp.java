
public class castOp {

	public static void main(String[] args) {
		//자료형 변환(cast연산)
		//boolean형을 제외한 기본형에서 형변환이 가능하다 -cast연산자 사용
		//cast연산자에 의한 자료형 변환
		// - 작은 자료형에서 큰 자료형의 변환은 캐스트 연산자 생략 가능
		// - (자료형)변수&상수
		
		int a = 5;
		int b = 3;
		
		System.out.println(a*b/2); //int형 연산이므로 결과값도 int
		System.out.println(a*b/2.0); //int형 연산에 실수연산이 추가되어 결과값은 double
		System.out.println((double)a*b/2); //int형을 강제로 변환 (접미사)
		byte c = 10;
		int d = c;
		
		d = 1025; //d = 4byte -> 0000 0000 0000 0000 0000 0010 0000 0000
		//c = d; 
		//d= 는 int형 c 는 byte형인데 더 큰형태를 작은형태에 넣으려하니 오류발생
		c = (byte)d; //0000 1010
			//형변환. -> 앞의 3byte가 잘려나감
		
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		
		
		
	}

}
