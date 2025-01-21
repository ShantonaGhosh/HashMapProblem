
package com.myjavaprogram.hashmapproblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Exercise11 {
       public static void main(String[] args){
        HashMap<Integer,String> dataList =new  HashMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
        
        Set set=   dataList.keySet();
        System.out.println(set);
       
    
     }
}
