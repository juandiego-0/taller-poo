
package Main;

import Objeto.Medicamento;


public class EjecutarMedicamento {
    public static void main(String[] args) {
        
              
        Medicamento medicamento = new Medicamento();
        medicamento.setMedicamento("Paracetamol");
        medicamento.setFabricante("Rochem International");
        medicamento.setVia_administracion("Oral");
           medicamento.resultado();
    
           
    Medicamento.Interno interno = medicamento.new Interno();
    
    interno.setDosis(200);
    interno.setPeriodo(8);
    interno.setUsuario(" Mayores de 10 años ");
    interno.setRecomendacion(" No sobre pasar la dosis ");
    interno.resultado2();
    }
    
    }
            

