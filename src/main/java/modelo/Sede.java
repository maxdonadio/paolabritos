package modelo;
import java.util.*;


public class Sede {
    private int idSede;
    private String nombreSede;
    private String provinciaSede;
    private String localidadSede;

    public Sede(int idSede, String nombreSede, String provinciaSede, String localidadSede) {
        this.idSede = idSede;
        this.nombreSede = nombreSede;
        this.provinciaSede = provinciaSede;
        this.localidadSede = localidadSede;
    }
    

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getProvinciaSede() {
        return provinciaSede;
    }

    public void setProvinciaSede(String provinciaSede) {
        this.provinciaSede = provinciaSede;
    }

    public String getLocalidadSede() {
        return localidadSede;
    }

    public void setLocalidadSede(String localidadSede) {
        this.localidadSede = localidadSede;
    }
}
