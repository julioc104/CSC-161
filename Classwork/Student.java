public class Student {
	private String fname;
	private String lname;
	private int sID;
	private String email;

	// Accessors

	public String getLname() {
		return lname;
	}
	public String getFname() {
		return fname;
	}
	public int getSid() {
		return sID;
	}
	public String getEmail() {
		return email;
	}
	public String getFullName() {
		return fname + " " + lname;
	}
	public String getLastNameFirst() {
		return lname + " " + fname;
	}

	// mutators

	public void setFname(String fn) {
		fname = fn;
	}
	public void setLname(String ln) {
		lname = ln;
	}
	public void setSid(int id) {
		sID = id;
	}
	public void setEmail(String em) {
		email = em;
	} 
}	// End of class