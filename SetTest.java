package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public  static void main(String []arg){
        Set<Integer> set = new HashSet();
        set.add(64);
        set.add(34);
        set.add(4);
        set.add(5444);
        set.add(1);
        System.out.println(set);
    }
}
