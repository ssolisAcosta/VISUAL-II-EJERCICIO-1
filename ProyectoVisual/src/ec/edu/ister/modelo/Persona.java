package ec.edu.ister.modelo;

/**
 * @Estructura de datos
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Persona {
    private String nombre;
    private String primerApellido;
    public double cantidad;

    public Persona() {
    }

    public void setNombre(String nom){
        nombre=nom;
    }
    public String getNombre(){
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    
    public double obtenerCantidad(){
        return cantidad;
    }
    
}
