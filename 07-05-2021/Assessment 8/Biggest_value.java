import java.util.Scanner;

public class Biggest_value {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements : ");
		int[] arr = new int[10];
		for(int i = 1 ; i < arr.length ;i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println(getBiggestNum(arr));
     }
	static int getBiggestNum(int arr[]) {
		
		int big = 0;
		for(int i = 1 ; i < arr.length ;i++) {
			if(arr[i] > big) {
				big = arr[i];
			}
		}
		return big;
		
	}

}
