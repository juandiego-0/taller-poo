
package Main;

import Objeto.AutosMoviles;


public class EjecutarAuto {
    
    public static void main(String[] args) {
        AutosMoviles carro = new AutosMoviles();
        carro.setMarca("toyota");
        carro.setModelo(2017);
        carro.setMotor(2.0);
        carro.setNumeroDePuertas(4);
        carro.setNumeroDeSillas(6);
        carro.setVelocidadActual(100);
        carro.setVelocidadMaxima(50);  
        carro.setColor(AutosMoviles.Color.ROJO);
        carro.setCombustible(AutosMoviles.Combustible.GASOLINA);
        carro.setAutomovil(AutosMoviles.TiposDeAutos.FAMILIAR);
        
        carro.mostrarDatos();
     
        carro.setVelocidadActual(100);
        System.out.println("\nVelocidad actual: " + carro.getVelocidadActual() +
                " km/h");

        carro.acelerar(20);

        carro.desacelerar(50);

        carro.frenar();
}
    }
