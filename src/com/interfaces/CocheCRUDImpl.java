package com.interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    String save= "Guardando";
    String findAll= "Buscar todo";
    String delete= "Borrando";

    @Override
    public void save() {
        System.out.println(save);
    }

    @Override
    public void findAll() {
        System.out.println(findAll);
    }

    @Override
    public void delete() {
        System.out.println(delete);
    }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}
