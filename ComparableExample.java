package com.treesetexample;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
      Customer c1=new Customer(5,"Rubina","Himachal Pradesh");
      Customer c2=new Customer(2,"Jasmin","Punjab ");		  
      Customer c3=new Customer(1,"Nikki","Karnataka ");	  
      Customer c4=new Customer(3,"Abhinav"," Delhi");
      Customer c5=new Customer(4,"Siddharth","Mumbai ");
    		  
    		  TreeSet t=new TreeSet();
    		  t.add(c1);
    		  t.add(c2);
    		  t.add(c3);
    		  t.add(c4);
    		  t.add(c5);
    		  System.out.println(t);
	}

}
