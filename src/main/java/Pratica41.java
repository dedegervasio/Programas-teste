
import java.rmi.activation.ActivationSystem;
import utfpr.ct.dainf.if62c.pratica.Elipse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a1614193
 */
public class Pratica41 {
    public static void main(String[] args) {
        Elipse teste = new Elipse(2, 5);
        System.out.println("Area: " + teste.getArea() + " Perimetro: " + teste.getPerimetro());
    }
    
}
