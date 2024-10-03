package tallerherencia;
public class carroPropiedades extends carroFisico {
    
    String velocidad;
    String peso;
    boolean manual;
    
    carroPropiedades(String marca , String color , String tipoCarroceria , String categoria , String velocidad , String peso , boolean manual){
        super (marca , color , tipoCarroceria , categoria);
        this.velocidad = velocidad;
        this.peso = peso;
        this.manual = manual;
    }
    
}
