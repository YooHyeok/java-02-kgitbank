import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		/*
		반복문 : for, while, do~while
		특정 구간의 명령어들을 반복적으로 실행해 주는 제어문
		
		for문
		조건이 참인 경우 {} 안의 명령문들을 반복적으로 수행하는 명령문
		for문의 ()안에는 3개의 명령문을 쓸 수 있는데 이 명령은 ;으로 구분
		- 3개의 명령중 필요 없는 명령은 생략 가능
		for문 내에서 초기값과 증/감 값이 여러개인 경우 ','로 나열
		조건이 여러 개인 경우 &&, ||연산자로 조건을 연결한다.
		- ','로 연결시 가장 우측에 있는 조건만 수행
		조건이 참인 경우 명령문을 반복 수행한다
		- 초기값은 반복 수행되지 않는다.
		
		형식
		for(초기연산;조건;증/감 연산) {
			명령문1;
			명령문2;
		}
		*/
		/*	
		int i, sum=0;
		for(i=1; i<=10 ;i++) {
			sum = sum + i; //sum에 i값을 1씩 증가시켜 10까지 반복해서 더한후 저장.1~10까지 합
		}
		System.out.println("sum="+sum);
		
		sum=0;
		for(i=0;i<=100;i++) { //i가 1~100까지 돌리는 조건식
			if(i%3 == 0) { //3의배수
				System.out.print("i="+i+" ");
				sum += i; //sum에 i값을 더한 후 다시 sum에 대입
			}
		}
		System.out.println("1~100사이의 3의 배수의 합: "+ sum);
		*/
		
		/*
		int i, sum=0;
		for(i=3; i<=100 ;i+=3) {
			System.out.print("i="+i+" ");
			sum+=i;
		}
		System.out.println("\n1~100사이의 3의배수의 합: "+ sum);
		*/
		
		/*
		프로그램
		1. 1부터 100까지의 정수 출력
		2. 53부터 25까지의 정수 출력
		3. 30부터 60까지의 홀수 출력
		4. 100부터 0까지의 5의배수 출력
		5. A부터 Z까지의 알파벳 출력
		6. 1.0부터 3.0까지 0.5씩 출력
		7. 숫자 1개를 입력 받아 1부터 해당 수까지 출력
		8. 숫자 1개를 입력받아 1부터 해당 수까지 홀수 출력
		*/
		
		//1. 1부터 100까지의 정수 출력
		/*
		int i, cnt;
		for(i=1;i<=100;i++) {
			System.out.print("i="+i+" ");
			//System.out.print(i+" ");
			//if(cnt%10 == 0){ //열개씩 짜르는식
			// 	System.out.println();
			}
		
		}
		//cnt++;
		*/
		
		//2. 53부터 25까지의 정수 출력
		/*
		int i;
		System.out.println("\n3.53부터 23까지의 정수");
		for(i=53; i>=25; i--) {
			System.out.print("i= "+i+" ");
		}
		*/
		//3. 30부터 60까지의 홀수 출력
		/*
		int i=0;
		System.out.println("\n3.30부터 60까지의 홀수");
		for (i=30;i<=60;i++) {
			if(i%2!=0) {
				System.out.print("i= "+i+" ");
			}
		}
		*/
		//4. 100부터 0까지의 5의배수 출력
		/*
		int i;
		for(i=100; i>=0; i--) {
			if(i%5==0) {
				System.out.print("i="+i+",");

			}
		}
		*/
		
		//5. A부터 Z까지의 알파벳 출력
		/*
		int i;
		for(i='A'; i<='Z'; i++) {
			System.out.print("i="+(char)(i)+", ");

		}
		*/
		//6. 1.0부터 3.0까지 0.5씩 출력
		/*
		float i;
		
		for(i=1; i<=3; i+=0.5) {
			System.out.print("i= "+i+" ");

		}
		*/
		
		//7. 숫자 1개를 입력 받아 1부터 해당 수까지 출력
		/*
		int i,j;
		Scanner num = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		j = num.nextInt();
		for (i=1;i <= j;i++) {
			System.out.print(i + " ");
		}
		*/
		
		//8. 숫자 1개를 입력받아 1부터 해당 수까지 홀수 출력
		int i,j;
		Scanner num = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		j = num.nextInt();
		for (i=1;i <= j;i++) {
			
			if(i%2 != 0) {
				System.out.print(i + " ");
			}
			
		}
	}

}





















