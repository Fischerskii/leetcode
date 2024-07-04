package org.example;

public class AppleFancyFormatter implements AppleFormater {
    @Override
    public String accept(Apple a) {
        String  characteristic = a.getWeight() > 150 ? "heavy" : "light";
        return "Apple " + characteristic + " because weight is " + a.getWeight() + " and its color is " + a.getColor();
    }
}
