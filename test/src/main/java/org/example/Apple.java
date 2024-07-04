package org.example;

public class Apple {
    int weight;
    Color color;
    String country;

    public Apple(int weight) {
        this.weight = weight;
    }

    public Apple(Color color) {
        this.color = color;
    }

    public Apple(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Apple(int weight, Color color, String country) {
        this.weight = weight;
        this.color = color;
        this.country = country;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
