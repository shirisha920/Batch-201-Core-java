import java.util.Scanner;

public class Sort_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		System.out.println("Enter elements in an array : ");
		
		int a[]=new int[5];
		
		for(int i = 0 ; i < a.length; i ++) {
			
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = i+1 ; j < a.length ; j ++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("Elements after sorting : ");
		for(int i = 0 ; i < a.length; i ++) {
			System.out.print(a[i] + " ");
		}
	}

}
