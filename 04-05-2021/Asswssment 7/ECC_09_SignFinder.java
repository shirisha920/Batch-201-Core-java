public class ECC_09_SignFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 34;
        System.out.println(findSign(num));
    }

    public static int findSign(int num) {
    	if(num > 0)
    		return 1;
    	else if(num <0)
    		return -1;
    	else 
    		return 0;

	}

}
