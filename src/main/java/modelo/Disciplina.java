package modelo;
import java.util.*;

public class Disciplina {
    private int idDisciplina;
    private String nombreDisciplina;

    public Disciplina(int idDisciplina, String nombre) {
        this.idDisciplina = idDisciplina;
        this.nombreDisciplina = nombre;
    }
    
    public int getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getNombre() {
        return nombreDisciplina;
    }

    public void setNombre(String nombre) {
        this.nombreDisciplina = nombre;
    }
}
