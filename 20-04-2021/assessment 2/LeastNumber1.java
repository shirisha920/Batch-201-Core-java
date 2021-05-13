public class LeastNumber1 {
	public static String isLeast(int num1,int num2) {
		return "Least=" + ((num1<num2)?num1:num2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			
			System.out.println(isLeast(num1,num2));
		
		}
		catch(Exception e) {
			System.out.println("error");
		}
		

	}

}
