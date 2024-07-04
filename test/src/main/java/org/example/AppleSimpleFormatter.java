package org.example;

public class AppleSimpleFormatter implements AppleFormater {
    @Override
    public String accept(Apple a) {
        return "Apple weight is  " + a.getWeight();
    }
}
