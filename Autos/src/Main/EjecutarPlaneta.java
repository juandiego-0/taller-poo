
package Main;

import Objetos.Planeta;


public class EjecutarPlaneta {
    
    public static void main(String[] args) {
        Planeta planeta = new Planeta();
        planeta.setNombre("marte");
        planeta.setSatelite(1);
        planeta.setDiametro(6779);
        planeta.setDistanciaMedia(228);
        planeta.setMasa( 6.4185 );
        planeta.setVolumen(1.6318);
        planeta.setObservable(true);
        
            

   
      System.out.println("Detalles de marte:");
        planeta.imprimirResultado();
        System.out.println("Densidad de urano: " + planeta.calcularDensidad() + " kg/km³");
        System.out.println("¿urano es un planeta exterior? " + planeta.exteriror());
        
        
        planeta.setNombre("tierra");
        planeta.setSatelite(4550);
        planeta.setDiametro(12742);
        planeta.setDistanciaMedia(150);
        planeta.setMasa( 5.97217 );
        planeta.setVolumen(1.08321 );
        planeta.setObservable(true);
        
        
   
      System.out.println("Detalles de la tiera :");
        planeta.imprimirResultado();
        System.out.println("Densidad de la tierra: " + planeta.calcularDensidad() + " kg/km³");
        System.out.println("¿la tierra es un planeta exterior? " + planeta.exteriror());
        
    
    }
       

} 

