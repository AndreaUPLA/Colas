
package enunciado01;

public class Persona {
    private String codigo, nombre;
    double tarifa, sueldo;
    int horas;
    
public Persona(){
    
}
 public Persona(String cod, String nom,double tar, double sueldo, int h ){
     this.codigo=cod;
     this.nombre=nom;
     this.tarifa=tar;
     this.sueldo=sueldo;
     this.horas=h;
 }
 
 public String getCodigo(){
     return codigo;
 }
    public void setCodigo (String codigo){
     this.codigo= codigo;
 } 
 public String getNombre(){
     return nombre;
 }
    public void setNombre(String nombre){
     this.nombre = nombre;
 }
 public double getTarifa(){
     return tarifa;
 }
    public void setTarifa (double tarifa){
     this.tarifa =tarifa;
 }
 public int getHoras(){
     return horas;
 }
    public void setHoras(int horas){
     this.horas = horas;
    }
 public double obtenerSueldo() {
     double sueldo;
     sueldo=(tarifa*horas);
     return sueldo;
 }
    public void mostarSueldo(){
        System.out.println("El sueldo actual es: " +sueldo);
    }

public String Cadena(){
    return "Código: "+codigo
            +"\n"+" Nombre: "+nombre
            +"\n"+" Tarifa:"+tarifa
            +"\n"+" Horas:"+horas
            +"\n"+" Sueldo: "+sueldo;
}
}
