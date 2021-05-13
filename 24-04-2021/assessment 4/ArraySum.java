import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array");
	    int a=sc.nextInt();
		int[] n=new int[a];
		try {
		System.out.println("enter values in an array");
		for(int i=0;i<a;i++) {
			n[i]=sc.nextInt();
		}
			System.out.println(getSum(n));
		}
		catch(Exception e) {
			System.out.println("-1");
		}
	}

	private static String getSum(int[] n) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=0;i<n.length;i++)
			sum=sum+n[i];
		
		return "sum=" + sum;
	}

}