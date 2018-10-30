package com.collections;

import java.util.*;

public class ArrayListTest {
    public static void main(String arg[]){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(11);
        list.add(9);
        list.add(1321);
        list.add(133);
        list.add(1312);
        Collections.sort(list);
        //list.add(3,234342);
        //Integer i[]=list.toArray();
        //System.arraycopy(list.toArray(),3,list.toArray(),3+1,2);
        list.remove(2);
        System.out.println(list);
        Vector v = new Vector();
        LinkedList linkedList = new LinkedList();

    }
}
