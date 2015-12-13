
public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public static int findFactorial (int number)
	{
		int answer = 1;
		
		if (number == 0)
		{
			return 1;
		}
		
		for (int i = 1; i < number+1; i++)
		{
			answer = answer * i;
		}
		return answer;
	}
	
	public static int breakNumber(int number)
	{
		int sum = 0;
		
		for (int i = 0; i < Integer.toString(number).length(); i++)
		{
			sum = findFactorial(Integer.parseInt(Integer.toString(number).substring(i, i+1))) + sum;			
		}
		return sum;
		
	}
	
	public static int findNumbers()
	{
		int count = 0;
		int no = 0;
		
		for (int i = 3; i < 409113; i++)
		{
			no = breakNumber(i);
			
			if (no == i)
			{
				System.out.print(no);
				System.out.print('\n');
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String args[])
	{
		//int i = findFactorial(5);
		//System.out.print(i);
		System.out.print(findNumbers());
	}

}
