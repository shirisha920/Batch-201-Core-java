public class ECC_05_EvenFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 24;
        System.out.println(isEven(num));
    }
    
    public static int isEven(int num) {
    	if(num > 0 && num % 2 == 0)
    		return 1;
    	else if(num <= 0)
    		return -1;
    	else
    		return 0;

	}

}
