public class ECC_10_EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 44;
        System.out.println(isEvenOrOdd(num));
    }

    public static String isEvenOrOdd(int num) {
    	
    	if(num <= 0)
    		return "Invalid Input";
    	else if(num % 2 == 0)
    		return "even";
    	else if(num % 2 != 0)
    		return "odd";
    	else
    		return null;
	
	}

}
