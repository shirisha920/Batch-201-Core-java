public class ECC_01_SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
        System.out.println(getSumOfDigits(sc.nextInt()));
    }

    public static int getSumOfDigits(int num)	{
    	if(num > 10 && num < 99) {
    		int num1=num/10;
    		int num2=num%10;
    		int sum=num1+num2;
    		return sum;   
    	}
		else if(num < 0) {
			return -3;
		}
		else if(num > 99){
			return -2;
		}
		else if(num > 0 && num < 9){
			return -1;
		}
		else
		{
			return 0;
		}
    	
    }
}
