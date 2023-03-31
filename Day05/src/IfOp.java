import java.util.Scanner;

public class IfOp {

	public static void main(String[] args) {

		/*
		제어문 종류
		조건문 : if, if~else, if~elseif~else, switch~case
		반복문 : for, while, do~while
		분기문 : break, continue, goto

		단순 if문
		조건식을 판별하여 조건이 참이면 {}안의 명령문들을 수행
		거짓이면 {}명령문을 수행하지 않고 다음 명령을 수행한다.
		수행해야할 명령어가 한 개일 경우는 {} 생략 가능

		기본형식
		if(조건식) {
		 명령1;
		 명령2;
		}
		다음명령
		*/
		//=====================================================================================================
		/*
		int visitCount = 0;

		System.out.println("조건 : " + (visitCount == 0));
		if(visitCount == 0) {
			System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");
		}
		else {
			System.out.println("다시 방문해 주셔서 감사합니다.");
		}
		System.out.println("방문 횟수 : " + ++visitCount);
		Scanner select = new Scanner(System.in);
		
		System.out.print("과목선택 (자바[1]/C언어[2]) : ");
		int number = select.nextInt();
		
		if(number == 1) {
			System.out.println("Java Class");
		}
		
		if(number == 2) {
			System.out.println("C Class");
		}
		select.nextLine();
		System.out.println("성별[남자/여자] : " );
		String gender = select.next();//white Space (space , enter , tab) 공백문자열을 데이터로 받지 않음!
		//예) enter or space 남자 space 여자 => 남자로 인식
		
		if(gender.equals("남자")) {
			System.out.println("남성복 코너는 12층 입니다.");
		}
		else {
			System.out.println("여성복 코너는 2층입니다.");
		}
		System.out.println("방문해주셔서 감사합니다.");
		*/
		/*
		if~else문으로 구현
		둘 중 한개를 선택하는 조건문
		if문의 조건을 만족하지 못하면 else문 수행
		else다음에는 조건식을 사용할 수 없다
		
		if(조건) {
			명령1;
			명령2;
		}
		*/
		//=====================================================================================================
		/*	*************** 예제 ***************
		
		System.currentTimeMillis();
		1970년 1월 1일 0시 0분 0초부터 현재까지의 시간을 1000ms 단위로 반환
		
		long t = System.currentTimeMillis();
		t = t/1000/60/60/24/365;
	
		성인/미성인 구분
		사용자에게 출생년도 4자리를 입력 받아 나이를 계산해서 화면에 출력
		2001년생 -> 19살
		1999년생 -> 21살
		n   년생 -> ?살
		나이가 20살 이상이면 성인입니다! 출력
		나이가 20살 미만이면 미성년자입니다! 출력
		*/
		//=====================================================================================================
		/*내 코딩
		
		Scanner birthY = new Scanner(System.in);
		System.out.print("출생년도 4자리를 입력하세요 : ");
		int birthNum = birthY.nextInt();
		System.out.println("============================");
		int age = 0;
		age = (2019 - birthNum) + 1;
		System.out.printf("%d살\n", age);
		
		
		if (birthNum >= 2000) {
			System.out.println("성인 입니다!");
		}
		else {
			System.out.println("미성년자 입니다!");
		}
		*/
		//=====================================================================================================

		/* ***** 강사님 코딩 *****
		
		long b_year, age, p_year; //롱으로 하는 이유 : 
		Scanner year = new Scanner(System.in);
		System.out.print("생년을 입력해주세요 (4자리) : ");
		b_year = year.nextLong();
		p_year = (System.currentTimeMillis()/1000/60/60/24/365) + 1970; 
		//49년 을 1000ms단위로 변환되어있는 메서드 이므로 초/분/시간/분/일/년도
		// p_year은 현재 년도를 의미.
		age = p_year - b_year + 1;
		
		if (age < 20) {
			System.out.println("당신의 나이는" + age + "살로 미성년자 입니다!");
		}
		else{
			System.out.println("당신의 나이는" + age + "살로 성년 입니다.");
			
		}
		*/
		//=====================================================================================================
		/*
		중첩 if문
		if(조건){
			 if(조건){
				명령1;
		}
		else{
		}
		}
		else{
		명령1;
		}
		*/
		//=====================================================================================================
		/*
		Math.random(); => 0.0000 ~ 0.9999
		Math.random()*10; => 0.0000 ~ 9.9999
		(int)(Math.random() * 10) + 1 => 1~ 10
		
		
		double r_num = Math.random();
		double r_num1 = r_num * 5; //0~4까지
		int num = (int)r_num1; //r_num1은 8byte이므로 4byte인 int형에 넣기위해서는 자료형변환이 필요함
		int num1 = num + 42;
		
		System.out.println("num1=" + num1);
		*/
		//=====================================================================================================
		/*
		************ 주사위 던지기 *************
		주사위를 2개 던지는 코드를 구현하시고
		두개의 주사위 합계에 따라 아래와 같이 코드를 구현
		
		(1)합계가 짝수일 경우	짝! 출력
		(2)합계가 홀수일 경우	홀! 출력
		(3)두 주사위가 같은 값일 경우	더블!출력
		*/
		//=====================================================================================================
		/*
		***************** 내 코딩 ******************
		int square1 = (int)(Math.random()*6+1);
		int square2 = (int)(Math.random()*6+1);
		int sum;
		sum = square1 + square2 ;
		
		
		if(sum % 2 == 0) {
			System.out.printf("주사위 1의 값 : %d \n주사위 2의 값 : %d\n", square1, square2);
			System.out.println("짝!");
			if(square1 == square2) {
				System.out.println("더블!");
			}
			
		}
		else {
			System.out.printf("주사위 1의 값 : %d \n주사위 2의 값 : %d\n", square1, square2);
			System.out.println("홀!");
			
		}
		*/
		//=====================================================================================================

		int f_spot = (int)(Math.random()*6)+1;
		int s_spot = (int)(Math.random()*6)+1;
		int r_spot = f_spot + s_spot;
		System.out.println("첫번째 주사위 : "+f_spot);
		System.out.println("두번째 주사위 : "+s_spot);
		
		if(r_spot%2 == 0) {
			if(f_spot == s_spot) {
				System.out.println("결과 : 더블!");
			}
			else {
				System.out.println("결과 : 짝!");
			}
		}
		else {
			System.out.println("결과 : 홀!");
		}
		
		
	}
	
	

}



























