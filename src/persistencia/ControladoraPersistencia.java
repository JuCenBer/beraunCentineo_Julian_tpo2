package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.CRUD;
import logica.Perro;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia implements CRUD{
    
    PerroJpaController perroJPA = new PerroJpaController();

    @Override
    public void crearPerro(Perro per) {
        try {
            perroJPA.create(per);
        } catch (Exception e) {
            
        }
    }

    @Override
    public void eliminarPerro(Perro per) {  //No se utiliza
        try {
            perroJPA.destroy(per.getID());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarPerro(int ID) { //No se utiliza
        try {
            perroJPA.destroy(ID);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Perro> obtenerPerros() {    //No se utiliza
        return perroJPA.findPerroEntities();
    }

    @Override
    public Perro buscarPerro(Perro per) {   //No se utiliza
        return perroJPA.findPerro(per.getNum_cliente());
    }

    @Override
    public Perro buscarPerro(int ID) {  //No se utiliza
        return perroJPA.findPerro(ID);
    }

    @Override
    public void modificarPerro(Perro per) { //No se utiliza
        try {
            perroJPA.edit(per);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
