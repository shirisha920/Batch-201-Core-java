public class ECC_12_SumOfMul10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 23, b = 34, c = 69;
        System.out.println(sumOfMultiples(a, b, c));
    }

    public static int sumOfMultiples(int a, int b, int c) {
    	
    	if(a > 0 && b > 0 && c > 0 ) {
		return (a+9)/10*10 + (b+9)/10*10 + (c+9)/10*10;
    	}
		return a + b + c;

	}

}
