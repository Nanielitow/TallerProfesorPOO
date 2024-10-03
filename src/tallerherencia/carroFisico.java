package tallerherencia;
public class carroFisico extends carro {
    
    String color;
    String tipoCarroceria;
    String categoria;
    
    carroFisico(String marca , String color , String tipoCarroceria , String categoria){
        super (marca);
        this.color = color;
        this.tipoCarroceria = tipoCarroceria;
        this.categoria = categoria;
    }
}

