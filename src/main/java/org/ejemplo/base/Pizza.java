package org.ejemplo.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList<>();

    public Size getSize() {
        return size;
    }

    private Size size;



    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public Pizza(String name, double price, Size size, Topping... toppings) {
        this.name = name;
        this.size = size;
        this.price = calculatePrice(price);
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        Topping removedTopping = this.toppings.remove(index);
    }

    public List<Topping> getToppings() {
        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Tamaño: " + size);
        System.out.println("Precio: Q "+price);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            // Put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The Pizza is ready!");
    }

    private double calculatePrice(double basePrice) {
        switch (size) {
            case MEDIUM:
                return basePrice * 1.20;
            case LARGE:
                return basePrice * 1.35;
            default:
                return basePrice; // Default to SMALL
            }

    }

}
