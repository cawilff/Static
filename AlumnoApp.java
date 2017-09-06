
/**
 * Write a description of class AlumnoApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlumnoApp
{
    public static void main(String[]args)
    {
    Alumno[]alumnos={new Alumno(5.5), new Alumno(6.3), new Alumno(7.2), new Alumno(7.0)};
    //alumnos admitidos
    int numAdmitidos=0;
    for (int i=0;i<alumnos.length;i++){
    if(alumnos[i].estaAdmitido()){
    numAdmitidos++;}
    }
    System.out.println("admitidos: "+numAdmitidos);
    //cambiar la nota de corte;
    alumnos[1].notaCorte=7.0;
    for(int i=0;i<alumnos.length;i++){
        System.out.println("nota de corte "+alumnos[i].notaCorte);
    }
    Alumno.notaCorte=6.5;
    for(int i=0;i<alumnos.length;i++){
    System.out.println("nota de corte "+alumnos[i].notaCorte);
    
    }try{//Espera la pulsación de una tecla y luego RETORNO.
        System.in.read();
        
    
    }catch(Exception e){}

}
}

