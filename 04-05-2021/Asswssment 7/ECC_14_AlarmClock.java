public class ECC_14_AlarmClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int day_of_week = 3;
	        boolean onVac = true;
	        System.out.println(ringAlarm(day_of_week, onVac));
	    }

	    public static String ringAlarm(int dayOfWeek, boolean onVac) {
	    	if(dayOfWeek < 0 && dayOfWeek > 6) {
	    		return "Invalid Inputs";
	    	}
	    	else if(onVac != true || false) {
	    		return "Invalid Inputs";
	    	}
	    	else if(dayOfWeek <= 6 && onVac == true) {
	    		return "10:00";
	    	}
	    	else if(dayOfWeek <= 6 && onVac == false) {
	    		return "07:00";
	    	}
	    	else if(dayOfWeek == 6 || dayOfWeek == 0 && onVac == true) {
	    		return "OFF";
	    	}
	    	else if(dayOfWeek == 6 || dayOfWeek == 0 && onVac == false) {
	    		return "10:00";
	    	}
			return null;
			

	}

}
