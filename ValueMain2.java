public class ValueMain2 
{
	public static void main(String[] args) 
	{
		Value2 obj=new Value2();
		int z=obj.add(10,50);
	
		float b=obj.add(12,13);
		double c=obj.add(11100, 110);
		
		System.out.println("the sum of two number is :" +z);
		System.out.println("the mul of two number is :" +b);
		System.out.println("the div of two number is :"+c);
	}

}
