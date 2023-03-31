package SmartPhone;

public class phone {

	public static void main(String[] args) {
		PhoneS[] phone1 = new PhoneS[3];
		
		for(int i=0; i<3; i++) {
			phone1[i] = new PhoneS();
		}
		phone1[0].setName("G6");
		phone1[1].setName("아이폰7");
		phone1[2].setName("Note10");
		
//		for(int i=0; i<3; i++) {
//			phone1[i] = new PhoneS();
//		}
		phone1[0].setTelecom("LG");
		phone1[1].setTelecom("KT");
		phone1[2].setTelecom("SKT");
		
//		for(int i=0; i<3; i++) {
//			phone1[i] = new PhoneS();
//		}
		phone1[0].setPrice("70만원");
		phone1[1].setPrice("95만원");
		
		phone1[2].setPrice("90만원");
		
//		for(int i=0; i<3; i++) {
//			phone1[i].disp();
//			System.out.println();
//		}
		System.out.println("\tname\ttelecom\tprice");
		for(int i=0; i<3; i++) {
			phone1[i].disp(i+1);
		}
	}

}
class PhoneS{
	private String name;
	private String telecom;
	private String price;
	
	PhoneS(){
		this.name = " ";
		this.telecom = " ";
		this.price = " ";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public String getTelecom() {
		return this.telecom;
	}
	public String getPrice() {
		return this.price;
	}
	
//	public void disp() {
//		System.out.println("name : "+getName());
//		System.out.println("telecom : "+getTelecom());
//		System.out.println("price : "+getPrice());
//	}
	public void disp(int num) {
		System.out.print("["+num+"]");
		System.out.print("\t"+getName());
		System.out.print("\t"+getTelecom());
		System.out.println("\t"+getPrice());
	}
	
}
