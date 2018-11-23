package oca.chapter2;

public class SwitchStatements {
	final static int CONSTANT = 7;
	static int variable = 7;

	public static void main(String[] args) {
		skipingBreakStatementInCase1();
		skipingBreakStatementInCase1();
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
			System.out.println("Saturday");
			break;
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

}
