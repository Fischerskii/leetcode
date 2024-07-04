package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(30, Color.GREEN, "Russia"));
        apples.add(new Apple(30, Color.RED, "Israel"));
        apples.add(new Apple(180, Color.GREEN, "Romania"));
        apples.add(new Apple(150, Color.RED, "Moldova"));
        apples.add(new Apple(170, Color.GREEN, "Poland"));
        apples.add(new Apple(70, Color.GREEN, "Uzbekistan"));

//        List<Apple> filteredApples = filterApples(apples, new AppleGreenColorPredicate());

        List<Dish> menu = Arrays.asList(new Dish("Pasta", 400),
                new Dish("Salad", 100),
                new Dish("Bread", 150));
//        List<String> highCaloricDishes = new ArrayList<>();
//        Iterator<Dish> iterator = menu.iterator();
//        while (iterator.hasNext()) {
//            Dish dish = iterator.next();
//            if (dish.getCalories() > 300) {
//                highCaloricDishes.add(dish.getName());
//            }
//        }

        List<Apple> applesWithColorGreen = apples.stream()
                .sorted(comparing(Apple::getWeight))
                            .filter((Apple a) -> a.color.equals(Color.GREEN))
                            .limit(2)
                            .toList();


        List<String> highCaloricDishes = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(5)
                .toList();

        System.out.println("High Caloric: " + highCaloricDishes.get(0));
    }

    public static List<Apple> filterApples(List<Apple> apples, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormater formater) {
        for (Apple apple : inventory) {
            String output = String.valueOf(formater.accept(apple));
            System.out.println(output);
        }
    }
}
