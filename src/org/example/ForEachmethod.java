package org.example;

import java.util.Arrays;
import java.util.List;

public class ForEachmethod {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(4,5,6,7,8);
        nums.forEach(n-> System.out.println(n));
//
//        Consumer<Integer> cons = new Consumer<Integer>(){
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        nums.forEach(cons);`


//        Consumer<Integer> cons = (integer)-> System.out.println(integer);
//        nums.forEach(cons);

//        nums.forEach((integer -> System.out.println(integer)));

//        nums.forEach(n-> System.out.println(n));
    }
}
