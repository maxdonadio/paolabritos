package modelo;
import java.util.*;


public class Escuela {
    private int idEscuela;
    private String nombreEscuela;

    public Escuela(int idEscuela, String nombreEscuela) {
        this.idEscuela = idEscuela;
        this.nombreEscuela = nombreEscuela;
    }

    public int getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(int idEscuela) {
        this.idEscuela = idEscuela;
    }
    
    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }
}
