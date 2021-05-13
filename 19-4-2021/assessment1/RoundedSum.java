public class RoundedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			int sum=0;
			if(a>=0&&b>=0&&c>=0) {
				sum=sum+round(a)+round(b)+round(c);
				System.out.println(sum);
			}
			else
				System.out.println("error");
		}
		catch(Exception e) {
		System.out.println("error");
		}

	}

	private static int round(int n) {
		int num=0;
		if(n%10>=5)
		{
			num=((n/10)+1)*10;
		}
		else {
			num=(n/10)*10;
		}
		
		return num;
	}

}
