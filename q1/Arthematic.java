package q1;
abstract class Arithmetic {
	int num1, num2, result;
	
	public abstract int calculate(int num1, int num2);
	
	//returns num1
	public int getNum1() {
	return num1;
	}
	
	//sets num1
	public void setNum1(int num1) {
	this.num1 = num1;
	}
	
	//returns num2
	public int getNum2() {
	return num2;
	}
	
	//sets num2
	public void setNum2(int num2) {
	this.num2 = num2;
	}
	}
	
	//adds numbers
	class Addition extends Arithmetic{
	@Override
	public int calculate(int num1, int num2) {
	result=num1+num2;
	return result;
	}
	}
	
	//subtracts numbers
	class Subtraction extends Arithmetic{
	@Override
	public int calculate(int num1, int num2) {
	result=num1-num2;
	return result;
	}	
	}
	
	//multiplies numbers
	class Multiplication extends Arithmetic{
	@Override
	public int calculate(int num1, int num2) {
	result=num1*num2;
	return result;
	}
	}
	
	//divides numbers
	class Division extends Arithmetic{
	@Override
	public int calculate(int num1, int num2) {
	try {
		result=num1/num2;
	} catch (ArithmeticException e) {
		System.out.println("second number is 0");
		e.printStackTrace();
	}
	return result;
	}
}