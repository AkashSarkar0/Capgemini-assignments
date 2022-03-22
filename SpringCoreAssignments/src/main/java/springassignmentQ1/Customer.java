package springassignmentQ1;

public class Customer {
	public int customerId;
	public String customerName;
	public int customerContact;
	Address customerAddress;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public void getinfo() {
		System.out.println("Customer Id: "+getCustomerId());
		System.out.println("Customer Name: "+getCustomerName());
		System.out.println("Customer Contact: "+getCustomerContact());
		System.out.println("Customer Address: "+getCustomerAddress());
		
	}
}






