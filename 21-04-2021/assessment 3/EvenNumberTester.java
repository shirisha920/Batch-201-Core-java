
public class EvenNumberTester {
	public static boolean isEven(int n) {
		for(int i=0;i<=n;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		return true;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n=Integer.parseInt(args[0]);
			System.out.println(isEven(n));
		}
		catch(Exception e) {
			System.out.print("error");
			System.exit(0);	
		}
	}
}