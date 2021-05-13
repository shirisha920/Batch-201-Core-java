public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = Integer.parseInt(args[0]);
		int secondNum = Integer.parseInt(args[1]);
		
		System.out.println("before Swapping : " + firstNum + " " +secondNum);
		
		firstNum = firstNum + secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;
		
		System.out.println("after Swapping : " + firstNum + " "+ secondNum);
		
	}

}
