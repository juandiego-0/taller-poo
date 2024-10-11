
package Objeto;
   
public class AutosMoviles {

    private String marca;
    private int modelo;
    private double motor;
    private int numeroDePuertas;
    private int numeroDeSillas;
    private int velocidadMaxima;
    private int velocidadActual;
    private Combustible Combustible;
    private Color color;
    private TiposDeAutos automovil;
    
    public enum TiposDeAutos {
    CARRO_CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV;
}
    public enum Combustible {
     GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL;
}
    public enum Color {
    BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA;
}

    public AutosMoviles() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDeSillas() {
        return numeroDeSillas;
    }

    public void setNumeroDeSillas(int numeroDeSillas) {
        this.numeroDeSillas = numeroDeSillas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public Combustible getCombustible() {
        return Combustible;
    }

    public void setCombustible(Combustible Combustible) {
        this.Combustible = Combustible;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TiposDeAutos getAutomovil() {
        return automovil;
    }

    public void setAutomovil(TiposDeAutos automovil) {
        this.automovil = automovil;
    }

    

    
     public void acelerar(int incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("No se puede acelerar más allá de la velocidad máxima de " + velocidadMaxima + " km/h.");
            velocidadActual = velocidadMaxima;
        } else {
            velocidadActual += incremento;
            System.out.println("El vehículo ha acelerado a " + velocidadActual + " km/h.");
        }
    }
  
    public void desacelerar(int decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede desacelerar por debajo de 0 km/h.");
            velocidadActual = 0;
        } else {
            velocidadActual -= decremento;
            System.out.println("El vehículo ha desacelerado a " + velocidadActual + " km/h.");
        }
    }

    
    public void frenar() {
        velocidadActual = 0;
        System.out.println("El vehículo ha frenado y ahora está detenido.");
    }

  
  public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Tipo de Combustible: " + Combustible);
        System.out.println("Tipo de Automóvil: " + automovil);
        System.out.println("Número de Puertas: " + numeroDePuertas);
        System.out.println("Cantidad de Asientos: " + numeroDeSillas);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }
    
}
