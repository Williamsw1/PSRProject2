package companySpecific;
import java.util.*;

class MaximumWeightNode {

	public static int maxWeightCell(int N, List<Integer> Edge) {

		int[] temp = new int[N];

		for (int i = 0; i < N; i++) {

			if (Edge.get(i) != -1) {

				temp[Edge.get(i)] += i;
			}
		}

		int ans = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			if (temp[i] > max) {
				ans = i;
				max = temp[i];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
// Size of Edge
		int N = 23;
		List<Integer> Edge = Arrays.asList(4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22,21);
		
		System.out.println(maxWeightCell(N, Edge));
	}
}



/*
 * 
 * Question 1: Maximum weight node
You are given a maze with N cells. Each cell may have multiple entry
points but not more than one exit (i.e. entry/exit points are 
unidirectional
doors like valves).
The cells are named with an integer from 0 to N-1.
We have to find: Find the node number of the maximum-weight node
(The weight of a node is the sum of all nodes pointing to that node).

Sample Input :
23
4 4 1 4 13 8 8 8 0 8 14 9 15 11 -1 10 15 22 22 22 22 22 21

Sample Output :
22

Input:
4
2 0 -1 2
Output:
2
Explanation:
1 -> 0 -> 2 <- 3
weight of 0th cell = 1
weight of 1st cell = 0 (because there is no cell pointing to the 1st cell)
weight of 2nd cell = 0 + 3 = 3
weight of 3rd cell = 0
There is only one cell which has maximum weight (i.e 2) So, cell 2 is the
output.
Input:
1
Output:
-1
Explanation:
P a g e | 2
weight of 0th cell is 0.
There is only one cell so cell 0 has maximum weight.
Naive Approach:
The basic way to solve the problem is as follows:
Run a loop from 0 to N-1 and check the weight for every cell by traversing
the whole Edge[] array.
Efficient Approach:
We can optimize the above approach by using the below steps.
 As we know that the range of the cells is from 0 to N-1.
 So we can use extra space of O(N) for optimizing our solution
 To do this initially we will set all the values to zero. Let’s understand
this with the above example
 Let’s take an extra array temp of size N and set all values to zero:-
temp {0, 0, 0, 0}
 Now the given array is {2, 0, -1, 2}.
 Traverse the array from the beginning.
 At first, we will get 2 at index 0. It means we can move from 0->2
and the weight on cell 2 is 0. So update entry of 2 in the temp array
by adding the weight into this and as weight is 0 so the temp will
remain the same that is {0, 0, 0, 0}
 After this we will go to index 1 which is 0 it means we can move
from 1 to 0 and the weight on 0 will increase by 1 that is temp {1,
0, 0, 0}
 After this, we will go to index 2 which is -1 that is we can not go
from 2 to anywhere.
 In the end, we will go to index 3 which is 2 it means there is a path
between 3->2 and the weight on 2 will increase by 3 is temp {1, 0,
3, 0}
 In the end, we will find the index with the maximum value.


*/
