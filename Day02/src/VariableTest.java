
public class VariableTest {//소스파일과 동일해야함.

	public static void main(String[] args) {
		boolean a = 10 > 5;
		System.out.println(a);
		
		a = false;
		System.out.println(a);
		//java에서는 정수 연산을 수행할 때 4byte길이의 int형으로 변환해서 처리한다.
		//java에서는 unsigned형을 허용하지 않는다.
		//byte = 1byte, short = 2byte, int = 4byte, long = 8byte
		//0 - 8진수 
		//0x - 16진수
		
		byte b = 127;
		System.out.println(b++);
		System.out.println(b);
		//16진수. 10 a~z 
		//ff = 1111 - 8bit 1byte
		//16진수 = 4bit사용
		//f = 11  4bit중 가장큰수
		short s = 0x7fff; //7=0111
		s++;
		System.out.println(s);
		
		int i = 0x7fffffff; //4byte - 16bit
		System.out.println(i);
		i++;
		System.out.println(i);//자리올림 발생
		
		long l = 0x7fffffffffffffffL;// ff ff ff ff ff ff ff ff
		System.out.println(l);
		l++;
		System.out.println(l);
		
		//실수형 float = 4byte 16bit , double = 8byte 32bit
		//지수정보와 유효소수 정보를 저장한다.
		//고정소수점, 부동소수점방식으로 데이터를 저장
		
		System.out.println(3.14);
		float f = 123.456F;
		double d = 456.789D;
		
		System.out.println(f);
		System.out.println(d);
		
		int x= 5;
		int y = 3;
		System.out.println(x*y/2);	 //정수 연산 정수 = 정수
		System.out.println(x*y/2.0); //정수 연산 실수 = 실수
		
		//문자데이터의 인코딩 방식 = Unicode(2byte) utf-16 utf-8
		//문자열 데이터 타입 = String class사용
		//String name = "홍길동";
		
		//**문자열 코드**
		
		//BCD => 6bit
		// - 상위 2bit zone bit
		// - 하위 4bit data bit
		
		//ASCCI => 7bit + 1bit(Error확인)
		// - 상위 3bit zone bit
		// - 하위 4bit data bit
		
		//Unicode => 32bit //여러나라의 다국적 코드를 사용하므로
		//다국적 문자 표현을 위해서 16bit(2byte)만 사용(21bit)
		//EUC-KR => 16bit
		char ch = 'A';
		char code = '\u0041';//16진수
		System.out.println("ch="+ch);
		System.out.println("code="+code);
		
		ch='가';
		System.out.println(ch);
		System.out.println((int)(ch)); //44032 의 16진수 코드값 = ac00
		
		ch = '1' + '1'; 
		System.out.println(ch);
		System.out.println((int)(ch));
		
		//참조형
		// - 사용자 정의 데이터 타입
		// - 클래스 이름이 참조 변수의 타입이 된다
		// - 참조형 변수 간의 연산을 진행 할 수 없다
		
		//참조형 변수 선언
		// 클래스이름 변수이름
		
		//변수 : 데이터를 저장하기 위한 공간
		//		저장된 값의 변경이 가능하다
		
		//변수 선언 - 데이터를 저장하기 위한 공간을 확보하기 위한 명령
		// - 데이터 타입 변수명; int i;
		//_ (주로 시스템에서 사용하는 변수)
		//$
		//변수 이름 앞에 숫자가 오면 안됨.
		//클래스 이름 - 대문자로 시작
		//변수의 이름 - 소문자로 시작, 연결되는 단어의 첫 글자는 대문자.
		//int javaClass; //문법은 아니지만 식별하기 편하게 사용.
		
		//상수 : 데이터
		//변경 불 가능
		//종류 : 리터럴상수(문자(열),숫자 그대로의 값), 심볼릭상수(논리적으로 상수화 시켜주는 수,final)
	
		
		
		String name = "주말에 이게 뭔짓..."; //상수.
		System.out.println(name);
		String str = "자바 공부 하자";
		System.out.println("문자열 연산: " + name + str);
	
	}

}


















