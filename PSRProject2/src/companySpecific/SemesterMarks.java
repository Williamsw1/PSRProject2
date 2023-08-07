package companySpecific;

import java.util.Scanner;

public class SemesterMarks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Semester");

		int numOfSemesters = scanner.nextInt();

		int[][] marks = new int[numOfSemesters][100];
		int noOfSubjects;
		// int numberOfSemester;
		for (int i = 0; i < numOfSemesters; i++) 
		{
			System.out.println("Enter the no of subjects in semester:" + (i + 1) + ": ");

			noOfSubjects = scanner.nextInt();

			System.out.println("Enter the marks obtainted in semester:" + (i + 1));

			for (int j = 0; j < noOfSubjects; j++) 
			{

				marks[i][j] = scanner.nextInt();

				if (marks[i][j] < 0 || marks[i][j] > 100) 
				{
					System.out.println("You have entered invalid marks");

				}

			}

		}
		
		for(int i=0;i<numOfSemesters;i++)
		{
			
			int maxMark=0;
			for(int j=0; j<marks[i].length;j++)
			{
				if(marks[i][j]>maxMark)
				{
					maxMark=marks[i][j];
				}
				
			}
			
			System.out.println("Maximum mark in semester: "+(i+1)+":"+maxMark);
			
		}

	}

}
