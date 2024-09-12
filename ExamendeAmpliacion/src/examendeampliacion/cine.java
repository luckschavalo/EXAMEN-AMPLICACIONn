
package examendeampliacion;

//los atributos a las clases
public class cine {
    private String nombrePeli;
    private String asientos;
    private String letra;
    private String estado;
    
    //contrucutor de los atributos

    public cine(String nombrePeli, String asientos, String letra, String estado) {
        this.nombrePeli = nombrePeli;
        this.asientos = asientos;
        this.letra = letra;
        this.estado = estado;
    }
    
    //set and get de los atributos

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    void getLetra(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getNumero(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
