
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    double nota;
    static double notaCorte=6.0;
    
    public Alumno(double nota){
    this.nota=nota;
    }
    
    boolean estaAdmitido(){
    return (nota>=notaCorte);
    }
    
}
