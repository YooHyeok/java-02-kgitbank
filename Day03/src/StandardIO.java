import java.io.IOException;
import java.util.Scanner;

public class StandardIO {

	public static void main(String[] args) throws IOException {
//		int i = 10;
//		float f = 10.1f; //10.1 = double형태이므로 형변환
//		char c = 'A';
//		String str = "Hello World";
//		
//		
//		System.out.println(i);
//		System.out.println(f);
//		System.out.println(c);
//		System.out.println(str);
//		System.out.println("재미있는 자바");
		//문자열 직접 출력은" "안에 출력문 입력
		
		//Escape Sequence - 커서제어
		//키보드에 나타나지 않는 문자나 화면에 출력되지 않는 제어 문자들을 \를 사용
		//하여 표현
		// - \n : new line (줄바꿈)
		// - \r : carriage return (줄의 처음으로 커서 이동);
		// - \t : Tab (다음 탭 위치로 커서 이동);
//		System.out.println("Hello \n \t World!!! \r Program is my life!!!\n");
		
		//서식 제어 문자
		// -%d : 정수(int)
		// -%f : 실수(Float)
		// -%c : 문자(Charactor)
		// -%s : 문자열(String)
		
//		System.out.printf("정수 : %d\n", 10);
//		System.out.printf("실수 : %f\n", 3.14);
//		System.out.printf("문자 : %c\n", 'A');
//		System.out.printf("문자열 : %s\n", "Hello World");
//
//		int i = 10;
//		char ch;
//		
//		System.out.print("입력 : ");
//		i = System.in.read();
		//ch = (char)i;
//		System.out.print("출력 : ");
		//System.out.println((char)i);
//		System.out.printf("%c", i);
//		
		//Scanner : 다양한 타입의 입력 값들을 읽어 들이기 위한 표준 자바 라이브러리.
		//next() : whit space값들을 문자열 구분 기호로 사용.(스페이스나 엔터키,탭키를 데이터로 받지X)
		//nextLine() : 엔터값만 문자열 구분 기호로 사용한다.
		//nextByte() : 버퍼에 있는 값을 바이트 단위로 읽어온다.
		//nextInt() : 버퍼에 있는 데이터를 정수형으로 읽어온다.
		//nextFloat() : 버퍼에 있는 데이터를 실수형으로 읽어온다.
		//nextDouble(): 버퍼에 있는 데이터를 더블형으로 읽어온다.
		
		//사용법
		// - Scanner str = new Scanner();
		// 설명 = 
		// - str.next자료형();
		
//		Scanner str = new Scanner(System.in);
//		String message;
////		System.out.println("메세지를 입력하세요.");
////		message = str.nextLine();//nextLine = 엔터전까지 whitespace값을 가져옴.
////		message = str.next();//
////		System.out.println("입력된 메시지");
////		System.out.println(message);
//		System.out.print("나이 입력 : ");
//		int age = str.nextInt(); //str에 입력받은 값을 age에 저장.
//		str.nextLine();//빈엔터처리
//		System.out.print("이름 입력 : ");
//		String name = str.nextLine(); //엔터를 만날때까지 불러옴.
//		
//		System.out.println("이름:" + name);
//		System.out.println("나이:" + age);

//예제1)
		Scanner str = new Scanner(System.in); //표준입출력(System.in) 버퍼로부터 데이터를 스캔해서 가져옴
		
		
		
		System.out.println("자바점수 입력 : ");
		int java = str.nextInt();
		
		System.out.println("C언어 점수 입력 : ");
		int cLang = str.nextInt();
		//str.nextLine();//nextInt후 엔터가 남아있으므로 nextline으로 버퍼 비우기 (빈엔터처리)
		
		System.out.println("이름입력 : ");
		String name = str.nextLine(); //enter가 나올때 까지.

		int sum = java + cLang;
		float avg = sum/2.0f;
		
		System.out.printf("[%s 님의 성적]\n", name);
		System.out.printf("합계 = %d\n", sum);
//		System.out.println("합계=" + sum);
		System.out.printf("평균 = %.2f\n", avg);
//		System.out.println("평균=" + avg);
		
		
	}

}




















