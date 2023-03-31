
public class Clock {
	public static void main(String[] args) throws InterruptedException {
		/*
		이중 for 문 : for문 안에 for문이 들어간 형태로 
				    내부의 명령어를 외부의 횟수만큼 반복한다
		사용 예
		for(초기값; 조건; 증/감연산){
			for(초기값2; 조건2; 증/감연산){
				명령1;
				명령2;
			}
		}
		내부 명령은 외부의 반복 횟수만큼 반복 수행하게 된다
		*/
		/*
		int i, j;
		for(i=2; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
		*/
		
		for(int hour = 0; hour<24; hour++) {
			for(int minute=0; minute<60; minute++) {
				for(int second=0; second<60; second++) {
					System.out.println(hour+"시"+minute+"분"+second+"초");
					Thread.sleep(1000);
				}
			}
		}
	}
}
