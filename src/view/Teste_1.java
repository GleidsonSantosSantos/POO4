package view;

import model.Paralelogramo;
import model.Trapezio;

public class Teste_1 {
    public static void main(String[] args) {
        Paralelogramo paralelogramo = new Paralelogramo(3, 5);
        System.out.println("Área Paralelogramo: " + paralelogramo.calcArea());
        System.out.println("Perímetro Paralelogramo: " + paralelogramo.calcPerimetro());

        Trapezio trapezio = new Trapezio(4, 5, 3);
        System.out.println("Área do Trapézio: " + trapezio.calcArea());
        System.out.println("Perímetro do Trapézio: " + trapezio.calcPerimetro());
    }
}
	


