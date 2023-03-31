
public class ArrayHomeWork {
	public static void main(String[] args) {
		
		/*
		주사위를 1000번 던져서 각각의 눈금이 나온 횟수를세어보기
		(예상결과)
		1 나온횟수 : 170번
		2 나온횟수 : 180번
		3 나온횟수 : 205번
			...
		6 나온횟수: 155번		
		*/
		/*
		int [] square = new int[1000];
		//주사위에 1부터 6까지 대입하기
		for (int i = 0; i<square.length; i++) {
			square[i] += 1;
		}
		//1~6까지의 난수를 총 1000번 추출하기
		int number;
		int cnt1, cnt2, cnt3, cnt4, cnt5, cnt6;
		for (int i = 0; i<1000; i++) {
			number = (int)(Math.random()*6)+1;
			//뽑은 난수를 인덱스에 대입!
			square[i] = number;
			cnt1++;
			cnt2++;
			cnt3++;
			cnt4++;
			cnt5++;
			cnt6++;
			
		}
		
		//추출한 난수  출력하기
		if (square[1]) {
			for (int i = 0; i<1000; i++) {
				System.out.println(cnt1);
			}
		}
		*/
		//
		int[]die = new int[6];
		
		for(int i=0; i<1000; i++) {
			int num = (int)(Math.random()*6);
			die[num]++; //0번인덱스 = 1, 1번인덱스 = 2, ... 5번인덱스 = 6
		}
		for(int i=0; i<die.length; i++) {
			System.out.println(i+1 + "나온횟수: " + die[i]);
		}
	
	}
}
