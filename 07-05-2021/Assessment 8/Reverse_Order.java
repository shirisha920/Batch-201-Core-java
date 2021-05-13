import java.util.Scanner;

public class Reverse_Order {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements into an array : ");
		int a[] = new int[8];
		int rev = 0;
		
		for(int i = 0 ; i < a.length ; i ++) {
			a[i] = sc.nextInt();
		}
		System.out.println("reverse orader of an array : ");
		for(int i =a.length-1; i >= 0 ;i --) {
			System.out.print(a[i] + " ");
		}
		

	}

}
