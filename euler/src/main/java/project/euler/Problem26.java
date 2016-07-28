package project.euler;

import java.util.ArrayList;

public class Problem26 {
	
	
	public static void main (String[] args)
	{
		int max =0;
		int d =0;
		int cycles;
		
		for (int i = 1 ; i <= 1000; i++){
			if (GlobalFunctions.isPrime(i))
			{
				cycles = checkReciprocalCycles(i);
				if (cycles > max)
				{
					max = cycles;
					d = i;
				}
			}

		}
		System.out.println(max);
		System.out.println(d);
	}
	
	public static int checkReciprocalCycles(int d)
	{
		int count = 0;
		int num = 10;
		ArrayList<Integer> rest = new ArrayList<Integer>();
		while(true)
		{
			if (num % d == 0)
			{
				break;
			}
			else
			{
				num = (num - ( (num/d) * d) ) *10 ;
				if (rest.contains(num))
				{
					count = rest.size()-rest.indexOf(num);
					break;
				}				
				rest.add(num);
			}		
		}
		
		return count;
		
	}
	
}
