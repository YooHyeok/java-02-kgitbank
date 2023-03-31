import java.util.Scanner;

public class ConOp {

	public static void main(String[] args) {
		/*
		 구구단 맞추기
		 
		 화면에 무작위로 구구단 1문제를 출제(2단~15단)
		 2x1 = 부터  15x9 까지
		 사용자가 정답을 입력할 수 있도록 프로그래밍 코드를 구현(Scanner)
		 정답일 경우 아래와 같이 처리
		 
		 [1] 맞춘 경우 정답! 10점 획득!
		 [2] 틀린 경우 오답! 5점 감점!
		 
		 추가적으로, 어려운문제(11단 이상일 경우) 를 맞추면 10점을 추가로 획득하도록 구현
		 */
		//=====================================================================================================
		/*
		int r_score, w_score, t_score =100; //증가시킬 점수, 감소시킬 점수, 총 점수
		int fst_num, snd_num, res_num, ans_num;// 첫번째숫자, 두번째숫자, 곱한값, 입력한값
		Scanner answer = new Scanner(System.in);
		r_score = 10;
		w_score = 5;
		
		fst_num = (int)(Math.random()*14)+2; //2단부터 이기 때문에 2부터 시작 (+2)
		snd_num = (int)(Math.random()*9)+1; 
		res_num = fst_num * snd_num;
		System.out.print(fst_num + "*" + snd_num + "=");
		ans_num = answer.nextInt();
		
		if(ans_num != res_num) {
			System.out.println("틀렸습니다." + w_score + "점 감점입니다.");
			t_score -= w_score; //토탈스코어에서 5점감점.
		}
		else{
			if(fst_num >= 11) {
				System.out.println("정답입니다!!" + r_score + "점 획득 했습니다.");
				System.out.println("보너스" + 10 + "점 추가 획득했습니다.");
				t_score += r_score + 10;
			}
			else {
				System.out.println("정답입니다!!" + r_score + "점 획득 했습니다.");
				t_score += r_score;
			}
			System.out.println("현재점수: " + t_score);
		}
		*/
		//=====================================================================================================
		/*
		<다중 if문>
		
		여러개 중 한 개를 선택하는 경우에 사용하는 조건문
		- 조건에 따라 수행되는 명령문이 다르다
		조건이 참이 되어 명령을 수행하면 아래 있는 나머지의 조건은 비교하지 않고
		다중 if문을 빠져나온다.
		*/
		
		/*
		<형식>
		
		if(조건1) {
			명령문1;
			명령문2;
		}
		else if(조건2) {
			명령문1;
			명령문2;
		}
		else if(조건3) {
			명령문1;
			명령문2;
		}
		else {
			
		}
		(다음명령)
		 :참을 만족하는 조건식의 명령문을 실행 후 
		빠져나와 다음 명령 실행
		*/
		//=====================================================================================================
		/*
		int score = 92;
		
		String grade = " ";
		
		if(score >= 90) {
			grade = "A";
			if(score>=98) {
				grade += "+";
			}
			else if(score <= 92) {
				grade += "-";
			}
		}
		else if(score >= 80) {
			grade = "B";
			if(score>=88) {
				grade += "+";
			}
			else if(score <= 82) {
				grade += "-";
			}
		}
		else if(score >= 70) {
			grade = "C";
			if(score>=78) {
				grade += "+";
			}
			else if(score <= 72) {
				grade += "-";
			}
		}
		else {
			grade = "F";
		}
		System.out.println("당신의 학점은" + grade + "입니다.");
		*/
		//=====================================================================================================
		/*
		 중국집 주문 프로그램
		 사용자에게 자장면, 짬봉 주문 수량을 입력 받아 결재 금액을 계산하여 출력
		 
		 자장면 - 5000원
		 짬 뽕 - 6000원
		 
		 5그릇 이상 주문하면 3천원 할인
		 10그릇 이상 주문하면 10% 할인
		 ==================================================
		 
		 자장면 주문:5
		 짬뽕 주문:5
		 
		 [주문내용]
		 자장면
		 가격: 5000원/ 주문수량:5그릇
		 짬뽕
		 가격: 6000원/ 주문수량:5그릇
		 지불금액 : 49500원
		 */
		//=====================================================================================================
		/*
		int Zza , Zzam , total_p;
		int Zza_p = 5000;
		int Zzam_p = 6000;
					
		Scanner nuddle = new Scanner(System.in);
		System.out.println("짜장면 주문: ");
		Zza = nuddle.nextInt();
		System.out.println("짬뽕 주문: ");	
		Zzam = nuddle.nextInt();
	
		
		
		total_p = (Zza * Zza_p) + (Zzam * Zzam_p);
		
		if ((Zza + Zzam >= 5) && (Zza + Zzam < 10)) {
			total_p -= 3000;
		}
		else if (Zza + Zzam >= 10) {
			total_p *= 0.9;
		}
		else {
			total_p = total_p;
		}
		System.out.println("[주문내용]");
		System.out.println("자장면\n"+"가격:"+Zza_p+"원"+"주문수량:"+Zza+"그릇");
		System.out.println("짬뽕\n"+"가격:"+Zzam_p+"원"+"주문수량:"+Zzam+"그릇");
		System.out.println("지불가격 : " + total_p + "원");
		*/
		//=====================================================================================================
		/*
		int jj_price = 5000, jj_cnt, jj_total_cst=0;
		int jb_price = 6000, jb_cnt, jb_total_cst=0;
		
		int total_price, total_cnt = 0;
		Scanner order = new Scanner(System.in);
		
		System.out.println("자장면 주문: ");
		jj_cnt = order.nextInt();
		
		System.out.println("짬뽕 주문:");
		jb_cnt = order.nextInt();
		
		total_cnt = jj_cnt + jb_cnt;
		jj_total_cst = jj_cnt * jj_price;
		jb_total_cst = jb_cnt * jb_price;
		
		if((total_cnt >=5 ) && (total_cnt < 10)) {
			total_price = (jj_total_cst + jb_total_cst) - 3000;
		}
		else if (total_cnt >= 10) {
			total_price = (int)((jj_total_cst + jb_total_cst)*0.9);
		}
		else {
			total_price = jj_total_cst + jb_total_cst;
		}
		
		System.out.println("[주문내용]");
		System.out.println("자장면 가격 : "+ jj_price + " / 주문 수량: " + jj_cnt + "그릇");
		System.out.println("짬뽕 가격 : "+ jb_price + " / 주문 수량: " + jb_cnt + "그릇");
		System.out.println("지불 금액 : "+ total_price + "원");
		*/
		//=====================================================================================================
		/*
		switch ~ case문 : 변수의 값을 case에서 찾아 명령문 수행하는 조건문
		- 값이 없을 경우에는 default의 명령문을 수행
		- case와 명령문 사이에  : 을 사용
		- case의 값은 byte, short, char, int, String 중의 하나의 상수만 사용
		- 문과 식이 올수 있지만 결과는 상수여야만 한다.
		
		기본형식
		int a = 10;
		switch(변수){
		case 상수:
			명령문1;
			break;
		case 상수:
			명령문2;
			break;
			...
		default:
		 	명령문
		}
		*/
		//=====================================================================================================
		/*
		int score = 0;
		 
		char grade = (char)(Math.random()*5 + 'A');
		//'A' = 65
		//0 = 65('A') 1 = 66('C') ... 3 = 68('D')
		System.out.println("선택된 문자: " + grade);
		switch(grade) {
		case 'A' : // case가 A일때 90점. random값은 0
			score = 90;
			break;
		case 'B' : // case가 B일때 80점. random값은 1
			score = 80;
			break;
		case 'C' :
			score = 70;
			break;
		case 'D' :
			score = 60;
			break; //여기까지만 실행해달라는 뜻. 빠져나옴
		default :
			score = 0;
		}
		System.out.println("당신의 점수는 "+score+"입니다.");
		*/
		//=====================================================================================================
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("키 입력[Q/W/E/R] : ");
		String key = sc.next();
		
		switch(key) {
		case "Q":
		case "q":
		case "ㅂ":
			System.out.println("Skill I");
			break;
		case "W":
		case "w":
		case "ㅈ":
			System.out.println("Skill II");
			break;
		case "E":
		case "e":
		case "ㄷ":
			System.out.println("Skill III");
			break;
		case "R":
		case "r":
		case "ㄱ":
			System.out.println("Skill IV");
			break;
		default:
			System.out.println("잘못된 입력");
		
		}
		*/
		//=====================================================================================================
		/*
		int score = (int)(Math.random()*10) + 1; 
		score *= 100;
		//랜덤으로 추출한 수(0~99) + 1 = 1~100점 까지.
		String msg = null;
		msg = "당신의 점수는 " + score + "점 입니다. 상품은";
		switch(score) {// 100점~1000점 까지
		case 800:
			//System.out.println("당신의 점수는 100점 입니다. 상품은 자전거 입니다.");
			msg += "자전거";
			break;
		case 900:
			//System.out.println("당신의 점수는 200점 입니다. 상품은 TV 입니다.");
			msg += "TV";
			break;
		case 1000:
			//System.out.println("당신의 점수는 300점 입니다. 상품은 노트북 입니다.");
			msg += "노트북";
			break;
		default:
			msg += "볼펜";
			
		}
		System.out.println(msg+"입니다.");
		*/
		//=====================================================================================================
		/*
		여행사 경품 추첨
		사용자에게 여행가고 싶은 달을 숫자로 입력받아(1~12)
		해당하는 계절에 맞는 사은품 증정 메세지를 출력
		
		여행가고 싶은 달 입력:5
		봄에 여행가시면 황사마스크를 사은품으로 증정합니다!
		
		겨울 12,1,2  봄3,4,5  여름6,7,8 가을 9,10,11
		
		[계절별 사은품]
		봄-황사마스크
		여름-모기퇴치약
		가을-선글라스
		겨울-머플러
		*/ 
		//=====================================================================================================
		int Hope_travel_month;
		Scanner travel = new Scanner(System.in);
		System.out.print("1월~12월 중 여행가고 싶은 달을 입력하세요: ");
		Hope_travel_month = travel.nextInt();
		
		/*
		스트링 변수에 널 값을 지정했더라도 널포인트가 문자열과 결합하게된다면 문자열로 변환된다 (null~~)
		String msg = null;
		System.out.println("고객님의 사은품은");
		case 5: msg += "계절상품"
		msg += "계절상품" -> 계절상품을 널값에 더해 msg에 대입하는 복합대입연산자 이므로
		문자열 + null = null을 주소값으로 불러오지 않고 문자열로 인식.
		*/
		
		String msg = null;  
		
		msg = "고객님의 사은품은 ";
		
		switch(Hope_travel_month) {
		case 3:
		case 4:
		case 5:
			msg += "황사마스크(봄)";
			break;
		case 6:
		case 7:
		case 8:
			msg += "모기퇴치약(여름)";
			break;
		case 9:
		case 10:
		case 11:
			msg += "선글라스(가을)";
			break;
		case 12:
		case 1:
		case 2:
			msg += "머플러(겨울)";
			break;

		}
		System.out.println(msg + "입니다");
		
	}
		
}


























