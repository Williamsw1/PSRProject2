package companySpecific;

import java.util.Scanner;
import java.lang.Math;

class TravelCost
{

	public static void main(String... args)
	{

		System.out.println("Enter the 4 values for the given data");
		Scanner sc = new Scanner(System.in);
		int R1 =sc.nextInt();
		int N  =sc.nextInt();
		int R2 =sc.nextInt();
		int x = sc.nextInt();

		int totalTravelCost = calculateTotalCost(R1,N,R2,x);
		System.out.println(totalTravelCost);

		sc.close();

	}

	public static int calculateTotalCost(int R1,int N,int R2,int x)
	{

		int totalCost=0;
		int totalHours =(int) Math.ceil(x/60.0);

		for(int i =1;i<=totalHours;i++)
		{
			if(i<=N)
			{
				totalCost+=R1;
			}
			else
			{
				totalCost+=R2;
			}

		}

		return totalCost;
	}
	
}


/*

1. For hiring a car, a travel agency charges R1 rupees per hour for the first N hours and then R2 rupees
per hour. Given the total time of travel in minutes is X. The task is to find the total traveling cost in
rupees.
Note: While converting minutes into hours, ceiling value should be considered as the total number of
hours.
For example: If the total travelling time is 90 minutes,
i.e. 1.5 hours, it must be considered as 2 hours.
Input Output Explanation
20 ---Value of R1
4 --- Value of N in hours
40 --- Value of R2
300 --- Value of X in
minutes
120
Total travelling hours = 300/60 = 5 hours
Rupees 20/hours for first 4 hours = 20 * 4 = 80 rupees
Rupees 40/hours in 5th hour = 40 * 1 = 40 rupees
Hence, the total travelling cost = 80 + 40 = 120 rupees
30 --- Value of R1
5 --- Value of N in hours.
35 --- Value of R2
500 -- Value of X in minutes
290
Total travelling hours = 500/60 = 8.33, Ceiling value of 8.33
= 9 hours
Rupees 30/hours for first 5th hours = 30 * 5 = 150 rupees
Rupees 35/hours in 5th hour = 35 * 4 = 140 rupees
Hence, the total travelling cost = 150 + 140 = 290 rupees
30--- Value of R1
10--- Value of N in hours
35 ---- Value of R2
5 --- Value of X in minutes
30
Total travelling hours = 3/60 = 0.05, Ceiling value of 0.05 = 1
hour
Rupees 30/hour for first 10 hours = 30 * 1 = 30 rupees
Constraints:
1 < R1 < R2< 100
1 < = N < = 10
1 < = X < 10000

*/