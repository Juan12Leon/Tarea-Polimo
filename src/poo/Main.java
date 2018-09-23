/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author USUARIO
 */
public class Main {
 

 public static void main(String[] args) {
  FiguraGeometrica figura;
  figura = new Circulo(5);
  System.out.println(figura.getClass());
  System.out.println("Area: "+figura.getArea());
  System.out.println("Perimetro: "+figura.getPerimetro()+("\n")) ;
  figura = new Rectangulo(5,2);
  System.out.println(figura.getClass());
  System.out.println("Area: "+figura.getArea());
  System.out.println("Perimetro: "+figura.getPerimetro()+("\n"));
  figura = new Triangulo(5,2);
  System.out.println(figura.getClass());
  System.out.println("Area: "+figura.getArea());
  System.out.println("Perimetro: "+figura.getPerimetro());
 }
}   

