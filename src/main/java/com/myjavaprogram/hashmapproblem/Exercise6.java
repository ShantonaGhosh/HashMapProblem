
package com.myjavaprogram.hashmapproblem;

import java.util.HashMap;


public class Exercise6 {
      public static void main(String[] args){
        HashMap<Integer,String> dataList =new  HashMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
        HashMap<Integer,String> dataList1 =new  HashMap<Integer,String>(); 
        dataList1 = (HashMap<Integer,String>)dataList.clone();
        System.out.println(dataList1.size());
        
        
        } 
    
}
