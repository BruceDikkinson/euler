package project.euler;

import java.util.ArrayList;
import java.util.Collections;

public class Problem24 {
	public static ArrayList<String> finalPermutations;

	public static void main(String[] args)
	{
		ArrayList<String> newPermutations = new ArrayList<String>();
		createPermutations(newPermutations, 10);
		
		System.out.println(finalPermutations);
	}
	
	public static void createPermutations(ArrayList<String> permutations, int limit)
	{
		ArrayList<String> newPermutations = new ArrayList<String>();
		
		if (permutations.isEmpty())
		{
			for (int i = 0 ; i<10; i++)
			{
				newPermutations.add( Integer.toString(i));
			}
		}
		else
		{		
			String perm;
			for (String num : permutations)
			{

				for (int i = 0 ; i<10; i++)
				{
					if ( num.contains(Integer.toString(i)) )
					{

						continue;
					}
					perm = num + Integer.toString(i) ;
					System.out.println(perm);
					newPermutations.add(perm);
				}
				if (newPermutations.size()>1000000)
				{
					break;
				}
			}
		}
		if (newPermutations.get(0).length() == limit)
		{	
			System.out.println(newPermutations.get(999999));
			return;
		}
		
		createPermutations(newPermutations, limit);

	}

}