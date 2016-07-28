package project.euler;

/**
 * Hello world!
 *
 */
public class Problem27 
{
    public static void main( String[] args )
    {
    	int resulta = 0;
    	int resultb = 0;
    	int maxPrimes = 0;
    	int primes;
    	
    	for(int a= -999; a < 1000 ; a++)
    	{
    		for(int b= -999; b < 1000 ; b++)
        	{	
    			primes = consecutivePrimes(a, b);
    			if (primes > maxPrimes)
    			{
    				maxPrimes = primes;
    				resulta = a;
    				resultb = b;
    			}
        	}
    	}
    	System.out.println( resulta);
    	System.out.println( resultb);
        System.out.println( resulta * resultb);
    }
    
    public static int consecutivePrimes(int a, int b)
    {
    	int count = 0;
    	int n=0;
    	int result;
    	
    	while(true)
    	{
    		result = n * n + a * n + b;
    		if ( !GlobalFunctions.isPrime(result))
    		{
    			break;
    		}
    		else
    		{
    			count++;
    		}	
    		n++;
    	}
    	
    	return count;
    }
}
