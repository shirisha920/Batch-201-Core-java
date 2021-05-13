public class Biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=4){
			System.out.println("enter only 5 values : ");
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
		next = Integer.parseInt(args[3]);
		
		if(big < next)
		{
			big = next;
		}
		next = Integer.parseInt(args[4]);
		if(big < next)
		{
			big = next;
		}
		System.out.println("Biggest Number is = "+ big);
		}
		catch( Exception e) {
			System.out.println("Enter only numbers : ");
		}
	}

}
