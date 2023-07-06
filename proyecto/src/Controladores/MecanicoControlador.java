package Controladores;

import Conexion.conexion;
import Modelo.Mecanicopedidos;
import javax.persistence.EntityManager;
import Modelo.Usuarios;
import Modelo.Valletpedidos;
import java.util.List;
import javax.persistence.Query;


public class MecanicoControlador
{
    
    public void crear(Mecanicopedidos u)
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
    
    public void editar(Mecanicopedidos u)
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
    
    public List<Mecanicopedidos> todosLosMecanicos()
    {
        Query q = entityManager().createQuery("Select u from mecanicoPedidos u");
        return q.getResultList();
    }
    
   
    private EntityManager entityManager()
    {
        return conexion.getIntancia().getFabrica().createEntityManager();
    }
    
    
}
