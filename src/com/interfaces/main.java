package com.interfaces;

public class main {

    public static void main(String[] args) {
        CocheCRUD cocheCRUD= new CocheCRUDImpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}
