public class ECC_06_GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
        int num2 = 45;
        System.out.println(getGreatest(num1, num2));
    }

    public static int getGreatest(int num1, int num2) {
    	if(num1> 0 && num2 > 0 && num1 > num2 || num2 > num1)
    		return 1;
    	else if(num1 < 0 && num2 < 0)
    		return -1;
    	else if(num1 <= 0 && num2 <= 0)
    		return -2;
    	else
    		return 0;
		
	}

}
