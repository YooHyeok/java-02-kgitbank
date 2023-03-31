
public class Main_Method {

	public static void main(String[] args) {
		MethodEx MethodEx = new MethodEx();
		
		long add = MethodEx.add(5L,3L);
		long subtract = MethodEx.subtract(5L,3L);
		long multiply = MethodEx.multiply(5L,3L);
		double divide = MethodEx.divide(5L,3L);
		
		System.out.println("add(5L,3L) = "+add);
		System.out.println("subtract(5L,3L) = "+subtract);
		System.out.println("multiply(5L,3L) = "+ multiply);
		System.out.println("divide(5L,3L) = "+ (double)divide);
		
		MethodEx.setadd(5,3);
		
		//=============================static method call
		MethodEx me = new MethodEx();
		
		System.out.println("static add=" + me.sAdd(200L,100L));
		System.out.println("static sub=" + MethodEx.sSubtract(200L,100L));
		System.out.println("static mul=" + MethodEx.sMultiply(200L,100L));
		System.out.println("static div=" + MethodEx.sDivide(200L,100L));
		
		System.out.println("참조변수를 이용한 접근");
		System.out.println("static add=" + MethodEx.sAdd(200L,100L));
		System.out.println("static sub=" + MethodEx.sSubtract(200L,100L));
		System.out.println("static mul=" + MethodEx.sMultiply(200L,100L));
		System.out.println("static div=" + MethodEx.sDivide(200L,100L));

	
	}
	
}
