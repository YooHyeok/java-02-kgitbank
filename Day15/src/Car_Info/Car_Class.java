package Car_Info;

class Car{
	String CarN;
	String color;
	String gearType;
	int door;
	

	
	Car(){
		color = "white";
		gearType = "Semi Auto";
		door = 4;
	}
	Car(String CarN, String color, String gearType, int door){
		this.CarN = CarN;
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("["+CarN+"의 정보]");
		System.out.println("color : " + color);
		System.out.println("gearType : " + gearType);
		System.out.println("door : " + door);
		System.out.println(" ");
	}
}
