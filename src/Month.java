/**
 * 
 * @author Nathan Fritz - 113294199
 * @author Alex Kloppenburg - 113388722
 * @author Joe Pauly - 112909034
 * @author Cavan Gary - 113388151
 */
public enum Month {
	
	/**
	 * 
	 */
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	
	/**
	 * @author Cavan Gary
	 */
	@Override
	public String toString() {
		switch(this){
		case JANUARY:
			return "January";
		case FEBRUARY:
			return "February";
		case MARCH:
			return "March";
		case APRIL:
			return "April";
		case MAY:
			return "May";
		case JUNE:
			return "June";
		case JULY:
			return "July";
		case AUGUST:
			return "August";
		case SEPTEMBER:
			return "September";
		case OCTOBER:
			return "October";
		case NOVEMBER:
			return "November";
		case DECEMBER:
			return "December";
		default:
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * @author Cavan Gary
	 * @return
	 */
	public int toInt(){
			
			switch(this){
			case JANUARY:
				return 1;
			case FEBRUARY:
				return 2;
			case MARCH:
				return 3;
			case APRIL:
				return 4;
			case MAY:
				return 5;
			case JUNE:
				return 6;
			case JULY:
				return 7;
			case AUGUST:
				return 8;
			case SEPTEMBER:
				return 9;
			case OCTOBER:
				return 10;
			case NOVEMBER:
				return 11;
			case DECEMBER:
				return 12;
			default:
				throw new IllegalArgumentException();
			
		}
			
	}
	
	
	/**
	 * @author Alex Kloppenburg
	 * @param num
	 * @return
	 */
	public static Month fromInt(int num){
		switch(num){
		case 1:
			return JANUARY;
		case 2:
			return FEBRUARY;
		case 3:
			return MARCH;
		case 4:
			return APRIL;
		case 5:
			return MAY;
		case 6:
			return JUNE;
		case 7:
			return JULY;
		case 8:
			return AUGUST;
		case 9:
			return SEPTEMBER;
		case 10:
			return OCTOBER;
		case 11:
			return NOVEMBER;
		case 12:
			return DECEMBER;
		default:
			throw new IllegalArgumentException();
		}
	}
	
			
}


