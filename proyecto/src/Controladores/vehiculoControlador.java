package Controladores;

import Conexion.conexion;
import javax.persistence.EntityManager;
import Modelo.Vehiculos;
import java.util.List;
import javax.persistence.Query;


public class vehiculoControlador
{
    
    public void crear(Vehiculos u)
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
    
    public void editar(Vehiculos u)
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
    
    public List<Vehiculos> todosLosVehiculos()
    {
        Query q = entityManager().createQuery("Select u from Vehiculos u");
        return q.getResultList();
    }
    
   
    private EntityManager entityManager()
    {
        return conexion.getIntancia().getFabrica().createEntityManager();
    }
    
    
}
