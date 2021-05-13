public class Sum1 {
	public static String isRound(int a, int b, int c) {
		int sum=0;
		if(a>=0 && b>=0 && c>=0) 
		sum = round(a)+round(b)+round(c);
			return "sum=" + sum;
	}
	public static int round(int n)
	{
	if(n/10!=0) 
	{
	return (((n/10)+1)*10);
	}
	return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRound(0,20,34));
	}

}
