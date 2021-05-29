package clases.Parcial.viajefeliz.com.pe;

import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private String ciudad;
    private List<Bus> busesDisponibles;
    private List<Bus> busesFiltrados;

    public Servicio(String ciudad, List<Bus> busesDisponibles) {
        this.ciudad = ciudad;
        this.busesDisponibles = busesDisponibles;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Bus> getBusesDisponibles() {
        return busesDisponibles;
    }

    public void setBusesDisponibles(List<Bus> busesDisponibles) {
        this.busesDisponibles = busesDisponibles;
    }

    public List<Bus> getBusesFiltrados() {
        return busesFiltrados;
    }

    public void setBusesFiltrados(List<Bus> busesFiltrados) {
        this.busesFiltrados = busesFiltrados;
    }
    public List<Bus> filtra(Criterio criterio){

    }
    public List<Bus> filtra(Criterio criterio, List<Bus> busesAFiltrar){

    }
    public void valida(Criterio criterio,List<Bus> busesAFiltrar){
        if(criterio==null){
            throw new TransporteException("Criterio no valido");
        }
        if(busesAFiltrar==null){
            busesAFiltrar=new ArrayList<>();
        }
        if(busesDisponibles==null){
            throw new TransporteException("Lista sin datos");
        }
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "ciudad='" + ciudad + '\'' +
                ", busesDisponibles=" + busesDisponibles +
                '}';
    }
}
