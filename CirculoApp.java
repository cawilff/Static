
/**
 * Write a description of class CirculoApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * this code was copied from this page:
 * http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/estatico/codigo/circulo/CirculoApp.java
 * because I am studying the static concept.
 */
public class CirculoApp
{
public static void main(String[]args){
    Circulo circulo=new Circulo(2.3);
    System.out.println("area : "+circulo.calcularArea());
    try{//Espera la pusación de una tecla y luego  RETORNO.
        System.in.read();
    }catch(Exception e){
    }
}
 }
