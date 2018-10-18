
public class Customer {
	private String fName;
	private String lName;
	private String number;
	private int wait;
	
	public Customer(String fName, String lName, String number) {
		this.fName = fName;
		this.lName = lName;
		this.number = number;
		
	}
	
	
	public void setWait(int wait) {
		this.wait = wait;
	}

	public String toString() {
		return "Name: " + fName + " " + lName +"\n" +
				"Phone Number: " + number + "\n" +
				"Estimated Wait Time: " + wait + " minutes" + "\n";
	}
	
	
	
	
	
}
