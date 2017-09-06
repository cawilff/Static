
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * this is a program from:
 * http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/estatico/estatico1.htm
 * I am trying to understand the static concept.
 */
public class Circulo
{
    static final double PI=3.1416;// we use static variables when we need that all objects has the same value.
    double radio;
    
    public Circulo(double radio)
    {
        this.radio=radio; 
    }
    double calcularArea()
    {
        return(PI*radio*radio);
    }
}
