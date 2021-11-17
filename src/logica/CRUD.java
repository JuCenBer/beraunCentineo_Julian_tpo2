package logica;

import java.util.List;

public interface CRUD {
    
    public void crearPerro(Perro per);
    
    public void eliminarPerro(Perro per);
    public void eliminarPerro(int numCliente);
    
    public List<Perro> obtenerPerros();
    
    public Perro buscarPerro(Perro per);
    public Perro buscarPerro(int numCliente);
    
    public void modificarPerro(Perro per);
    
}
