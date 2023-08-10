package companySpecific;

import java.util.*;

public class MaximumMazeCycle 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] edges = new int[N];
		for (int i = 0; i < N; i++) 
		{
			edges[i] = scanner.nextInt();
		}

		int maxCycleLength = findLargestCycleLength(edges);
		System.out.println(maxCycleLength);
	}

	public static int findLargestCycleLength(int[] edges) 
	{
		int maxCycleLength = -1;
		boolean[] visited = new boolean[edges.length];
		boolean[] inCurrentPath = new boolean[edges.length];

		for (int i = 0; i < edges.length; i++) 
		{
			if (!visited[i]) 
			{
				int current = i;
				int cycleLength = 0;

				while (current != -1 && !visited[current]) 
				{
					visited[current] = true;
					inCurrentPath[current] = true;
					current = edges[current];
					cycleLength++;
				}

				if (current != -1 && inCurrentPath[current]) 
				{
					maxCycleLength = Math.max(maxCycleLength, cycleLength);
				}

				while (current != -1 && inCurrentPath[current]) 
				{
					inCurrentPath[current] = false;
					current = edges[current];
				}
			}
		}
		return maxCycleLength;
	}
}

/*
 * 
 * 
 * Question 3: Largest sum cycle
You are given a maze with N cells. Each cell may have multiple entry
points but not more than one exit (i.e. entry/exit points are unidirectional
doors like valves). The cells are named with an integer from 0 to N-1.
We have to find: The length of the largest cycle in the maze, Return -1 if
there is no cycle exists.

Sample Input :
23
4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21
Sample Output :
6

*/






