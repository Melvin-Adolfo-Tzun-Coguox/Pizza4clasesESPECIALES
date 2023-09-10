package org.ejemplo;

import org.ejemplo.base.Pizza;
import org.ejemplo.base.Topping;
import org.ejemplo.especialidades.BBQChickenPizza;
import org.ejemplo.especialidades.MargaritaPizza;
import org.ejemplo.especialidades.PepperoniPizza;
import org.ejemplo.especialidades.VegetarianPizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizzabase = new Pizza("Italiana",50, Pizza.Size.MEDIUM);
        pizzabase.addTopping(new Topping("Champiñones"));
        // Preparar la pizza
        pizzabase.prepare();
        System.out.println("");

        PepperoniPizza pepperoniPizza = new PepperoniPizza(Pizza.Size.LARGE);
        pepperoniPizza.addTopping(new Topping("Queso"));
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        System.out.println("");

        MargaritaPizza margaritaSmall = new MargaritaPizza(Pizza.Size.SMALL);
        margaritaSmall.prepare();
        margaritaSmall.bake();
        margaritaSmall.cut();
        System.out.println("");

        BBQChickenPizza pizzapollo=new BBQChickenPizza(Pizza.Size.MEDIUM);
        pizzapollo.prepare();
        pizzapollo.bake();
        pizzapollo.cut();
        System.out.println("");

        VegetarianPizza pizzavegetariana = new VegetarianPizza(Pizza.Size.LARGE);
        pizzavegetariana.prepare();
        pizzavegetariana.bake();
        pizzavegetariana.cut();
        System.out.println("");
    }
}