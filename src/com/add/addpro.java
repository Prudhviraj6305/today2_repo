package com.add;

import java.util.Scanner;

public class addpro {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a[][] = { { 11, 22, 33 }, { 22, 33, 44 }, { 55, 66, 55 } };
		int b[][] = { { 55, 55, 55 }, { 55, 22, 33 }, { 55, 66, 44 } };
		int c[][] = new int[3][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "   ");

			}
			System.out.println("");
		}
		System.out.println("enter how many rows and coloumns");
		int d=sc.nextInt();
		int e=sc.nextInt();
		System.out.println(d+"*"+e+"  matrix");
		System.out.println("first matrix");
		int d1[][]=new int[d][e];
		int d2[][]=new int[d][e];
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<e;j++)
			{
				d1[i][j]=sc.nextInt();
			}
		}
		System.out.println("for another matrixs");
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<e;j++)
			{
				d2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<e;j++)
			{
				System.out.print(d1[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<e;j++)
			{
				System.out.print(d2[i][j]+" ");
			}
			System.out.println();
		}
		int d3[][]=new int[d][e];
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<e;j++)
			{
				d3[i][j]=d1[i][j]+d2[i][j];
			}
			System.out.println();
		}
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<e;j++)
			{
				System.out.print(d3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
