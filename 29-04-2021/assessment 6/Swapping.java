public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = Integer.parseInt(args[0]);
        int secondNum = Integer.parseInt(args[1]);
        int thirdNum = 0;
        
        System.out.println("before swapping:" + firstNum + " " + secondNum);
        
        thirdNum = firstNum;
        firstNum = secondNum;		
        secondNum = thirdNum;
        
        System.out.println("after swapping:" + firstNum + " " + secondNum);
	}

}
