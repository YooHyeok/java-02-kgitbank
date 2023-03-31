
public class MethodEx {
	
//--------------------MethodEx.add()---------------------------
	long add; 
	
	public void setadd(long a, long b) { //set
		//void의 뜻 : 
		long add = a+b;
		System.out.println("add(5L,3L) = "+add);
	}
	public long getadd() { //get //get메서드의 참조형 : 
		return add;
	}
//=============================================================
	long add(long a, long b) {
		long add = a+b;
		return add;
	}
	
	long subtract(long a, long b) {
		long subtract = a-b;
		return subtract;
	}
	long multiply(long a, long b) {
		long multiply = a*b;
		return multiply;

	}
	double divide(long a, long b) {
		double divide = (double)a/b;
		return divide;
	}
//--------------------------------------------------------
	//ststic method example
		
	static long sAdd(long a, long b) {
		long add = a+b;
		return add;
	}
	
	static long sSubtract(long a, long b) {
		long subtract = a-b;
		return subtract;
	}
	static long sMultiply(long a, long b) {
		long multiply = a*b;
		return multiply;
	}
	static double sDivide(long a, long b) {
		double divide = (double)a/b;
		return divide;
	}


}
