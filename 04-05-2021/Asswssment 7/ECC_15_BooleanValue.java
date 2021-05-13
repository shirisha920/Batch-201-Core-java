import java.util.Scanner;

public class ECC_15_BooleanValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter boolean values : ");
		
        System.out.println(countBoolean(sc.nextBoolean(),sc.nextBoolean(),sc.nextBoolean() ));
    }
    public static boolean countBoolean(boolean b1, boolean b2, boolean b3) {
    	if(b1 == true && b2 == true && b3 == true) {
    		return true;
    	}
    	else if(b1 == true && b2 == true && b3 == false) {
    		return true;
    	}
    	else if(b1 == true && b2 == false && b3 == false) {
    		return false;
    	}
    	else if(b1 == false && b2 == false && b3 == false) {
    		return false;
    	}
		return false;

	}

}
