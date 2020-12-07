package oca.chapter2;

public class SwitchStatements {
	final static int CONSTANT = 7;
	static int variable = 7;

	public static void main(String[] args) {
		skipingBreakStatementInDefault();
		System.out.println("");
		skipingBreakStatementInCase1();
		System.out.println("");
		skipingBreakStatementInCase2();
		System.out.println("");
		skipingBreakStatementInCase3();
		
		System.out.println("");
		skipingBreakStatementInCase4();
	}

	public static void orderOfDefautlDoesNotMatter() {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}

	public static void compileTimeConstentsInSwitch() {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
			break;
		case CONSTANT: // if variable is used than it would be a compile time error.
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}
	public static void compileTimeConstentsInSwitchMixTypes() {
		int dayOfWeek = 5;
		final short s = 0;
		final byte b = 6;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
			break;
		case s: // if variable is used than it would be a compile time error.
			System.out.println("Sunday");
			break;
		case b:
			System.out.println("Saturday");
			break;
		}
	}

	public static void skipingBreakStatementInDefault() {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}

	public static void skipingBreakStatementInCase1() {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 5:
			System.out.println("Sunday1");
		case 6:
			System.out.println("Saturday");
		default:
			System.out.println("Weekday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		}

	}

	public static void skipingBreakStatementInCase2() {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
			break;
		case 5:
			System.out.println("Sunday");
		case 6:
			System.out.println("Saturday");
		case 7:
			System.out.println("Saturday1");
			break;
		}
	}
	
	public static void skipingBreakStatementInCase3() {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday3");
			break;
		case 5:
			System.out.println("Sunday3");
		case 6:
			System.out.println("Saturday3");
		case 7:
			System.out.println("Saturday3");
		}
	}
	
	public static void skipingBreakStatementInCase4() {
		int dayOfWeek = 9;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday4");
		case 5:
			System.out.println("Sunday4");
		case 6:
			System.out.println("Saturday4");
		case 7:
			System.out.println("Saturday4");
		}
	}
	

	private int getSortOrder(String firstName, final String lastName) {
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch (firstName) {
		case "Test":
			return 52;
		case middleName: // DOES NOT COMPILE
			id = 5;
			break;
		case suffix:
			id = 0;
			break;
		case lastName: // DOES NOT COMPILE
			id = 8;
			break;
		case 5: // DOES NOT COMPILE
			id = 7;
			break;
		case 'J': // DOES NOT COMPILE
			id = 10;
			break;
		case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
			id = 15;
			break;
		}
		return id;
	}
	
	private int getSortOrder1(String firstName, int num) {
		final String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		
		final String lastName;
		if(num > 10) {
			lastName = "Mr";
		}else {
			lastName = "Mrs";
		}
		switch (firstName) {
		case "Test":
			return 52;
		case middleName: // DOES NOT COMPILE
			id = 5;
			break;
		case suffix:
			id = 0;
			break;
		case lastName: // DOES NOT COMPILE
			id = 8;
			break;
		
		}
		return id;
	}

}
