import java.util.Scanner;

public class ArrayHomeWork2 {
	public static void main(String[] args) throws InterruptedException {
		//1차원 배열 문
		/*
		사용자가 좋아하는 메뉴를 입력받아 추첨
		개수입력 : 5
		
		항목 : 김밥
		항목 : 라면
		항목 : 떡볶이
		항목: 자장면
		항목: 순대국
		
		추첨중입니다...
		추첨된 항목은 떡볶이 입니다
		*/
		int menu_sel,menu_cnt;
		Scanner str = new Scanner(System.in);
		
		System.out.print("항목  수 입력: ");
		menu_cnt = str.nextInt();
		str.nextLine();
		
		String [] menu = new String [menu_cnt];
		System.out.println("<메뉴 입력>");
		for(int i = 0; i<menu.length; i++) {
			System.out.print("항목: ");
			menu[i] = str.nextLine();
		}
		
		System.out.println("\n추첨 중 입니다.");
		Thread.sleep(2000);
		menu_sel = (int)(Math.random()*menu.length);
		System.out.println("추첨된 항목은[ "+menu[menu_sel]+" ] 입니다.");
	}
}
