import java.util.Scanner;

public class MultiDImArrays
{

	public static void main(String[] args) {
		int matA[][]=new int[2][2];
		int matB[][]=new int[2][2];
		int matC[][]=new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Matrix A values:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				matA[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Matrix B values:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				matB[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				matC[i][j]=0;
				for(int k=0;k<2;k++)
				{
					matC[i][j]=matC[i][j]+matA[i][k]*matB[k][j];
				}
			}
		}
		System.out.println("Matrix Multiplication:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			System.out.print(matC[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
