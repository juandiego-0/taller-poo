
package Objeto;


public class CuentaAhorro extends Cuenta {
    
     public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

  
    public void imprimir() {
        System.out.println("\n--- Información Cuenta de Ahorros ---");
        System.out.println("Saldo de la cuenta de ahorros: " + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
    }



}



    

   
    

