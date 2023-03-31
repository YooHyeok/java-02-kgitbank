
public class Main {

	
	public static void main(String[] args) {
		Person saram1 = new Person();
		Person saram2 = new Person("김강사",42);
		Person saram3 = new Person("손강사",20);
		saram1.disp(); //인자값을 넣지 않았기때문에 디폴트값 출력.
		saram2.disp();
		saram3.disp();
		
		saram3.setAge(18);
		saram3.disp();
		
		saram1.setData("유강사",29);
		saram1.disp();
		
//		클래스에 접근불가능 private
//		saram1.age = 32;
//		saram2.name = "장동건";
	}

}
class Person{
	 String name;
	static int age;
	
	Person(){//생성자
		this.name = "아무개";
		this.age = 1;
	}
	Person(String name){
		this.name = name;
		this.age = 1;
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void disp() {
		System.out.println("이름 : "+ this.name);
		System.out.println("나이 : "+ this.age);
	}
	
	
}







