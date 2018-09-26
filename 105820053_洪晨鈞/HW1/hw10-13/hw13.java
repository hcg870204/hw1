public class Sample13
{
	public static void main(String[] args)
	{
		int i_d = 2;
		double d_PI = 3.14;
		
		System.out.println("直徑是"+ i_d +"公分");
		System.out.println("其圓周為"+ ( i_d * d_PI )+"公分");
		
		int i_num1 = 5;
		int i_num2 = 4;
		
		double div1 = i_num1/i_num2;
		double div2 = (double)i_num1/(double)i_num2;
		
		System.out.println("5/4等於"+ div1);
		System.out.println("5/4等於"+ div2);
	}
}