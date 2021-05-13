import java.util.Scanner;
public class Insert_Elemen {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter  size of  array : ");
		int n = sc.nextInt(); 
		int a[] =new int[n+1];
		System.out.println("enter values in to the array : ");
		for(int i = 0 ; i < n ; i ++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter the index to insert an element : ");
		int index = sc.nextInt();
		System.out.println("enter the element to insert in an array : ");
		int x = sc.nextInt();
		for(int i = (n-1) ; i >= (index-1) ; i --) {
			a[i+1]=a[i];
		}
		a[index - 1] = x;
		System.out.println("after inserting : ");
		for(int i = 0 ; i < n ; i ++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(a[n]);
		}
		
	}

