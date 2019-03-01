
package API;

import modelo.Categoria;
import modelo.Disciplina;
import modelo.Escuela;
import modelo.Inscripcion;
import modelo.Sede;
import modelo.Torneo;
import modelo.Competidor;
import java.util.*;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.swing.*;

public class API extends Exception{
    private static SessionFactory factory;
    
    
    public void registrarTorneo(int idTorneo, Disciplina disci, Categoria cat, Sede sed, char sexo){
        empezarTransaccion();
        Torneo T= new Torneo(idTorneo,disci,cat,sed, sexo);
        Session sesion= factory.openSession();
        Transaction tx=null;
        try{
            tx=sesion.beginTransaction();
            sesion.save(T);
            tx.commit();
        }
        catch(HibernateException e){
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }finally{
            sesion.close();
        }
    }
    
    public void agregarCompetidor(int idCompetidor, String nombreCompetidor, String apellidoCompetidor, char sexoCompetidor, int edadCompetidor, Escuela esc){
       Competidor C = new Competidor(idCompetidor, nombreCompetidor, apellidoCompetidor, sexoCompetidor, edadCompetidor);
       Session sesion= factory.openSession();
       Transaction tx=null;
       try{
            tx=sesion.beginTransaction();
            sesion.save(C);
            tx.commit();
        }
        catch(HibernateException e){
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }finally{
           sesion.close();
       }
    }
    
    public void cambiarEstadoInscripcion(Inscripcion Insc, String nuevoEstado){
        Insc.setEstadoInscripcion(nuevoEstado);
    }
    
    public void setPosicionCompetidor(Inscripcion insc, String posicion){
        insc.setResultadoCompetidor(posicion);
    }
    
    public void registrarEscuela(int idEsc, String nombreEsc){
        Escuela E=new Escuela(idEsc, nombreEsc);
        Session sesion= factory.openSession();
        Transaction tx=null;
        try{
            tx=sesion.beginTransaction();
            sesion.save(E);
            tx.commit();
        }
        catch(HibernateException e){
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }finally{
            sesion.close();
        }
    }
    
    public void registrarCategoria(int idCategoria, String nombreCategoria, int EdadMinima, int EdadMaxima, char SexoCategoria){
     Categoria C= new Categoria(idCategoria, nombreCategoria, EdadMinima, EdadMaxima, SexoCategoria);
     Session sesion= factory.openSession();
     Transaction tx=null;
        try{
            tx=sesion.beginTransaction();
            sesion.save(C);
            tx.commit();
        }
        catch(HibernateException e){
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }finally{
            sesion.close();
        }
    }
    public void registrarDisciplina(int idDisci, String nombre){
        Disciplina D=new Disciplina(idDisci, nombre);
        Session sesion= factory.openSession();
        Transaction tx=null;
        try{
            tx=sesion.beginTransaction();
            sesion.save(D);
            tx.commit();
        }
        catch(HibernateException e){
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }finally{
            sesion.close();
        }
    }
    public void buscarDisciplinas(JList listaDisci){
      Session session = factory.openSession();
      Transaction tx = null;
      try {
         tx = session.beginTransaction();
         List disciplinas = session.createQuery("FROM Disciplinas").list(); 
         for (Iterator iterator = disciplinas.iterator(); iterator.hasNext();){
              Disciplina disc = (Disciplina) iterator.next();
            ((DefaultListModel)listaDisci.getModel()).addElement(disc);
         }
         tx.commit();

      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
    }
    public void buscarCategorias(JList lista){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List categorias = session.createQuery("FROM Categorias").list(); 
         for (Iterator iterator = categorias.iterator(); iterator.hasNext();){
            Categoria cat = (Categoria) iterator.next();
            ((DefaultListModel)lista.getModel()).addElement(cat);
         }
         tx.commit();

      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
    }
    public void buscarCompetidores(JList lista){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List categorias = session.createQuery("FROM Inscripciones WHERE idEscuela=Escuelas_idEscuelas").list(); 
         for (Iterator iterator = categorias.iterator(); iterator.hasNext();){
            Inscripcion insc = (Inscripcion) iterator.next();
            ((DefaultListModel)lista.getModel()).addElement(insc);
         }
         tx.commit();

      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
    }
    public void buscarEscuelas(JList lista){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List categorias = session.createQuery("FROM Escuelas").list(); 
         for (Iterator iterator = categorias.iterator(); iterator.hasNext();){
            Escuela esc = (Escuela) iterator.next();
            ((DefaultListModel)lista.getModel()).addElement(esc);
         }
         tx.commit();

      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
    }
    
    public void empezarTransaccion(){
        try{
            factory= new Configuration().configure().buildSessionFactory();
        }catch(Throwable ex){
            System.err.println("La sesion fallo en crearse");
        }
    }
    public Escuela buscarEscuela(int IDEsc){
      Session session = factory.openSession();
      Transaction tx = null;
      Escuela var=null;
      
      try {
         tx = session.beginTransaction();
         var=session.get(Escuela.class, IDEsc);
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null)
             tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return var;
    }
    
}
