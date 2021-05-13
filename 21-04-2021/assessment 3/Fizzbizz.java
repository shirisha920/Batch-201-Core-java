
public class Fizzbizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(getOutputString(Integer.parseInt(args[0])));
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

	private static String getOutputString(int num) {
		// TODO Auto-generated method stub
		for(int i=1;i<=num;i++) {
			if((i%3==0) && (i%5==0))
			
				System.out.print("FizzBizz");
			else if(i%5==0)
				System.out.print("Bizz");
			else if(i%3==0)
				System.out.print("Fizz");
			else
				System.out.print(i);
			System.out.print(","+" ");
		}
		
		return "";
	}
}