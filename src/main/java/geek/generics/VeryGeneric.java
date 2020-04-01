package geek.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VeryGeneric {
    @SafeVarargs
    public static <T> List<T> toList(T... arr) {
        List<T> list = Arrays.asList(arr);
        return Arrays.asList(arr);
    }
    public void test(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        List<? super Integer> nums=list;
    }
}
