
package test;


public class PruebaEstudiante {
    private String nombre;
    private int genero;
    private double nota;
    
    public PruebaEstudiante(String nombre, int genero, double nota) {
        this.nombre = nombre;
        this.genero = genero;
        this.nota = nota;           
}
public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public int getGenero(){
    return genero;
}
public void setGenero(int genero) {
    this.genero = genero;
}
public double setNota(){
    return nota;
}
public void setNota(double nota){
    this.nota = nota;
}
@Override
public String toString(){
    return "nombre=" + nombre + ",genero=" + genero + ",nota=" + nota + ",";
 }  
}