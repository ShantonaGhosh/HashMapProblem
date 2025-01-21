
package com.myjavaprogram.hashmapproblem;

import java.util.HashMap;
import java.util.Map;


public class Exercise10 {
       public static void main(String[] args){
        HashMap<Integer,String> dataList =new  HashMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
        dataList.get("roll");
       String s= dataList.get(2);
        System.out.println( s);
            
       
    
     }
    
}
