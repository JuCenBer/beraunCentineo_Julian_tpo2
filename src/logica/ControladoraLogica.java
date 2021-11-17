package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class ControladoraLogica implements CRUD{

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
            
    private int i = 1; //Indice de ID
    
    public void crearPerro(int numCliente, String nombre, String raza,
            String color,boolean alergico, boolean atencionEspecial,
            String nombreDuenio, int celularDuenio, String observaciones){
        
        Perro per = new Perro();
        
        per.setNum_cliente(numCliente);
        per.setNombre_perro(nombre);
        per.setRaza(raza);
        per.setColor(color);
        per.setAlergico(alergico);
        per.setAtencion_especial(atencionEspecial);
        per.setNombre_duenio(nombreDuenio);
        per.setCelular_duenio(celularDuenio);
        per.setObservaciones(observaciones);
        
        controlPersis.crearPerro(per);
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
    @Override
    public void crearPerro(Perro per) {
        controlPersis.crearPerro(per);
    }

    @Override
    public void eliminarPerro(Perro per) {  //No se utiliza
        controlPersis.eliminarPerro(per);
    }

    @Override
    public void eliminarPerro(int numCliente) { //No se utiliza
        controlPersis.eliminarPerro(numCliente);
    }

    @Override
    public List<Perro> obtenerPerros() {    //No se utiliza
        return controlPersis.obtenerPerros();
    }

    @Override
    public Perro buscarPerro(Perro per) {   //No se utiliza
        return controlPersis.buscarPerro(per);
        
    }

    @Override
    public Perro buscarPerro(int numCliente) {  //No se utiliza
        return controlPersis.buscarPerro(numCliente);
    }

    @Override
    public void modificarPerro(Perro per) { //No se utiliza
        controlPersis.modificarPerro(per);
    }
    
}
