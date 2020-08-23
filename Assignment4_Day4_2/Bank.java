package Assignment4_Day4_2;

public class Bank {
	private String bankName;
	private String bankIFSCcode;

	public String getBankIFSCcode() {
		System.out.println("Function to get the IFSC CODE of the Bank");
		return bankIFSCcode;
	}

	public String getBankName() {
		System.out.println("Function to get the name of the bank");
		return bankName;
	}
	
	
	public void setBankIFSCcode(String bankIFSCcode) {
		System.out.println("Function to set the IFSC CODE of the Bank");
		this.bankIFSCcode = bankIFSCcode;
	}
	
	public void setBankName(String bankName) {
		System.out.println("Function to set the name of the bank");
		this.bankName = bankName;
	}
	
	

}
