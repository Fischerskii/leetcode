package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);

        Consumer<Integer> integerConsumer = (Integer i) -> System.out.printf("This number is: " + i + "\n");
        consumerExample(list, integerConsumer);
    }

    public static <T> void consumerExample(List<T> list, Consumer<T> c) {
        for(T t: list) {
            c.accept(t);
        }
    }
}
