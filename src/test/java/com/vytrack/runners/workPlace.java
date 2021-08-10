package com.vytrack.runners;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class workPlace {

    public static void main(String[] args) {

        Random ran = new Random();
        System.out.println("ran.nextInt(4) = " + ran.nextInt(4));

        Float F = 10.0f;
        System.out.println(F.toString().length());

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        //arrayList.add(2);
        //arrayList = Arrays.asList(10,15,20,30);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(30);
        //arrayList.add(30);
        System.out.println(arrayList);
        System.out.println(duplicates(arrayList));


    }
    //this method defines if an ArrayList contains duplicates element or not
    //true --> there is a duplicated element
    //false --> there is not a duplicated element
    public static boolean duplicates(ArrayList<Integer> arrayList){
        for (int i=0;i<arrayList.size();i++){
            for (int j=0;j<arrayList.size() && i!=j;j++){
                if(arrayList.get(i).equals(arrayList.get(j))){
                    return true;
                }
            }
        }
        return false;
    }

}
