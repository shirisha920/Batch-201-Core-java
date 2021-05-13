public class AlaramClock1 {
	public static boolean alaramClock(int day,boolean dayName) {

		
		if((day>=0&&day<=6)&&(dayName==true||dayName==false)) {
			if((dayName==true)&&(day>0&&day<6)) {
				System.out.println("10:00");
			}
    		else if((dayName==true)&&(day==0||day==6)) {
				System.out.println("off");
			}
			else if((dayName==false)&&(day>0&&day<6)) {
				System.out.println("7:00");
			}
			else if((dayName==false)&&(day==0||day==6)) {
				System.out.println("10:00");
			}
		}
		else {
			System.out.println("Error");
		}
	
		return true;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(alaramClock(5,true));
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
