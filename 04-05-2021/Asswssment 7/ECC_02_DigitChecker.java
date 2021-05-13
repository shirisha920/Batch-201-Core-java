public class ECC_02_DigitChecker {

	public static void main(String[] args) {
		
        System.out.println(getDiffOfDigits(Integer.parseInt(args[0])));
    } 
    public static int getDiffOfDigits(int num) {
    	int num1=num/10;
		int num2=num%10;
		int diff=num1-num2;
		
    	if(num > 10 && num < 99) 
    		return diff;
		else if(num < 0) 
			return -3;
		else if(num > 99)
			return -2;
		else if(num > 0 && num < 9)
			return -1;
    	
		return diff;   
		
	
	}

}
