package TeamProjectByTerminal;

public class Student {

	private static final String mailForm = "@knu.ac.kr";
	private String ID = "";
	private String name = "";
	private String phoneNumber = "";
	private String webMailAddress = "";
	private int cabinetID = 0;
	private Boolean isCouncil = false;

	public Student() {

		ID = "";
		name = "";
		phoneNumber = "";
		webMailAddress = "";
		cabinetID = 0;
		isCouncil = false;
	}

	public Student(String newID, String newname, String newphone, String newmail, int newcabID, boolean newCouncil) {

		if (isValidData(newID, newname, newphone, newcabID)) {

			ID = newID;
			name = newname;
			phoneNumber = newphone.substring(0, 3) + "-" + newphone.substring(3, 7) + "-" + newphone.substring(7);
			webMailAddress = newmail + mailForm;
			cabinetID = newcabID;
			isCouncil = newCouncil;

		} else
			errorhandler("invalid initialization");
	}

	private boolean isValidData(String newID, String newname, String newphone, int newcabID) {

		return ((newID.length() == 10) && (newname.length() >= 2) && (newname.length() < 20)
				&& (newphone.length() == 11) && (newcabID > 0));
	}

	public String getID() {

		return ID;
	}

	public String getName() {

		return name;
	}

	public String getPhoneNumber() {

		return phoneNumber;
	}

	public String getWebMailAddress() {

		return webMailAddress;
	}

	public int getCabID() {

		return cabinetID;
	}

	public boolean getCouncil() {

		return isCouncil;
	}

	public String toString() {

		return "" + ID + "\t" + name + "\t" + phoneNumber + "\t" + webMailAddress + "\t" + cabinetID + "\tcouncil: "
				+ isCouncil;
	}

	private void errorhandler(String errorType) {

		System.err.println("Error occured in Student class: " + errorType);
	}

}