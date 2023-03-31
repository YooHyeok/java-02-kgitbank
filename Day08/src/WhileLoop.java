import java.io.IOException;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) throws IOException {
		//조건이 참인 경우 {}안의 명령문을 반복적으로 수행하는 제어문
		//수행 해야 할 명령문이 한 개일 때, {}생략 가능
		//조건이 참인 경우 명령문을 반복 수행
		
		//기본 형식
		//while(조건){
		//	명령1;
		//	명령2;
		//}
		
		/*
		int count = 10;
		while(count >= 0) {
			System.out.println("count=" + count--);
		}
		System.out.println("프로그램 종료");
		*/
		//1에서 10까지 출력
		/*
		count = 1;
		while(count <= 100) {
			System.out.println("count="+count);
			count++;
		}
		System.out.println("프로그램 종료");
		*/
		//1에서 10까지 합
		/*
		int sum = 0;

		count = 1;
		while(count <= 10) {
			sum += count;
			count++;
		}
		System.out.println("총 합:"+sum);
		*/
		//구구단 출력(2단~9단)
		
		/*
		int left,right,res;
		left=2;
		while(left <= 9) {
			right=1;//right를 이곳에 초기화해줘야함.
			while(right <=9) {
				res = left * right;
				System.out.println(left+"*"+right+"="+res);
				right++;
			}
			left++;
			System.out.println("구구단"+left+"단");
		}
		*/
		/*
		//1에서 부터 누적 합계가 100보다 작을 때 까지 출력
		int i, sum = 0;
		i=0;
		while(sum+i<100) {
			sum += i;
			i++;
			
		}
		System.out.println(sum);
		*/
		//while문 예제
		/*
		업다운 게임
		컴퓨터에게 1부터 100사이의 정답을 생성하도록 코드를 구현한 뒤
		사용자가 숫자를 입력하여 정답을 맞추도록 프로그래밍 하세요
		<게임의 상태>
		[업] 사용자가 정답보다 낮은 값을 입력한 경우
		[다운] 사용자가 정답보다 높은 값을 입력한 경우
		[정답] 사용자가 정답과 같은 값을 입력한 경우, 게임종료
		
		게임종료시 총 입력한 횟수를 화면에 출력
		*/
		
		/*
		int Num = 1;
		int randNum = (int)(Math.random()*100)+1;
		Scanner i = new Scanner(System.in);
			while(Num<=100) {
			System.out.print("정답을 입력하세요: ");
			Num = i.nextInt();
			if (Num == randNum) {
				System.out.println("정답입니다");
				
			}
			else if (Num < randNum) {
				System.out.println("업!");
			}
			else if(Num > randNum) {
				System.out.println("다운!");
			}
		}		
		*/
		
		//^모범답안^
		/*
		int up_cnt=0, down_cnt=0, t_cnt=0;
		q_disit = 50;
		boolean flag = true; //boolean형 질문하기
		
		Scanner an_disit = new Scanner(System.in);
		int q_disit = (int)(Math.random()*100)+1;
		while(flag) {
			System.out.println("정답을 입력하세요: ");
			int answer = an_disit.nextInt();
			
			if(answer < q_disit) {
				up_cnt++;
				System.out.println("[ 업"+up_cnt+" ]");
			}
			else if(answer > q_disit) {
				down_cnt++;
				System.out.println("[ 다운"+down_cnt+" ]");
				
			}
			else {
				System.out.println("정답 입니다!");
				flag = false;
				//boolean형 질문하기 = break를 걸고 바깥으로 돌아와 와일문 실행후 거짓이므로 바깥 (129~132)명령
			}
		}
		t_cnt = up_cnt + down_cnt;
		System.out.println("[ 업"+up_cnt+" ]");
		System.out.println("[ 다운"+down_cnt+" ]");
		System.out.println("[ 총"+t_cnt+" ]");
		 
		//while문 예제
		/*
		사용자가 틀릴 때까지 구구단 문제를 출제
		2X1 부터 19X9까지 구현
		사용자가 3문제를 틀리면 게임오버! 라는 메세지를 출력한 뒤 종료
		종료전에 정답개수와 점수를 출력
		[1]일반정답+10점
		[2]11단부터 정답은 5점 추가(총15점)
		 */
		/*
		int q, ans, wrong_cnt , right_answer;
		int res;
		
		while(q != ans) { //q = 문제, ans = 정답 /(정답을 맞출때까지 문제를낸다.)
		int rand_left = (int)(Math.random()*8)+2; //2단부터
		int rand_right = (int)(Math.random()*9)+1; 
		
		while(rand_left <= 19) {
			while(rand_right <= 9) {
				res = rand_left * rand_right;
				System.out.println(rand_left+"*"+rand_right+"="+res);
			}
		}
		
			while(wrong_cnt <= 3) { //3번 틀렸을때까지 실행
				Scanner googoodan_answer = new Scanner(System.in);
				System.out.println("정답을 입력하세요:");
				int googoo = googoodan_answer.nextInt();
				if(googoo == res) {
					if(rand_left >= 11) {
						System.out.println("정답입니다! 5점 추가");
					}
					else {
						System.out.println("틀렸습니다!");
						wrong_cnt++;
					}
				}
				
			
			}
		
		}
		*/
		/*
		int r_point = 10, b_point = 5, w_point = 5, t_point=0;
		int w_cnt=0 , r_cnt = 0;
		boolean flag = true;
		Scanner a_num = new Scanner(System.in);
		
		while(flag) {
			int f_num = (int)(Math.random()*18)+2;
			int by_num = (int)(Math.random()*9)+1;
			int r_num = f_num*by_num;
			
			System.out.println("정답 입력");
			System.out.println(f_num + "*" + by_num + "= ");
			int answer = a_num.nextInt();
			
			if(answer == r_num) {
				System.out.println("정답입니다." + r_point + "점 획득하셨습니다.");
				t_point += r_point;
				r_cnt++;
				if(f_num >= 11) {
					System.out.println("추가점수"+b_point + "점 획득하셨습니다.");
					t_point += b_point;
				}
			}
			else {
				System.out.println("틀렸습니다." + w_point + "점 감점하셨습니다.");
				t_point -= w_point;
				w_cnt++;
			}
			if(w_cnt >= 3) {
				System.out.println("총"+w_cnt+"번 틀려 게임을 종료합니다.");
				flag = false;
				
			}
		}
		System.out.println("정답 횟수는"+r_cnt+"번이고, ");
		System.out.println("현재 점수는"+t_point+"입니다.");
		*/
		
		/*
		do while문
		
		명령문을 먼저 실행하고 조건을 비교한다
		- 최소 한번은 반드시 수행한다
		- while문 뒤에 ;을 사용해야 한다
		
		기본형식
		do{
			명령1;
			명령2;
		} while(조건);
		*/
		
//		int input = 0;
//			System.out.println("입력을 마치려면 'x'를 눌러주세요");
//			System.out.println("문장을 입력 하세요");
//			
//			do {
//				input = System.in.read();
//				System.out.print((char)input);
//			}
//			while(input != -1 && input != 'x');
//			System.out.println("\n시스템 종료 합니다.");
		/*
		분기 명령어
		break
		- 반복 명령 실행 중 강제로 반복 문을 빠져 나올때 사용되는 명령어
		- 여러 개의 반복문이 중첩되어 있을 때는 해당 명령어가 포함 된 반복문만 빠져 나온다.
		continue
		- 반복문의 나머지 부분을 무시하고, 그 반복문의 처음으로 이동 할 때 사용
		- 여러 개의 반복문이 중첩되어 있을 때는 continue 명령어가 포함된 반복문의 처음으로 빠져 나온다.
		*/
		
//		int sum = 0;
//		int number = 0;
//		while(true) {
//			if((sum+number) > 100) {
//				System.out.println("break문을 만나 종료 합니다.");
//				break;
//			}
//			number++;
//			sum += number;
//		}
//		System.out.println("sum="+sum);
		
		for(int i = 0; i <= 10; i++) {
			if(i%3 ==0) {
				continue; //명렁어 포인트가 밑으로 가지 않고 위로 올라감.
				//System.out.println(i);
			}
			System.out.println(i);
		}
	}
}





















