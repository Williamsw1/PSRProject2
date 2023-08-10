package companySpecific;

import java.util.*;

class NearestMeetingCell {
	public static int minimumWeight(int n, int[] edges, int C1, int C2) {
		// Create directed graph from the array given in input
		List<List<Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {

			graph.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < n; i++) {
			if (edges[i] != -1) {
				graph.get(i).add(edges[i]);
			}
		}
		long[] A = new long[n];
		long[] B = new long[n];
		Arrays.fill(A, Long.MAX_VALUE);
		Arrays.fill(B, Long.MAX_VALUE);

		dijkstra(C1, graph, A);
		dijkstra(C2, graph, B);

		int node = 0;
		long dist = Long.MAX_VALUE;
		for (int i = 0; i < n; i++) {

			if (A[i] == Long.MAX_VALUE || B[i] == Long.MAX_VALUE)
				continue;

			if (dist > A[i] + B[i]) {
				dist = A[i] + B[i];
				node = i;
			}
		}
		if (dist == Long.MAX_VALUE)
			return -1; // if no meeting point is found
		return node;
	}

	private static void dijkstra(int start, List<List<Integer>> graph, long[] distances) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(start);
		distances[start] = 0;
		while (!pq.isEmpty()) {
			int curr = pq.poll();
			for (int neighbor : graph.get(curr)) {
				long distance = distances[curr] + 1;
				if (distance < distances[neighbor]) {

					distances[neighbor] = distance;
					pq.offer(neighbor);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] edges = new int[n];
		for (int i = 0; i < n; i++) {
			edges[i] = scanner.nextInt();
		}
		int C1 = scanner.nextInt();
		int C2 = scanner.nextInt();
		System.out.println(minimumWeight(n, edges, C1, C2));
	}
}

/*
 * 
 * Question 2: Nearest Meeting Cell
You are given a maze with N cells. Each cell may have multiple entry
points but not more than one exit (i.e. entry/exit points are unidirectional
doors like valves). The cells are named with an integer from 0 to N-1.
We have to find :
Given any two cells - C1, and C2, find the closest cell Cm that can be
reached from both C1 and C2.
INPUT FORMAT :
The first line contains the number of cells N.
The second line has a list of N values of the edge[ ] array, where edge[i]
contains the cell number that can be reached from cell 'i' in one step.
edge[i] is -1 if the ith doesn't have an exit.
The third line for each test case contains two cell numbers whose nearest
meeting cell needs to be found. (return -1 if there is no meeting cell from
two given cells)
OUTPUT FORMAT :
Output a single line that denotes the nearest meeting cell (NMC).
Sample Input :
23
4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21
9 2
Sample Output :
4
*/
