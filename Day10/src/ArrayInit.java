import java.util.Arrays;
import java.util.Scanner;

public class ArrayInit {

	public static void main(String[] args) {
		/*
		배열은 선언하면서 초기값을 지정 할 수 있다
		배열의 초기 값은 여러 개 존재하기 때문에 {}안에 차례대로 쓴다
		초기값과 배열의 크기(요소개수)가 일치하면 배열의 크기 정보를 생략할 수 있다
		 - int [] = new int [5]; 
		 {1,2,3,4,5} 를 작성시에는 new int []
		배열의 크기보다 적은 개수의 초기값을 할당하게 되면,
		나머지 배열의 값은 기본값으로 초기화 된다.
		 - int [] num = new int [5] {1,2,3, 0,0} (정수는 default값일떄 0)
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
		sc = null;
		int i = 0;
		System.out.println(sc + " " + i);
		*/
		/*
		//int []arr = {1,2,3,4,5}; //변수형 스택에 데이터 (메소드가 종료되면 사라지는 스택) => 지역변수 (local)
		//int []arr = new int[] {1,2,3,4,5}; //힙영역에 데이터 = 주소값의 데이터 불러오는 참조형
		int []arr = new int[5]; // 힙영역에 데이터 생성.(new라고 하는 연산자의 모든형태는 힙 메모리를 할당.)
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		System.out.println("arr.length =" + arr.length); //배열의길이
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" +i+ "]=" +arr[i]+ " ");
		}
		*/
		//		총점/평균 구하기
		// - 100 88 100 100 90 
		/*
		int [] point;
		point = new int [] {100, 88, 100, 100, 90};
		
		int sum=0;
		double avg=0;
		avg = sum/point.length;
		
		for(int i=0; i<point.length; i++) {
			sum += point[i];
		}
		avg = (double)sum/point.length;
		System.out.println("총점: "+sum);
		System.out.println("평균: "+avg);
		*/
		//		최대 / 최소 값 구하기
		// - 79 88 91 33 100 55 95
		/*
		int max = 0, min = 0;		
		int [] point;
		point = new int[] {79, 88, 91, 33, 100, 55, 95};
		min = point[0]; //0번인덱스 = 79
		for(int i = 0; i < point.length; i++) {
//			if(point[point.length-i-1]-point[point.length-i-2] >= 0) {
//				
//			}
//			else{
//				
//			}
			
			if(max < point[i]) {
				max = point[i];//max의 초기값 0과 0번인덱스의 크기를 비교후 넣은후 인덱스별로 계속 크기비교하면서 넣는다
			}
			if( min > point[i]){
				min = point[i];//min의 초기값인 79와 i(0~6)번인덱스의 크기를 비교후 더 작으면 그때마다 대입하기
							
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		*/
		/*
		int [] score = {79, 88, 91, 33, 100, 55, 95};
		int [] b_score = new int[score.length];
		
		//배열대 배열간의 요소들을 복사
		
//		for(int i=0; i<score.length; i++) {
//			b_score[i] = score[i]; //배열대 배열간의 요소들을 복사
//		}
		
		//함수 사용하여 복사
		System.arraycopy(score, 0, b_score, 0, score.length); 
		//score의 길이까지 score0을 b_score0에 복사
		//score[0], b_score[0], 7
		
		System.out.println("score="+Arrays.toString(score)); //Arrays.tostring(배열명) = 배열명에 대한  요소값
		System.out.println("b_score="+Arrays.toString(b_score));
		*/
		
		/*
		 2차원 배열 : 행과 열로 구성된 형태로,
		 첫 번쨰 크기는 행, 두번째 크기는 열을 의미한다.
		 
		 실제 물리적 저장 위치는	1차원 배열과 동일하다
		 
		 2차원 배열 선언
		 타입[][] 변수 이름;
		 타입 변수 이름 [][];
		 
		 2차원 배열 생성
		 - int [][] array = new int[3][5]; //5개짜리가 3댕어리
		 */
		/*
		int[][]arr = new int[3][5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= (i*5)+j;
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= (i*5)+j;
				System.out.println("arr["+i+"]"+"["+j+"]"+arr[i][j]);
			}
		}
		*/
		
		//2차원 배열 연습문제
		/*
		배열의 크기를 입력받아 2차원 배열 구성
		1차 배열의 크기 입력:5
		2차 배열의 크기 입력:5
		
		배열[5][5]의 값
		1  2  3  4  5
		6  7  8  9  10
		11 12 13 14 15
		16 17 18 19 20
		21 22 23 24 25
		*/
		/*
		Scanner size = new Scanner(System.in);
		System.out.print("1차 배열의 크기 입력: ");
		int i = size.nextInt();
		System.out.print("2차 배열의 크기 입력: ");
		int j = size.nextInt();
		
		
		
		System.out.println("배열["+i+"]["+j+"]의 값");
		int [][]arr = new int[i][j];
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				arr[i][j] = (i*5+1)+j;
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
		}
		*/
		
		//다차원 배열
		/*
		빙고판 만들기 
		가로, 세로 크기를 입력받아 빙고판을 만들고, 모든 자리에 숫자가 랜덤으로 배치될 수 있다록 코드 구현
		가로열 갯수:5
		세로열 갯수:5
		16  18  10  22  15
		1   8   19  11  12
		7   23  3   5   2
		20  13  25  24  21
		9   6	17  4	14
		*/
		/*
		Scanner size = new Scanner(System.in);
		System.out.print("가로열 갯수: ");
		int i = size.nextInt();
		System.out.print("세로열 갯수: ");
		int j = size.nextInt();
		
		int arr[][] = new int [i][j];
		*/
		/*
		Scanner board = new Scanner(System.in);
		int bgNum, i, j;
		boolean flag = true;
				
		System.out.print("가로열 갯수: ");
		int row = board.nextInt();
		System.out.print("세로열 갯수: ");
		int col = board.nextInt();
		
		int bgBoard = row*col;//(행*열)전체 빙고판에 들어갈 수의 갯수
		
		int [][] aBingo = new int [row][col];
		int [] aBgNum = new int [bgBoard];
		for (i=0; i<aBgNum.length; i++) {
			bgNum = (int)(Math.random()*bgBoard)+1;
			flag = true;
			while(flag) {
				for(j=0; j<i; j++) {
					if(aBgNum[j] == bgNum) {//중복된게 있다
						bgNum = (int)(Math.random()*bgBoard)+1;
						break;
					}
				}
				if(i==j) {
					flag=false;
				}
			}
			aBgNum[i] = bgNum;
		}
		int k = 0;
		for(i = 0; i<aBingo.length; i++) {
			for(j = 0; j<aBingo[i].length; j++) {
				aBingo[i][j] = aBgNum[k];
				k++;
				System.out.print(aBingo[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		/*
		2차원 배열 성적 관리
		번호	 국어	 영어	 수학	 총점	 평균
		=========================
		1	100	100	100	300	100
		2	20	20	20	60	20.0
		3	30	30	30	90	30.0
		4	40	40	40	120	40.0
		5	50	50	50	150	50.0
		=========================
		*/
		int [][] score = 
			{{100,100,100},{20,20,20},{30,30,30},{40,40,40},{50,50,50}};
		int kor = 0, eng = 0, math = 0;
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("=============================================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			kor += score[i][0];
			eng += score [i][1];
			math += score [i][2];
			
			System.out.print((i+1)+"  ");
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%4d",score[i][j]);
			}
			System.out.printf("%4d %4.2f\n",sum,sum/(float)score[i].length);
		}
		System.out.println("=============================================");
		System.out.printf("총점 : %4d %4d %4d",kor,eng,math);
		
		
		
		
		
		
	}
}
