import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int[] a = null;
		int[] b = null;
		
		System.out.println(sum(a, b));
		
	}
	static String sum(int[] a,int b[]) {
		
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements into an array a[] : ");
		a = new int[5];
		for(i = 0 ; i < a.length ; i ++) {
			a[i] = sc.nextInt();
		}
		System.out.println("enter the elements into an array b[] : ");
		b = new int[5];
		for(i = 0 ; i < a.length ; i ++) {
			b[i] = sc.nextInt();
		}
		
		int[] c = new int[5];

		for(i = 0 ; i < c.length ; i ++) {
		c[i] = a[i] + b[i];
		}
		System.out.println("Sum of two arrays : ");
		for(i = 0 ; i < c.length ; i ++) {
			System.out.print(c[i] + " ");
		}


		return "";
	}

}
