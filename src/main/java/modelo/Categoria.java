package modelo;
import java.util.*;

public class Categoria {
    private int idCategoria;
    private String nombreCategoria;
    private char SexoCategoria;
    private int EdadMinima;
    private int EdadMaxima;

    public Categoria(int idCategoria, String nombreCategoria, int EdadMinima, int EdadMaxima, char SexoCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.EdadMinima = EdadMinima;
        this.EdadMaxima = EdadMaxima;
        this.SexoCategoria = SexoCategoria;
    }
    

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getEdadMinima() {
        return EdadMinima;
    }

    public void setEdadMinima(int EdadMinima) {
        this.EdadMinima = EdadMinima;
    }

    public int getEdadMaxima() {
        return EdadMaxima;
    }

    public void setEdadMaxima(int EdadMaxima) {
        this.EdadMaxima = EdadMaxima;
    }
}
