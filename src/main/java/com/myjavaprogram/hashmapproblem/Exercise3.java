
package com.myjavaprogram.hashmapproblem;

import java.util.HashMap;
import java.util.Map;


public class Exercise3 {
      public static void main(String[] args){
        HashMap<Integer,String> dataList =new  HashMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
         dataList.put(4,"red");
        HashMap<Integer,String> dataList1 =new  HashMap<Integer,String>() ;
        dataList1.put(1,"red");
        dataList1.put(2,"green");
        dataList1.put(3,"black");
        
        dataList1.putAll(dataList);
     
            System.out.println( dataList.size());
        } 
    
}
