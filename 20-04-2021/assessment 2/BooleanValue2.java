public class BooleanValue2 {
	public static String isBoolean(boolean b,boolean c, boolean d) {
		boolean result=(((b==true)&&(c==true))||((c==true)&&(d==true))||((b==true)&&(d==true)));
		
		return "result=" + (result?true:false);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			boolean s=Boolean.parseBoolean(args[0]);
			boolean s1=Boolean.parseBoolean(args[1]);
			boolean s2=Boolean.parseBoolean(args[2]);
			BooleanValue2 bv=new BooleanValue2();
			bv.isBoolean(s, s1, s2);
	}
		catch(Exception e) {
			System.out.println("error");
		}

	}
}
