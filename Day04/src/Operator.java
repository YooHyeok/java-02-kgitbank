
public class Operator {

	public static void main(String[] args) {
		char c1 = 'a'; //a=97(ASCCI)
		char c2 = c1;
		char c3 = ' ';

		int i = c1 + 1;
		int j = 'a' + 1;
		System.out.println("i="+i);
		System.out.println("j="+j);

		c3 = (char)(c1+1); 
		char c4 = 'a' + 1;
		//int 1을 문자열 'a'에 더하면 char형인 c1이 int형인 4byte로 바뀌어 
		//97로 인식되어 1을더한 정수 98 값을 다시 char형으로 형변환 해주면 b
		c2++;//98
		c2++;//99
		System.out.println("c3="+c3);
		System.out.println("c2="+c2);

		char lower = 'a';
		char upper = (char)(lower-32);
		System.out.println("upper="+upper);

		//정수 연산 성질을 이용하여 소수점 3째자리 까지 연산
		float pi = 3.141592f;//3.141
		//float shortPi = pi*1000; //3141.592
		//float shortPi = (int)(pi*1000); //3141.0
		float shortPi = (int)(pi*1000)/1000f;
		System.out.println("shortPi="+shortPi);

		//원하는 자릿수에서 반올림하고 나머지는 버림연산
		shortPi = Math.round(pi*1000);//3142.0
		shortPi = Math.round(pi*1000)/1000f;//
		System.out.println("shortPi="+shortPi);

		//나머지 연산 (%)
		System.out.println("10%8" + 10%8); 
		System.out.println("-10%8" + -10%8);
		System.out.println("10%-8" + 10%-8);
		System.out.println("-10%-8" + -10%-8);
		//절대값으로 연산 후 좌측 피연산자의 부호를 따라감.


		//비교연산자
		//	 <	: 보다 작다		-> if(a<10)
		//	 > 	: 보다 크다		-> boolean flag = a<10;
		//	 <= 	: 보다 작거나 같다
		//	 >=	: 보다 크거나 같다
		//	 == 	: 같다		
		//	 !=	: 같지 않다	

		//< , > , <= , >=	
		//	기본형 중에서 boolean형을 제외한 나머지 자료형에 사용할 수 있다.
		//	boolean flag = false;
		//	if(false > a) X
		//	참조형에 사용할 수 없다.

		// == , !=
		//	모든 자료형에 사용 할 수 있다.
		//	참조형 : 두 변수가 동일한 객체를 가르키고 있다는 의미
		//	기본형과 참조형 간에는 형 변환을 허용하지 않는다.
		//	문자열 비교 == , equals()도 사용 할 수 있다.
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		System.out.println("10==10.0=" + (10==10.0)); //정수형과 실수형이므로 형크기가 큰 실수형 형태로 변환되어 비교
		System.out.println("'0'==0=" + ('0'==0)); //문자 0 의 ASCCI코드는  
		System.out.println("'A'==65 / " + ('A'==65));
		System.out.println("0.1f==0.1 / " + (0.1f==0.1)); //0.1d = double형으로 각각 0을 출력하면 뒤에나오는 자릿수가 서로 다름
		System.out.println("10.0f==10.0 / " + (10.0f==10.0));
		System.out.println("d==f / " + (d==f));
		System.out.println("d==d2 / " + (d==d2));
		System.out.println("d2==f / " + (d2==f)); //0.10000000000000001 -> 0.1000000 -> 0.1000000000000

		//equals() 메소드
		String str = "Hello World";
		String str2 = "Hello Java";

		System.out.println("str == str2 / " + (str == str2));
		System.out.println("str.equals(str2) / " + (str.equals("Hello World")));

		//대입 연산자 : 우측에 있는 값을 좌측의 지정된 변수에 대입
		//	 =

		//복합 연산자 : 대입 연산자를 다른 연산자와 결합하여 사용
		//	int a = 10, b = 20;
		//	a = a+b;
		//	a += b;

		//	+= : a = a+b;
		//	-= : a = a-b;
		//	*= : a = a*b;
		//	/= : a = a/b;
		//	%= : a = a%b;
		
		int ma = 10, mb = 20;
		System.out.println("ma += mb / " + (ma += mb));//ma = ma + mb
		System.out.println("ma %= 2 / " + (ma %= 2));//ma = ma % 2
		
		//논리 연산 : 참과 거짓을 판별하는 연산
		//boolean형의 값을 결과로 생산
		//논리 연산에 참여하는 모든 문, 식, 값은 boolean형 으로 변환 된다.
		// - || : 논리 합 (OR) -> 논리 데이터 합 연산
		// - && : 논리 곱 (AND) -> 논리 데이터 곱 연산
		// - ! : 부정 (NOT) -> 논리 데이터 상태변환 연산 
		// true || false = true  //1 + 0 = 1
		// true || true  = true  //1 + 1 = 2 = true
		// true && false = false //1 * 0 = 0
		// true && true  = true  //1 * 1 = 1 
		// !true = false
		
		char ch = 'a';
		System.out.println("'b' < ch / " + !('b'<ch)); //b = 98 , ch = a = 97
		System.out.println(" 7 < 'b' / " + !((3+4)<(ch+1)));
		System.out.println("!false / " + (!false));
		
		//증감 연산자 : 피 연산자를 1씩 증가 혹은 감소하는 연산자
		// ++ :
		// -- :
		// ++a -> 11 / a++;
		// --a -> 9  / a--;
		
		// int a = 10, b = 20, c;
		//c = a++ + b;
		//c = ++a + b;
		
		int inca = 10, incb = 20, incc;
		incc = ++inca + incb;
		System.out.print("incc = ++inca + incb / " + incc);
		System.out.println(" " + inca + " "  + incb);
		
		inca = 10; incb = 20; incc = 0;
		incc = inca++ + incb; //inca + incb 연산 후 inca의 ++증가 (후위연산)
		System.out.print("incc = inca++ + incb / " + incc); //incc일때 inca는 출력전이므로(inca에 대한 출력문이 아님)
		System.out.println(" " + inca + " "  + incb);
		
		inca = 5;
		++inca;
		System.out.println("inca=" + inca); // 6
		
		inca = 5;
		inca++;
		System.out.println("inca="+ inca); // 6
		
		float incf = 12.3f;
		System.out.println("incf=" + ++incf); //13.3
		
		incf = 12.3f;
		System.out.println("incf=" + incf++); //12.3
		System.out.println("incf=" + incf);
		
		//조건 연산자 (*3항연산자*) : 조건식에 따라 참인 경우 앞식, 거짓인경우 뒷식 수행
		//(조건식) ? (참)앞식 : (거짓)뒷식;
		int con_a = 10;
		int con_b = -10;
		
		int absA = (con_a >= 0) ? con_a : -con_a;
		int absB = (con_b >= 0) ? con_b : -con_b;
		
		System.out.println("absA / " + absA);
		System.out.println("absB / " + absB);
		
		//비트 연산자 : 10진수를 2진수로 변환하여 각 비트별로 논리/이동 연산을 수행한다.
		//실수형을 제외한 모든 기본형에 사용 가능 하다
		// | : 논리 합(OR) 1|0 = 1
		// & : 논리 곱(AND) 1&0 = 0
		// ~ : 부정(NOT)	~1 = 0, ~0 = 1
		// ^ : 베타적 논리 합(XOR) : 두 비트가 동일하면 0 다르면 1
		// 		- 1100
		//		^ 0101
		//		  1001
		// <<, >> : shift (좌로이동 우로이동)
		// byte a = 2;
		// a << 1 = 4; (2씩 증감)
		
		int b_x = 3;
		int b_y = 5;
		System.out.println(b_x | b_y);
		System.out.println(true | false);
		
		//제어문의 종류
		//조건문:
		//반복문:
		//분기문:
		
		
	}

}

























