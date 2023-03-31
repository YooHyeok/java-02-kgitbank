import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	/*
	컬렉션 프레임 워크(Collection Frame Work)
		- 데이터 집합을 저장하는 클래스들을 표준화 한 설계
		- 데이터 그룹을 다루고 표현하기 위한 단일화된 구조

	컬렉션 : 데이터 그룹
	프레임워크 : 표준화 된 프로그래밍 방식

	컬렉션 프레임 위크의 핵심 인터페이스
		-List : 순서가 있는 데이터 집합, 중복 허용
			- ArrayList, LinkedList, Vector, Stack
		-Set : 순서가 없는 데이터 집합, 중복을 허용하지 않는다.
			- HashSet, TreeSet, SortedSet
		-Map : 키와 값의 쌍으로 이루어진 데이터 집합
			- HashMap, HashTable, TreeMap, etc...

	제네릭스 : 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스의 컴파일 시 타입 체크
		- 컬렉션 클래스는 다양한 종류의 객체를 취급할 수 있기 때문에 사용할 때 마다 타입을 확인해야 한다.
		- 객체의 타입을 컴파일할때 확인해 주면 형 변환의 변거로움이 줄어든다.
		- 제네릭스를 사용하면 지정하지 않은 타입의 객체를 저정할 수 없다.
	제네릭스 구현 예
	컬렉션 클래스 <저장할 객체 타입> 변수명 = new 컬렉션클래스<저장할 객체 타입>
	<저장할 객체 타입>에 사용될 수 있는 대표문자
		- T : reference Type
		- E : Element
		- V : Value
		- K : Key

	Iterator
		-컬렉션에 저장된 요소를 읽어오기 위해 사용하는 표준화된 인터페이스
		-컬렉션 인터페이스에는 iterator를 반환하는 itereator()메서드를 정의하고 있다.
		-hasNext() : 
		-next() :
	
	Map : key와 Value를 하나의 쌍으로 묶어서 저장하는 컬렉션
		- 키는 중복 될수 없지만 값은 중복을 허용한다.
		- 중복된 키와 값을 저장하면 마지막에 입력한 값이 저장된다
	 */
	public static void main(String[] args) {
		/*
		ArrayList list = new ArrayList();
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));

		ArrayList list2 = new ArrayList(list.subList(1, 4)); // 인덱스 1번부터 4번전까지 (3번인덱스)
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);

		System.out.println("list.containAll(list2) : "+ list.containsAll(list2));
		list2.set(3, "AA");
		System.out.println("수정된 list2 : " + list2);
		for(int i=0; i<list2.size(); i++) { //size() = 배열의 길이(length)
		System.out.println("list2["+i+"] : " + list2.get(i)); //list.get() = 인덱스 값 읽어오기
		}
		list2.remove(3); // 리스트의 3번 인덱스 요소 삭제 .remove(index)

		for(int i=0; i<list2.size(); i++) { //size() = 배열의 길이(length)
			System.out.println("list2["+i+"] : " + list2.get(i)); //list.get() = 인덱스 값 읽어오기
		}
		 */
//		Buyer b = new Buyer();
//		//		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		//		ArrayList<Audio> audioList = new ArrayList<Audio>();
//		//		ArrayList<Computer> computerList = new ArrayList<Computer>();
//		ArrayList<Product> list = new ArrayList<Product>();
//
//		list.add(new Tv());
//		list.add(new Audio());
//		list.add(new Computer());
//
////		b.buy(tvList.get(0));
////		b.buy(audioList.get(0));
////		b.buy(computerList.get(0));
//		b.showList();
//
//		Iterator it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		b.showList();
		HashMap map = new HashMap();
		map.put("kim kang sa", "1234");
		map.put("kks junior", "5678");
		map.put("kks junior", "6789");
		
		Scanner info = new Scanner(System.in);
		
		while(true) {
			System.out.println("[아이디와 비밀번호를 입력해 주세요]");
			System.out.print("아이디 : ");
			String id = info.nextLine().trim();//공백을 없애주는
			System.out.print("비밀번호 : ");
			String password = info.nextLine().trim();
			
			if (!map.containsKey(id)) {
				System.out.println();
				System.out.println("아이디가 존재하지 않습니다.");
				System.out.println("다시 입력해주세요.");
				System.out.println();
				continue;
			}
			
			else {
				if(!map.get(id).equals(password)) {
					System.out.println();
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println("다시 입력해주세요.");
					System.out.println();
				}
				else {
					System.out.println();
					System.out.println("환영합니다.");
					break;
				}
			}
		}
	}
}
class Product{
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product{
	Audio(){
		super(300);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Product [] item = new Product[10];
	int i = 0;
	//	void buy(Tv t) {
	//		money -= t.price;
	//		bonusPoint += t.bonusPoint;
	//	}
	//	void buy(Computer c) {
	//		money -= c.price;
	//		bonusPoint += c.bonusPoint;
	//	}
	//	void buy(Audio a) {
	//		money -= a.price;
	//		bonusPoint += a.bonusPoint;
	//	}
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;

		if (i>=10) {
			System.out.println("더이상 제품을 구입할 수 없습니다.");
			return;
		}
		item[i++] = p;
		System.out.println(p+"을(를) 구입하셨습니다.");
	}

	void showList() {
		String itemList = " ";

		for(int i = 0; i<item.length; i++) {
			if(item[i] == null) {
				break;
			}
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 제품은 " + itemList+"입니다.");
	}
}


