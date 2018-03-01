package appcode;

public class LeapYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bMonth = 6;
		int year = 1960;
	
		if (bMonth > 12) {

			System.out.print("Invalid month " + bMonth);
		}

		switch (bMonth * 1) {

		case 1:
			System.out.println("January " + year + " has 31 days.");
			break;
		case 2:
			if (isLeapYear(year)) {
				System.out.println("February " + year + " has 29 days. LEAP YEAR");
			} else {
				System.out.println("February " + year + " has 28 days.");
			}
			break;
		case 3:
			System.out.println("March " + year + " has 31 days.");
			break;
		case 4:
			System.out.println("April " + year + " has 30 days.");
			break;
		case 5:
			System.out.println("May " + year + " has 31 days.");
			break;
		case 6:
			System.out.println("June " + year + " has 30 days.");
			break;
		case 7:
			System.out.println("July " + year + " has 31 days.");
			break;
		case 8:
			System.out.println("August " + year + " has 31 days.");
			break;
		case 9:
			System.out.println("September " + year + " has 30 days.");
			break;
		case 10:
			System.out.println("October " + year + " has 31 days.");
			break;
		case 11:
			System.out.println("November " + year + " has 30 days.");
			break;
		case 12:
			System.out.println("December " + year + " has 31 days.");
		}


	}

	public static boolean isLeapYear(int year) {

	    if (year % 4 != 0) {
	        return false;
	    } else if (year % 400 == 0) {
	        return true;
	    } else if (year % 100 == 0) {
	        return false;
	    } else {
	        return true;
	    }
	}

}
