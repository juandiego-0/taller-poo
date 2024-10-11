
package Main1;

import Objeto.CuentaAhorro;



public class EjecutarCuenta {
    public static void main(String[] args) {
        
        CuentaAhorro cuentaAhorros = new CuentaAhorro(10000, 0.03f);
        cuentaAhorros.consignar(2000);  
        cuentaAhorros.retirar(1500);    
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir(); 
        
    }
}


    
  
     

