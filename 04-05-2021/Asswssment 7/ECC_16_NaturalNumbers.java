public class ECC_16_NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		System.out.println(getNaturalNumbers(num1, num2));
	}

	public static String getNaturalNumbers(int num1,int num2)
	{
		while(num1 < 0 && num2 < 0) {
			return "-1";
		}
		while(num1 == 0 && num2 == 0) {
			return "0";
		}
		while(num1 <= num2) {
			System.out.print(num1 + " ");
			num1++;
			}
		return " ";

	}

}
