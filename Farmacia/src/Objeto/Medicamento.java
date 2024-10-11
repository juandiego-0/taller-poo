
package Objeto;

public class Medicamento {
    
    private String medicamento;
    private String fabricante;
    private String via_administracion;

    public Medicamento() {
   
}
    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVia_administracion() {
        return via_administracion;
    }

    public void setVia_administracion(String via_administracion) {
        this.via_administracion = via_administracion;
    }


    public void resultado(){
        System.out.println("El nombre del medicamento: " + medicamento );
        System.out.println("Fabricante del medicamento : " + fabricante);
        System.out.println("Via por la cual se administra es: " 
                + via_administracion);
        
    }
    
    public class Interno {
        private String usuario;
        private double dosis;
        private int periodo;
        private String recomendacion;

        public Interno() {
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public double getDosis() {
            return dosis;
        }

        public void setDosis(double dosis) {
            this.dosis = dosis;
        }

        public int getPeriodo() {
            return periodo;
        }

        public void setPeriodo(int periodo) {
            this.periodo = periodo;
        }

        public String getRecomendacion() {
            return recomendacion;
        }

        public void setRecomendacion(String recomendacion) {
            this.recomendacion = recomendacion;
        }
        
        public void resultado2() {
            
            System.out.println("Usuarios: " + usuario);
            System.out.println("Dosis recomendada: " + dosis + "mg");
            System.out.println("Recomendacion: " + recomendacion);
            
                    
        
    }
    }


}

