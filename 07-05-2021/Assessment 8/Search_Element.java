import java.util.Scanner;

public class Search_Element {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a[] =new int[8];
		System.out.println("enter  " + a.length + "   values in to the array : ");
		for(int i = 0 ; i < a.length ; i ++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter the element to search : ");
		int x = sc.nextInt();
		for(int i = 0 ; i < a.length ; i ++) {
		
		if(a[i] == x) {
		
		System.out.println(x + " founded in index " + (i+1));
		
		}
		
		}
		
	}

}
