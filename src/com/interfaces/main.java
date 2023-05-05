package com.interfaces;

public class main {

    public static void main(String[] args) {
        //5:56

       /* CocheCRUD cocheCRUD= new CocheCRUDImpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

        System.out.println("Prueba v2");

        */

        for(int i=5; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=3; i>=-3; i--){
            for(int j= Math.abs(i); j<4; j++){
                System.out.print('#');
            }
            System.out.println();
        }

    }
}
