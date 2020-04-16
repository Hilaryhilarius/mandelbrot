/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eonsahead.swing;

/**
 *
 * @author mshir
 */
public class Complex {
    private final double real;
    private final double imag;
    public static void main(String[] args) {
        Complex w = new Complex(1,2);
    }
    /**
     * complex creates a complex number object
     * @param real the real portion
     * @param imaginary the imaginary portion
     */
    public Complex(double real, double imaginary){
        this.real = real;
        this.imag = imaginary;
    }
    public Complex add(Complex m){
        double r = this.real + m.real;
        double i = this.imag + m.imag;
        return new Complex(r,i);
    }
    public Complex sub(Complex m){
        double r = this.real - m.real;
        double i = this.imag - m.imag;
        return new Complex(r,i);
    }
    public Complex mul(Complex m){
        double r = (this.real * m.real) - (this.imag * m.imag);
        double i = (this.real * m.imag) + (this.imag * m.real);
        return new Complex(r,i);
    }
    public Complex con(){
        double r = this.real;
        double i = -this.imag;
        return new Complex(r,i);
    }
    public Complex div(Complex m){
        Complex c = m.con();
        Complex n = this.mul(c);
        Complex d = m.mul(c);
        double n1 = n.real / d.real;
        double n2 = n.imag / d.real;
        return new Complex(n1,n2);
    }
    public Complex sqr(){
        double r = (this.real * this.real) - (this.imag * this.imag);
        double i = (this.real * this.imag) + (this.imag * this.real);
        return new Complex(r,i);
    }
    public double mag(){
        double r = this.real * this.real;
        double i = this.imag * this.imag;
        return r + i;
    }
    /**
     * ma1 squares a complex number and adds it to itself
     * @return Complex
     */
    public Complex ma1(){
        Complex c = this.sqr();
        c = this.add(c);
        return c;
    }
    
    public static boolean man(Complex c){
        Complex z = c;
        for (int n = 0; n < 50; n++){
            z = z.ma1();
        }
        boolean y = z.real < 50;
        return y;
    }
            

}
