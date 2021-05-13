public class AlaramClock  {

	public static void main(String[] args) 
	{
		try {
		int day=Integer.parseInt(args[0]);
		String s=args[1];
		if((day>=0&&day<=6)&&(s=="true"||s=="false")) {
			//if its a vacation and weekday, print “10:00” as output
			if((s=="true")&&(day>0&&day<6)) {
				System.out.println("10:00");
			}
			//if its a vacation and weekend, print “off” as output
			else if((s=="true")&&(day==0||day==6)) {
				System.out.println("off");
			}
			//if its not a vacation and weekday, print “7:00” as output
			else if((s=="false")&&(day>0&&day<6)) {
				System.out.println("7:00");
			}
			//if its not a vacation and weekend, print “10:00” as output
			else if((s=="false")&&(day==0||day==6)) {
				System.out.println("10:00");
			}
		}
		else {
			System.out.println("Error");
		}
	}
		catch(Exception e){
			System.out.println("Error");
		}
	}

}


