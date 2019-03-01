package modelo;
import java.util.*;

public class Inscripcion {
    private int idInscripcion;
    private Categoria categoriaInscripcion;
    private Torneo torneoInscripcion;
    private String estadoInscripcion;
    private Escuela escuelaInscripcion;
    private Competidor competidorInscripcion;
    private String resultadoCompetidor;
    
    public Inscripcion(int id, Torneo tor,Escuela esc, Competidor comp, Categoria cat){
        idInscripcion=id;
        torneoInscripcion=tor;
        estadoInscripcion="En inspeccion";
        escuelaInscripcion=esc;
        competidorInscripcion=comp;
        categoriaInscripcion=cat;
    }

    public Categoria getCategoriaInscripcion() {
        return categoriaInscripcion;
    }

    public void setCategoriaInscripcion(Categoria categoriaInscripcion) {
        this.categoriaInscripcion = categoriaInscripcion;
    }
    
    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Torneo getTorneoInscripcion() {
        return torneoInscripcion;
    }

    public void setTorneoInscripcion(Torneo torneoInscripcion) {
        this.torneoInscripcion = torneoInscripcion;
    }

    public String getEstadoInscripcion() {
        return estadoInscripcion;
    }

    public void setEstadoInscripcion(String estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }

    public Escuela getEscuelaInscripcion() {
        return escuelaInscripcion;
    }

    public void setEscuelaInscripcion(Escuela escuelaInscripcion) {
        this.escuelaInscripcion = escuelaInscripcion;
    }

    public Competidor getCompetidorInscripcion() {
        return competidorInscripcion;
    }

    public void setCompetidorInscripcion(Competidor competidorInscripcion) {
        this.competidorInscripcion = competidorInscripcion;
    }

    public String getResultadoCompetidor() {
        return resultadoCompetidor;
    }

    public void setResultadoCompetidor(String resultadoCompetidor) {
        this.resultadoCompetidor = resultadoCompetidor;
    }
    
}
