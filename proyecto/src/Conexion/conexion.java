
package Conexion;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class conexion 
{
    private static conexion intancia = new conexion();
    private EntityManagerFactory fabrica;
    
    
    private conexion()
    {
        fabrica = Persistence.createEntityManagerFactory("InterfazPU");
    }

    public static conexion getIntancia() {
        return intancia;
    }  

    public EntityManagerFactory getFabrica() {
        return fabrica;
    }

   
    
}
