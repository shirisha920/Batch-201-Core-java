public class BooleanValue {

	public static void main(String[] args) 
	{
		String s=args[0];
		String s1=args[1];
		String s2=args[2];
		
		if((s=="true"&&s1=="true")||(s=="true"&&s2=="true")||(s1=="true"&&s2=="true")) {
			System.out.println("true");
		}
		
		else {
			System.out.println("error");
			
			}
	}
}