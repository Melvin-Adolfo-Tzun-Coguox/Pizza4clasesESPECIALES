package org.ejemplo.especialidades;

import org.ejemplo.base.Pizza;
import org.ejemplo.base.Topping;

public class PepperoniPizza extends Pizza {

        public PepperoniPizza(Size size) {
            super("Pepperoni Pizza", 50.0, size, new Topping("Rodajas de Pepperoni"));
        }

        @Override
        public void prepare() {
            super.prepare();
            System.out.println("Espolvorear queso parmesano extra.");
        }

        public void bake() {
            System.out.println("Hornear a 230°C durante 14 minutos.");
        }
         public void cut() {
        System.out.println("Cortar la pizza de pepperoni en rodajas.");
        }
}
