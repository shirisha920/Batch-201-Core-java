import java.util.Scanner;

public class ECC_04_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
        System.out.println(isPalindrome(sc.nextInt()));
    }

    public static int isPalindrome(int num) {
    	
		if(num <= 0) {
			return -1;
		}
		else if(num < 100) {
			return -2;
		}
		else if(num > 100) {
			int reminder, rev=0,temp;
		temp=num;
		while(num!=0) {
			reminder=num%10;
			rev=(rev*10)+reminder;
			num=num/10;
		}
		if(rev == temp)
			return 1;
		else 
			return 0;
		}    
		else {
			return 0;
		}

	}

}
