import java.util.Scanner;

public classimport java.util.Scanner;

public class Arrayexample
 {

	public static void main(String[] args) {

		int matA[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix values:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matA[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix values are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(matA[i][j]+" ");
			}
			System.out.println();
		}

	}

 {

	public static void main(String[] args) {

		int matA[][]=new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix values:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matA[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix values are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(matA[i][j]+" ");
			}
			System.out.println();
		}

	}
