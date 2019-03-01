package modelo;
import java.util.*;


public class Competidor {
    private int DNI;
    private String nombreCompetidor;
    private String apellidoCompetidor;
    private char sexoCompetidor;
    private int edadCompetidor;

    public Competidor(int idCompetidor, String nombreCompetidor, String apellidoCompetidor, char sexoCompetidor, int edadCompetidor) {
        this.DNI = idCompetidor;
        this.nombreCompetidor = nombreCompetidor;
        this.apellidoCompetidor = apellidoCompetidor;
        this.sexoCompetidor = sexoCompetidor;
        this.edadCompetidor = edadCompetidor;
    }
    
    
    
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int idCompetidor) {
        this.DNI = idCompetidor;
    }

    public String getNombreCompetidor() {
        return nombreCompetidor;
    }

    public void setNombreCompetidor(String nombreCompetidor) {
        this.nombreCompetidor = nombreCompetidor;
    }

    public String getApellidoCompetidor() {
        return apellidoCompetidor;
    }

    public void setApellidoCompetidor(String apellidoCompetidor) {
        this.apellidoCompetidor = apellidoCompetidor;
    }

    public char getSexoCompetidor() {
        return sexoCompetidor;
    }

    public void setSexoCompetidor(char sexoCompetidor) {
        this.sexoCompetidor = sexoCompetidor;
    }

    public int getEdadCompetidor() {
        return edadCompetidor;
    }

    public void setEdadCompetidor(int edadCompetidor) {
        this.edadCompetidor = edadCompetidor;
    }

}
