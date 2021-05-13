public class CricketScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b=20.4;
        System.out.println(getDisplayDetailes(130,(float) 21.4)); 
   

	}

	private static String  getDisplayDetailes(int runs, float overs) {
		String x="";
		int count = (int)(overs * 10);
	    int q = count / 10;
	    int r= count % 10;
	    int balls = (q * 6) + r;
	    
	    if((runs < 100) || (balls < 100)){
            x = x + runs + " runs in " + balls + " balls " + " @ " + String.format("%.2f", (runs / balls)) + " runs per ball";
        }
        else {
            x = x + runs + " runs in " + overs + " overs " + " @ " + String.format("%.2f", (runs / overs)) + " runs per over";
        }
		return x;
	}

}
