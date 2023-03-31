
public class Main_method {

	public static void main(String[] args) throws InterruptedException {
		//시분초
		Time t = new Time();
		t.setSecond(10);
		t.setMinute(58);
		t.setHour(24);
		t.dispTime();
		
		System.out.println("현재 시간은"+t.getHour()+"시"+t.getMinute()+"분"+t.getSecond()+"초 입니다.");
		
		for(int i = 0; ; i++) {
			t.setSecond(12+i);
			Thread.sleep(1000);
			t.dispTime();
		}
	}

}
