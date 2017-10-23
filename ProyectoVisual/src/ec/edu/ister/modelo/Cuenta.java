package ec.edu.ister.modelo;

/**
 * @Estructura de datos
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Cuenta {
    private String id;
    private Double saldo;

    public Cuenta(String id) {
        this.id=id;
    }
    public void depositar(double monto){
        saldo += monto;
    }
    
    public Double getSaldo(){
        return saldo;
    }
    

}
