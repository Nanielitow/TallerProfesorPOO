package tallerherencia;
public class carroCompleto extends carroPropiedades{
    
    String nombre;
    String apellido;
    int cedula;
    
    carroCompleto(String marca , String color , String tipoCarroceria , String categoria , String velocidad , String peso , boolean manual , String nombre , String apellido , int cedula){
        super (marca , color , tipoCarroceria , categoria , velocidad , peso , manual);
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }
    
}
