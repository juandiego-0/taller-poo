
package Objeto;


public class Cuenta {
    
   
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;

   
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        System.out.println("Saldo inicial: " + this.saldo);
    }

   
    public void consignar(float cantidad) {
        saldo += cantidad;
        numeroConsignaciones++;
        System.out.println("Consignación: " + cantidad);
    }


    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            numeroRetiros++;
            System.out.println("Retiro: " + cantidad);
        } else {
            System.out.println("Saldo insuficiente para retirar: " + cantidad);
        }
    }

    
    public void calcularInteres() {
        float interes = (tasaAnual / 12) * saldo; 
        saldo += interes;
        System.out.println("Interés mensual aplicado: " + interes);
    }

  
    public void extractoMensual() {
        System.out.println("\n--- Extracto Mensual ---");
        calcularInteres(); 
        System.out.println("Saldo final después de interés: " + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
    }
}







    
    

    
   
            
            


