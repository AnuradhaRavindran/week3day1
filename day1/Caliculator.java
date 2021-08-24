package week3.day1;

public class Caliculator {

	public void add(int x,int y) {
		int z;
		z= x+y;
		System.out.println("The addition of two intergers is :" +z);

	}
	public void add(double x,double y)
	{
		float z;
		z= (float) (x+y);
		System.out.println("The addition of two float number is :" +z);

	}
	public void sub(int x,int y)
	{
		float z;
		z= x-y;
		System.out.println("The subtraction of two intergers is :" +z);

	}
	public void sub(double x,double y)
	{
		float z;
		z= (float) (x-y);
		System.out.println("The subtraction of two float is :" +z);

	}
	public void mul(int x,int y)
	{
		float z;
		z= x*y;
		System.out.println("The multiplication of two intergers is :" +z);

	}
	public void mul(double x,double y)
	{
		float z;
		z= (float) (x*y);
		System.out.println("The multiplication of two float is :" +z);

	}
	public void div(int x,int y)
	{
		float z;
		z= x/y;
		System.out.println("The division of two intergers is :" +z);

	}
	public void div(double x,double y)
	{
		float z;
		z= (float) (x/y);
		System.out.println("The division of two float is :" +z);

	}
	public static void main(String[] args) {
	
		Caliculator calc = new Caliculator();
		calc.add(10, 15);
		calc.add(10.10, 15.11);
		calc.sub(15, 8);
		calc.sub(20.47, 15.02);
		calc.mul(2, 3);
		calc.mul(12.10, 5.23);
		calc.div(14.2, 7.2);
		calc.div(10, 5);
		
	}

}
