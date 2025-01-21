package com.myjavaprogram.hashmapproblem;

import java.util.HashMap;

public class Exercise7 {

    public static void main(String[] args) {
        HashMap<Integer, String> dataList = new HashMap<Integer, String>();
        dataList.put(1, "name");
        dataList.put(2, "roll");
        dataList.put(3, "id");

        if (dataList.containsKey(1)) {

            System.out.println("exists");
        } else {
            System.out.println("not exists");
        }
    }

}
