package Controladores;

import Conexion.conexion;
import javax.persistence.EntityManager;
import Modelo.Usuarios;
import java.util.List;
import javax.persistence.Query;


public class UsuarioControlador
{
    
    public void crear(Usuarios u)
    {
        
        EntityManager en = entityManager();
        try
        {
            en.getTransaction().begin();
            en.persist(u);
            en.getTransaction().commit(); //inserta la transaccion  
        }
        catch(Exception e)
        {
            en.getTransaction().rollback();
        }
    }
    
    public void editar(Usuarios u)
    {
        
        EntityManager en = entityManager();
        try
        {
            en.getTransaction().begin();
            en.merge(u);
            en.getTransaction().commit(); //inserta la transaccion  
        }
        catch(Exception e)
        {
            en.getTransaction().rollback();
        }
    }
    
    public void eliminar(Object u)
    {      
        EntityManager en = entityManager();
        try
        {
            en.getTransaction().begin();
            en.remove(en.merge(u));
            en.getTransaction().commit(); //inserta la transaccion  
        }
        catch(Exception e)
        {
            en.getTransaction().rollback();
        }
    }
    
    public List<Usuarios> todosLosUsuarios()
    {
        Query q = entityManager().createQuery("Select u from Usuarios u");
        return q.getResultList();
    }
    
   
    private EntityManager entityManager()
    {
        return conexion.getIntancia().getFabrica().createEntityManager();
    }
    
    
}

