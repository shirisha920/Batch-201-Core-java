
public class Prime {
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) 
			if(num%i==0)
				count++;
		return ((count==2)?true:false);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(isPrime(Integer.parseInt(args[0])));
			}
			catch(Exception e) {
				System.out.println("error");
			}

	}

}