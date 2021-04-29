package com.treesetexample;

import java.util.Comparator;
import java.util.TreeSet;

class SortByCustID implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Customer i1 = (Customer) o1;
		Customer i2 = (Customer) o2;
		return i2.compareTo(i1);

	}

}

class SortByCustName implements Comparator {

	public int compare(Object o1, Object o2) {
		Customer custName1 = (Customer) o1;
		Customer custName2 = (Customer) o2;
		String s1 = custName1.cust_name;
		String s2 = custName2.cust_name;
		return s2.compareTo(s1);
	}

}

class SortByCustAddress implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Customer custadd1 = (Customer) o1;
		Customer custadd2 = (Customer) o2;
		String s1 = custadd1.cust_address;
		String s2 = custadd1.cust_address;
		return -s1.compareTo(s2);
	}

}

public class ComparatorExample {

	public static void main(String[] args) {
		Customer c1 = new Customer(5, "Rubina", "Himachal Pradesh");
		Customer c2 = new Customer(2, "Jasmin", "Punjab ");
		Customer c3 = new Customer(1, "Nikki", "Karnataka ");
		Customer c4 = new Customer(3, "Abhinav", "Delhi");
		Customer c5 = new Customer(4, "Siddharth", "Mumbai ");

		TreeSet t = new TreeSet(new SortByCustID());
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		t.add(c5);
		System.out.println("\n Sorted By ID :" + t);
		TreeSet t1 = new TreeSet(new SortByCustName());
		t1.add(c1);
		t1.add(c2);
		t1.add(c3);
		t1.add(c4);
		t1.add(c5);
		System.out.println("\n Sorted By Name :" + t1);
		TreeSet t2 = new TreeSet(new SortByCustAddress());
		t2.add(c1);
		t2.add(c2);
		t2.add(c3);
		t2.add(c4);
		t2.add(c5);
		System.out.println("\n Sorted By Address :" + t2);

	}

}
