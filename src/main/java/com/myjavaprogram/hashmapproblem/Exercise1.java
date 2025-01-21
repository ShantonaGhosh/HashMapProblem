
package com.myjavaprogram.hashmapproblem;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args){
        HashMap<Integer,String> dataList =new  HashMap<Integer,String>(); 
        dataList.put(1,"name");
        dataList.put(2,"roll");
        dataList.put(3,"id");
        
        for(Map.Entry<Integer,String> x: dataList.entrySet())
        {
           System.out.println( " key : "+x.getKey() + " value : " + x.getValue());
        }       
        
    }
    
}
