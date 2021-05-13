public class ECC_13_RoundedSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a = 22, b = 30, c = 46;
        System.out.println(sumOfRoundedValues(a, b, c));
    }

    public static int sumOfRoundedValues(int n1, int n2, int n3) {
    	int sum = 0;
		if(n1 >= 0 && n2 >= 0 && n3 >= 0) {
			sum = sum + round(n1) + round(n2) + round(n3);
		}
		return sum;
	}
	 static int round(int n) {
		int num =  0;
		if(n % 10 >= 5)
		{
			num = ((n / 10) + 1) * 10;
		}
		else {
			num = (n / 10) * 10;
		}
		
		return num;
	}
    

}
