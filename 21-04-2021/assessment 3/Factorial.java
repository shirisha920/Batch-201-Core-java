
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n=Integer.parseInt(args[0]);
			int fact = 1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println("factorial of"+ n+ " is " + fact);
			
		}
		catch(Exception e){
			System.out.println("error");
		}

	}

}
