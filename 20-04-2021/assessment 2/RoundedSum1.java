public class RoundedSum1 {
	public static String isRound(int a, int b, int c) {
		int sum=0;
		if(a>=0 && b>=0 && c>=0) {
			sum=sum+round(a)+round(b)+round(c);
		}
		return "sum=" + sum;
	}
	 static int round(int n) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRound(11,32,26));
		System.out.println(isRound(0,20,35));
	}

}
