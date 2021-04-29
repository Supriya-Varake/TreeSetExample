package com.treesetexample;

public class Customer implements Comparable{
	int cust_id;
	String cust_name;
	String cust_address;
	public Customer(int cust_id, String cust_name, String cust_address) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_address = cust_address;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_name=" + cust_name + ", cust_address=" + cust_address + "]";
	}
	public int compareTo(Object o) {
		int custid1=this.cust_id;
		Customer c=(Customer)o;
		int custid2=c.cust_id;
		if(custid1<custid2)
		{
			return -1;

		}
		else if(custid1>custid2)
		{
			return 1;

		}
		else return 0;
		
	}
	

}
