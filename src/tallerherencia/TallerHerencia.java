package tallerherencia;
public class TallerHerencia {
    public static void main(String[] args) {
        
        carroCompleto carroCompleto1 = new carroCompleto("audi" , "rojo" , "robusta" , "camioneta" , "230kmh" , "200kg" , false , "Daniel" , "gonzalez" , 1014478150);
        System.out.println("Info del vehiculo completa y dueno respectivo: ");
        System.out.println("marca del carro: " + carroCompleto1.marca);
        System.out.println("color del carro: " + carroCompleto1.color);
        System.out.println("tipo carroceria del carro: " + carroCompleto1.tipoCarroceria);
        System.out.println("categoria del carro: " + carroCompleto1.categoria);
        System.out.println("velocidad del carro: " + carroCompleto1.velocidad);
        System.out.println("peso del carro: " + carroCompleto1.peso);
        System.out.println("es manual? " + carroCompleto1.manual);
        System.out.println("nombre del dueno del carro: " + carroCompleto1.nombre);
        System.out.println("apellido del dueno del carro: " + carroCompleto1.apellido);
        System.out.println("cedula del dueno del carro: " + carroCompleto1.cedula);
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        
        carroPropiedades carroInterno = new carroPropiedades("ford" , "azul" , "debil" , "automovil familiar" , "230kmh" , "150kg" , true);
        System.out.println("Info del vehiculo completa (atributos fisicos e internos:) ");
        System.out.println("marca del carro: " + carroInterno.marca);
        System.out.println("color del carro: " + carroInterno.color);
        System.out.println("tipo carroceria del carro: " + carroInterno.tipoCarroceria);
        System.out.println("categoria del carro: " + carroInterno.categoria);
        System.out.println("velocidad del carro: " + carroInterno.velocidad);
        System.out.println("peso del carro: " + carroInterno.peso);
        System.out.println("es manual?: " + carroInterno.manual);
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        
        carroFisico carroFisicamente = new carroFisico("lamborghini" , "verde", "debil" , "deportivo");
        System.out.println("Info del vehiculo completa (atributos fisicos solo: )");
        System.out.println("marca del carro: " + carroFisicamente.marca);
        System.out.println("color del carro: " + carroFisicamente.color);
        System.out.println("tipo carroceria del carro: " + carroFisicamente.tipoCarroceria);
        System.out.println("categoria del carro: " + carroFisicamente.categoria);
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        
        carro carroMarca = new carro("mazda");
        System.out.println("solo la marca del vehiculo: ");
        System.out.println("marca del carro: " + carroMarca.marca);
    }
}
