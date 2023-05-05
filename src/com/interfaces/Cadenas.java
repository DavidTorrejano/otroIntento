package com.interfaces;

import java.util.Vector;

public class Cadenas {

    public static void main(String[] args) {

        Vector <Integer> num= new Vector<>();

        num.add(3);
        num.add(2);
        num.add(1);
        num.add(0);
        num.add(-1);

        for(int i: num){
            System.out.println(i);
        }

        System.out.println("______________________");

        for(int i=0; i<num.size(); i++){
            System.out.println(num.get(i));
        }

        System.out.println("______________________");

        for(int i=num.size()-1; i>=0; i--){
            System.out.println(num.get(i));
        }




    }

}
