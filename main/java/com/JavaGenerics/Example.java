package com.JavaGenerics;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      With Java Generics :

      ArrayList<Integer> myArrayList = new ArrayList();
      myArrayList.add(10);  //Integer value
      myArrayList.add(20);
      myArrayList.add(30);
      myArrayList.add(40);
      myArrayList.add(20); 
      System.out.println(myArrayList);
      int x = myArrayList.get(0);
      System.out.println(x);
      
      


  
	}

}
