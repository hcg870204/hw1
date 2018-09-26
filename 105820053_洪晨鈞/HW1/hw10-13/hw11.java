public class Sample10
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("num1和num2的各種運算");
		System.out.println("num1 + num2等於"+(num1 + num2));
		System.out.println("num1 - num2等於"+(num1 - num2));
		System.out.println("num1 * num2的值是"+(num1 * num2));
		System.out.println("num1 / num2的值是"+sum(num1 / num2));
		System.out.println("num1 % num2的值是"+sum(num1 % num2));
		
		int num_a = 0;
		int num_b = 0;
		int num_c = 0;
		
		b=a++;
		c=++a;
		
		System.out.println("因為是在指定值之後才遞增，所以b的值為"+num_b);
		System.out.println("因為是在遞增之後才指定值，所以c的值為"+num_c);
	}
}