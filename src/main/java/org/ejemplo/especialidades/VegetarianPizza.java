package org.ejemplo.especialidades;

import org.ejemplo.base.Pizza;
import org.ejemplo.base.Topping;

public class VegetarianPizza extends Pizza {

        public VegetarianPizza(Size size) {
            super("Pizza vegetariana", 60, size, new Topping("Pimientos"), new Topping("Aceitunas"), new Topping("Champiñones"));
        }

        @Override
        public void prepare() {
            super.prepare();
            System.out.println("Añadir un chorrito de aceite de oliva.");
        }

        public void bake() {
            System.out.println("Hornear a 210°C durante 13 minutos.");
        }
        public void cut() {
        System.out.println("Cortar pizza vegetariana en rodajas.");
        }

}
