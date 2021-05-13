public class Armstrong1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stubr
		try {
			int sum=0, reminder,temp;
			int n=Integer.parseInt(args[0]);
			temp=n;
			while(n!=0) {
				reminder=n%10;
				sum=sum+(reminder*reminder*reminder);
				n=n/10;
			}
			if(temp==sum)
				System.out.println("Armstrong Number");
			else
				System.out.println("Not a Armstrong Number");
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}
}
