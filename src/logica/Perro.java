package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perro implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID; //Este atributo se utilizara para que la base de datos misma genere los valores de la primary key
    @Basic
    private int num_cliente; //A pesar de los errores humanos a la hora de ingresar el numero de cliente, no habra problemas a la hora de cargarlos a la base de datos en caso de que estos se repitan
    private String nombre_perro;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atencion_especial;
    private String nombre_duenio;
    private int celular_duenio;
    private String observaciones;

    public Perro() {
    }

    public Perro(int num_cliente, String nombre_perro, String raza, String color, boolean alergico, boolean atencion_especial, String nombre_duenio, int celular_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
    }

    public int getID() {
        return ID;
    }


    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(boolean atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public int getCelular_duenio() {
        return celular_duenio;
    }

    public void setCelular_duenio(int celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
