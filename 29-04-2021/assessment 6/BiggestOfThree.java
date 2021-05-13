public class BiggestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 3) {
			System.out.println("enter only three numbers");
			return;
		}
		try {
			
			int big = Integer.parseInt(args[0]);
			int next = Integer.parseInt(args[1]);
			if(big < next)
			{
				big = next;
			}
			next = Integer.parseInt(args[2]);
			if(big < next)
			{
				big = next;
			}
			
			System.out.println("Biggest number is : "+ big);
		    
		}
		catch(Exception e) {
			System.out.println("Enter only numbers : ");
		}
		
	}

}
