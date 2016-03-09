package org.lorrev.demo.mapreduce;

import com.google.common.base.Optional;

public class GuavaTester {
    public static void test(){
        GuavaTester guavaTester = new GuavaTester();

        Integer invalidInput = 5;

        Optional<Integer> a =  Optional.of(invalidInput);
        Optional<Integer> b =  Optional.of(new Integer(10));

        System.out.println(guavaTester.sum(a,b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){
        return a.get() + b.get();
    }
}