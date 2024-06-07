package interviewPractice;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int row= sc.nextInt();
		int col= sc.nextInt();
		
		int number[][]= new int[row][col];
		
		//input
		//rows
		for(int i=0;i<row;i++) {
			//cols
			for(int j=0;j<col;j++) {
				
			number[i][j]=sc.nextInt();
				
			}
			
			
		}
		int x=sc.nextInt();
		
		//output
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			if(number[i][j]==x)	
			{
				
			System.out.println(x +"number found on index: " +i+j);
			}
				
			}
			
			
			System.out.println();
			
			
		}
		
		

		
		

	}

}
