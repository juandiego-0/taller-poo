
package Objetos;


public class Planeta {
    
    private String nombre = null;
    private int satelite = 0;
    private Double masa = 0.0;
    private Double volumen = 0.0;
    private int diametro = 0;
    private int distanciaMedia = 0;
    public enum TipoDePlaneta {
        GASEOSO,TERRESTRE, ENANO
    } 
    
    TipoDePlaneta tipoDePlaneta = TipoDePlaneta.TERRESTRE;
    private boolean observable = false;
    
    private static final double ua = 149597870;
    public Planeta() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSatelite() {
        return satelite;
    }

    public void setSatelite(int satelite) {
        this.satelite = satelite;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(int distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    public TipoDePlaneta getTipoDePlaneta() {
        return tipoDePlaneta;
    }

    public void setTipoDePlaneta(TipoDePlaneta tipoDePlaneta) {
        this.tipoDePlaneta = tipoDePlaneta;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }
    
    public void imprimirResultado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + satelite);
        System.out.println("Masa en Kilogramos: " + masa + " kg");
        System.out.println("Volumen en Kilómetros Cúbicos: " + volumen + " km³");
        System.out.println("Diámetro en Kilómetros: " + diametro + "km");
        System.out.println("Distancia Media al Sol : " + distanciaMedia + "millones de km");
        System.out.println("Tipo de Planeta: " + tipoDePlaneta);
        System.out.println("Observable a Simple Vista: " + observable);
    }
  
    public double calcularDensidad(){
        
        if (volumen == 0){
            return 0;
    }
    return masa / volumen; 
    }
    public boolean exteriror() {
    double distanciaUa = (distanciaMedia * 1e6) / ua;
    
    return distanciaUa > 3.4;
        
    }
}
    

