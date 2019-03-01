package modelo;
import java.util.*;



public class Torneo {
    private int idTorneo;
    private String nombreTorneo;
    private Date fechaTorneo;
    private Date horaTorneo;
    private Disciplina disciplinaTorneo;
    private Categoria categoriaTorneo;
    private Sede sedeTorneo;

    public Torneo(int idTorneo, Disciplina disci, Categoria cat, Sede sed, char sexo){
        this.idTorneo=idTorneo;
        disciplinaTorneo=disci;
        categoriaTorneo=cat;
        sedeTorneo=sed;
    }
    
    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public Date getHoraTorneo() {
        return horaTorneo;
    }

    public void setHoraTorneo(Date horaTorneo) {
        this.horaTorneo = horaTorneo;
    }

    
    public int getIdTorneo() {
        return idTorneo;
    }

    public void setIdTorneo(int idTorneo) {
        this.idTorneo = idTorneo;
    }

    public Date getFechaTorneo() {
        return fechaTorneo;
    }

    public void setFechaTorneo(Date fechaHoraTorneo) {
        this.fechaTorneo = fechaHoraTorneo;
    }

    public Disciplina getDisciplinaTorneo() {
        return disciplinaTorneo;
    }

    public void setDisciplinaTorneo(Disciplina disciplinaTorneo) {
        this.disciplinaTorneo = disciplinaTorneo;
    }

    public Categoria getCategoriaTorneo() {
        return categoriaTorneo;
    }

    public void setCategoriaTorneo(Categoria categoriaTorneo) {
        this.categoriaTorneo = categoriaTorneo;
    }

    public Sede getSedeTorneo() {
        return sedeTorneo;
    }

    public void setSedeTorneo(Sede sedeTorneo) {
        this.sedeTorneo = sedeTorneo;
    }

}
