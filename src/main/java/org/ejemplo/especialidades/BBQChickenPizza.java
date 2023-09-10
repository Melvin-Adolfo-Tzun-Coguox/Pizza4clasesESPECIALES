package org.ejemplo.especialidades;

import org.ejemplo.base.Pizza;
import org.ejemplo.base.Topping;

public class BBQChickenPizza extends Pizza {

        public BBQChickenPizza(Size size) {
            super("BBQ Chicken Pizza", 60.0, size, new Topping("Pollo a la parrilla"), new Topping("Salsa BBQ"));
        }

        @Override
        public void prepare() {
            super.prepare();
            System.out.println("Rocíe salsa BBQ extra en la parte superior.");
        }

        public void bake() {
            System.out.println("Hornear a 240°C durante 15 minutos.");
        }
         public void cut() {
             System.out.println("Cortar la pizza de pollo a la barbacoa en rodajas.");
        }

}
