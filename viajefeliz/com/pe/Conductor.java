package clases.Parcial.viajefeliz.com.pe;

import java.util.List;
import java.util.Objects;

public class Conductor {
    private String codigo;
    private String dni;
    private String nombre;
    private int aniosManejo;
    public List<String> capacitaciones;

    public Conductor(String codigo, String dni, String nombre) {
        if(codigo ==null || nombre == null || dni == null){
            throw new TransporteException("Campos no validos");
        }
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAniosManejo() {
        return aniosManejo;
    }

    public void setAniosManejo(int aniosManejo) {
        this.aniosManejo = aniosManejo;
    }

    public List<String> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(List<String> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conductor conductor = (Conductor) o;
        return codigo.equals(conductor.codigo) && dni.equals(conductor.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, dni);
    }

    @Override
    public String toString() {
        return "Conductor(" + codigo+","+ dni+","+ nombre+")";
    }
}
