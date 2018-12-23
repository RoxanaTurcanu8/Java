/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.reflect.Array;
import java.util.*;

/**
 *
 * @author Roxy
 */
public abstract class Manager<T> {

    public ArrayList<T> lista;

    public Manager() {
    }

    public Manager(ArrayList<T> list) {
        lista = list;
    }

    public void AfiseazaTot() {
        for (T t : lista) {
            System.out.println(t);
        }
    }
}
