public class Rounder1 {
	public static String isRound(int n) {
	String res=n>0?(String.valueOf((n%2!=0)?n:(((n+9)/10)*10))):"Error";
	return res;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRound(35));
		System.out.println(isRound(32));

	}

}
