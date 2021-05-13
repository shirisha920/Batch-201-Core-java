import java.util.Scanner;

public class ECC_03_MultipleOf100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
        System.out.println(getNextMultipleOf100(num));
    }
    
    public static int getNextMultipleOf100(int num) {
    	int res=((num+99)/100)*100;
    	if(num <= 0)
    		return -1;
    	else
    		return res;

	}

}
