package com.xworkz.Programs;

public class ArrayMatrix {
		 public static void print2D1(int mat[][])
		    {
			 public static void print2D(int mat1[][])
			    {
			        // Loop through all rows
			        for (int i = 0; i < mat1.length; i++)
			 
			            // Loop through all elements of current row
			            for (int j = 0; j < mat1[i].length; j++)
			                System.out.print(mat1[i][j] + " ");
			    }
			 
			    public static void main(String args[])
			        
			    {
			        int mat[][] = { { 1, 2, 3, 4 },
			                        { 5, 6, 7, 8 },
			                        { 9, 10, 11, 12 } };
			        print2D1(mat);
			    }
}
}
