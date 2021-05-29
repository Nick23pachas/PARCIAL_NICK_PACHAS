package clases.Parcial.viajefeliz.com.pe;

import java.util.Objects;

public class Bus {
    private String codBus;
    private int codLinea;
    private String matricula;
    private Conductor conductor;

    public Bus(String codBus, int codLinea, String matricula) {
        this.codBus = codBus;
        this.codLinea = codLinea;
        this.matricula = matricula;
    }

    public Bus(String codBus, int codLinea) {
        if (codLinea<0){
            throw new TransporteException("Codigo de linea no valido");
        }
        else {
            this.codLinea=codLinea;
        }
        if (codBus==null){
            throw new TransporteException("Codigo de bus no valido");
        }
        else {
            this.codBus = codBus;
        }
    }

    public String getCodBus() {
        return codBus;
    }

    public void setCodBus(String codBus) {
        this.codBus = codBus;
    }

    public int getCodLinea() {
        return codLinea;
    }

    public void setCodLinea(int codLinea) {
        this.codLinea = codLinea;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return codBus.equals(bus.codBus) && matricula.equals(bus.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codBus, matricula);
    }

    @Override
    public String toString() {
        return "Bus(" + codBus+","+ codLinea+","+ matricula+")";
    }
}
