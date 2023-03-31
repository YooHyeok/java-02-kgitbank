
public class ArrayEx {

	public static void main(String[] args) {
		//int[] arr = new int[4]; //배열형태의 메모리형태에 접근하기위해 arr이라는 이름을 사용하세요

		/*
		 배열
		배열은 같은 타입의 변수가  여러 개 필요한 경우 이용한다.
		 - 같은 타입의 변수가 하나의 배열이름으로 연속적인 메모리에 할당 된다.

		배열의 선언 : 생성된 배열을 다루기 위한 데이터를 저장하기 위한 메모리 공간 확보.
		 - 타입[] 변수 이름;
		 - 타입 변수이름 [];
		 int [] arr == int arr[];

		배열 생성
		 int [] arr;
		 arr = new int[4] => 정수형(int) 4개[4]를  저장할수있는 메모리공간을 확보(new) 해서 변수(arr)에 넘겨주겠다.

		배열의 접근
		 - 인덱스를 사용하여 각 요소에 접근할 수 있다.
		 - 인덱스는 0번부터 시작.

		 배열 요소의 갯수 정보 : arr.length ==> 4를 리턴
		 */

		/*
		int [] arr; //int형 배열의 공간을 확보하면 주소값을 arr에 저장. (참조변수)
		arr = new int[5]; //정수에 5개를 저장할수있는 물리적인 공간을 확보 후 arr에게 위치정보 공유

		for(int i = 0; i<5; i++) { // i => index
			arr[i] = i+1; // 배열의 각 요소에 값을 넣어주기.
			System.out.println(arr[i]);
		}

		arr[0] += 10;
		arr[1] += 20;
		arr[2] += 30;
		for(int i = 0; i<5; i++) { // i => index
			System.out.println(arr[i]);

		}
		 */


		//카드섞기 (배열 임의의 위치에 있는 값 100번 섞기)
		/*
		int [] card = new int[52]; //카드 52개의 메모리공간을 확보하고 시작주소를 card에 공유
		for(int i=0; i<card.length; i++) {
			card[i] = i+1; //인덱스 0~ 카드 배열의 길이만큼 1을누적하여 대입 (1부터 배열의길이+1)
		}

		int temp;
		int number;
		for(int i = 0; i<100; i++) {
			number = (int)(Math.random()*52); //0~51까지의 난수를 인덱스 요소로 사용

			//섞는것!!!
			//임의의 변수 temp를 사용하여 card[0]과 card[number]의 데이터를 스왑화는 공식
			temp = card[0];
			card[0] = card[number];
			card[number] = temp;



		}

		//카드 여섯장을 추출해내는 식
		for(int i = 0; i < 7; i++) {
			System.out.print(card[i] + " ");

		}
		 */

		/*
		주사위를 10번 던진 결과를 짝수, 홀수 구분하여 출력
		 짝수 주사위 : 
		 홀수 주사위 : 
		 */
		int [] square = new int[10];
		int number;
		//주사위에 1부터 6까지 대입하는 반복 명령문.
		for (int i = 0; i < square.length; i++) {
			square[i] = i+1; //주사위에 숫자를 1부터 누적합 대입.
		}
		//주사위에서 난수 10개 뽑기
		for (int i = 0; i < 10; i++) {
			number = (int)(Math.random()*6)+1; //1~6까지 총 6개의 인덱스를 난수로 추출.
			//뽑은 난수를 인덱스에 대입
			square[i] = number; //인덱스 : 0~9까지 10개 //number : 1~6까지 총 10번
		}
		//숫자 10개 추출하기
		for(int i = 0; i < 10; i++) {
			System.out.print(square[i]);
		}
		//추출한 10개의 수를 짝수 홀수로 나누기.
		System.out.print("\n짝수:");
		for (int i = 0; i<square.length; i++) {
			if(square[i] % 2 == 0) {
				System.out.print(square[i]);
			}
		}
		System.out.print("\n홀수:");
		for (int i = 0; i<square.length; i++) {
			if (square[i]%2 != 0) {
				System.out.print(square[i]);
			}
		}
		//답안
		int [] die;
		die = new int[10];
		for(int i = 0; i < die.length; i++) {
			die[i] = (int)(Math.random()*6)+1;
			
		}
		System.out.println("\n짝수:");
		for(int i = 0; i<die.length; i++) {
			if(die[i]%2 == 0) {
				System.out.print(die[i] + " ");
			}
		}
		System.out.println("\n홀수:");
		for(int i = 0; i<die.length; i++) {
			if(die[i]%2 != 0) {
				System.out.print(die[i] + " ");
			}
		}
		
	}
}
