public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(args[0]);
		try {
		if(num%2==0)
		System.out.println("Even Number \n");
		else
		System.out.println("odd number \n");
		}
		catch(Exception e) {
			System.out.println("error");
		}
		

	}