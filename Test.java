package com.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

    public static  void main(String []arg){
        Test t = new Test();
        System.out.println(Objects.nonNull(t));
        Collection collection = new ArrayList();
        collection.add("MAHENDRA");
        System.out.println(collection);
        //collection.clear();
        (collection).add(23443);
        System.out.println(((ArrayList) collection).indexOf("MAHENDRA"));
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(123123);
        copyOnWriteArrayList.add(123124);
        copyOnWriteArrayList.add(123125);
        copyOnWriteArrayList.add(123126);
        System.out.print(copyOnWriteArrayList);
    }
}
