import java.util.Scanner;

public class Two_D_Array {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
        int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		
		System.out.println("enter " + a.length + "elements to  1st array : ");
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = 0 ; j < a.length ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter " + b.length + "elements to  2nd array : ");
		for(int i = 0 ; i < b.length ; i ++) {
			for(int j = 0 ; j < b.length ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println(sum(a , b));
		System.out.println(diff(a , b));
		System.out.println(multi(a , b));

	}
	private static int[][] multi(int[][] a, int[][] b) {
		System.out.println("multiplication of two arrays : " );
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = 0 ; j < a.length ; j++) {
				int[][] c = new int[a.length][b.length];
                c[i][j] = a[i][j] * b[i][j];
				
				System.out.print(c[i][j]  + " ");
			}
			System.out.println();

		}
		
		return b;
	}
	private static int[][] diff(int[][] a, int[][] b) {
		System.out.println("Difernce of two arrays ");
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = 0 ; j < a.length ; j++) {
				int[][] c = new int[a.length][b.length];
				c[i][j] = a[i][j] - b[i][j];
				System.out.print( c[i][j] + " ");
			}
			System.out.println();

		}
		return a;
	}
	static int[][]  sum(int a[][],int b[][]) {
		System.out.println(" Sum of two arrays : ");
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = 0 ; j < a.length ; j++) {
				int[][] c = new int[a.length][b.length];
				c[i][j] = a[i][j] + b[i][j];
				System.out.print( c[i][j]  + " ");
			}
			System.out.println();
		}
		return a;

    }

}
