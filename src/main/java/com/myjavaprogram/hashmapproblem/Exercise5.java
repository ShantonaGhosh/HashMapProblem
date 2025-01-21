
package com.myjavaprogram.hashmapproblem;

import java.util.HashMap;


public class Exercise5 {
      public static void main(String[] args){
        HashMap<Integer,String> dataList =new  HashMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
       
        if (dataList.isEmpty()) {

            System.out.println("isEmpty");
        } else {
            System.out.println("not isEmpty");
        }
        
            
        } 
    
}
