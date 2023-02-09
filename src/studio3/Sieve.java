package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	boolean [] notPrime = new boolean[40];
	int p = 2;
	int n = 1; 
	while (p<40)
	{
	for (int i = 0 ; i < notPrime.length; i++)
	{
		if (i%p==0 && i!=p)
			{
			notPrime[i]= true;
			}
	}
	p++;
	}
	for (int j = 0; j < notPrime.length; j++)
	{
		if (notPrime[j]==false)
		{
			System.out.println(j);
		}
	}
	}
		
		
//	Scanner in = new Scanner(System.in);
//	int max = 40;
//	int length = 40;
//	int f = 1;
//	int p = 2;
//	int n = 0;
//	int [] numbers = new int[max];
//	int i = 0;
//	for (i = 0; i < max-1; i++);
	{
		
	};
//		while (f < (max-1))
//		{
//			f++;
//			numbers[i] = f;/
//		}
//	}
	//System.out.println(numbers.length);

	}


