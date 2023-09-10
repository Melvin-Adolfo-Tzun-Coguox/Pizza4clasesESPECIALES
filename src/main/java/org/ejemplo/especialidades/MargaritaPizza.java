package org.ejemplo.especialidades;

import org.ejemplo.base.Pizza;
import org.ejemplo.base.Topping;

public class MargaritaPizza extends Pizza {


        public MargaritaPizza(Pizza.Size size) {
            super("Margarita Pizza", 50.0, size, new Topping("Salsa de tomate"), new Topping("Mozzarella"));
        }

        @Override
        public void prepare() {
            super.prepare();
            System.out.println("Agregar hojas de albahaca fresca en la parte superior.");
        }

        public void bake() {
            System.out.println("Hornear a 220°C durante 12 minutos.");
        }
        public void cut() {
            System.out.println("Cortar Pizza Margarita en rodajas.");
        }

}
