public class ECC_08_OddRounder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
        System.out.println(oddRounder(num));
    }

    public static int oddRounder(int num) {
    	
    	if(num < 0)
    		return -1;
    	else if(num == 0)
    		return -2;
    	else if(num > 0 && num % 2 ==0)
    	    return num;
    	else if(num > 0 && num % 2 !=0)
		return (num+9)/10*10;
    	else
    		return 0;

	}

}
