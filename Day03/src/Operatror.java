
public class Operatror {

	public static void main(String[] args) {
		//산술 연산자
		//byte, char, short, int, long
		//크기가 4byte이하인 자료형을 int형으로 변환한 후 연산
		//byte, char, short, => int형으로 변환
		
		//자료형의 표현 범위가 큰 쪽에서 맞춰서 형 변환된 후 연산
		//int + float => float + float
		
		//정수 연산의 결과는 정수
		//byte + byte => int + int = int
		//byte + short => int + int = int
		//char + char => int + int = int
		
		//정수와 실수연산의 결과는 실수
		//float + int => float + float = float
		//long + float => float + float = float
		//float + double => double + double = double
		
//		byte a = 8; //a 0000 1010
//		byte b = 64;
//		//a*b = 1 0000 0000 //하위 8비트만 취함.
//		byte c = (byte)(a*b); // a+b는 int형이므로 형변환 필요
//		System.out.println(c);
		
		int a = 1000000;
		int b = 2000000;
		
		long c = ((long)a*b);

		System.out.println(c);
		
		
	}

}
