package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(30, Color.GREEN));
        apples.add(new Apple(30, Color.RED));
        apples.add(new Apple(180, Color.GREEN));
        apples.add(new Apple(150, Color.RED));
        apples.add(new Apple(170, Color.GREEN));
        apples.add(new Apple(70, Color.GREEN));


        System.out.println("some weight");
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}
