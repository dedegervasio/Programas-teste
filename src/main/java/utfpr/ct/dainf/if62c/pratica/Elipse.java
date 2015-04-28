/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.lang.Math;

/**
 *
 * @author a1614193
 */
public class Elipse {

    protected double semiEixoX;
    protected double semiEixoY;

    public Elipse(double semiEixoX, double semiEixoY) //Construtor
    {
        this.semiEixoX = semiEixoX;                               // Recebemos os semi-eixos e multiplicamos por 2 para estabelecer os eixos
        this.semiEixoY = semiEixoY;
    }

    public double getArea() {
        return (Math.PI * semiEixoX * semiEixoY);
    }

    public double getPerimetro() {
        return Math.PI * (3 * (semiEixoX + semiEixoY) - Math.sqrt((3 * semiEixoX + semiEixoY) * (semiEixoX + semiEixoY * 3)));
    }
}
