package mypkg;

public class calculator {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	
	public int sub(int a, int b)
	{
		return a-b;
	}


	public static void main(String[] args) {
		calculator ob = new calculator();
		System.out.print("sum is : "+ob.sum(20,10));
		System.out.print("sub is : "+ob.sub(20,10));

	}

}
