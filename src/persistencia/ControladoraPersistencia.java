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
    public void eliminarPerro(Perro per) {
        try {
            perroJPA.destroy(per.getID());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminarPerro(int ID) {
        try {
            perroJPA.destroy(ID);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Perro> obtenerPerros() {
        return perroJPA.findPerroEntities();
    }

    @Override
    public Perro buscarPerro(Perro per) {
        return perroJPA.findPerro(per.getNum_cliente());
    }

    @Override
    public Perro buscarPerro(int ID) {
        return perroJPA.findPerro(ID);
    }

    @Override
    public void modificarPerro(Perro per) {
        try {
            perroJPA.edit(per);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
