package clases.Parcial.viajefeliz.com.pe;

public class FiltroMatricula implements Criterio{
    private String cadenaBuscar;

    public FiltroMatricula(String cadenaBuscar) {
        if (cadenaBuscar==null){
            throw new TransporteException("Cadena no valida");
        }
        else{
            this.cadenaBuscar=cadenaBuscar;
        }
    }
    public boolean busSeleccinable(Bus bus){
        return bus.getMatricula()==this.cadenaBuscar;
    }

    public String getCadenaBuscar() {
        return cadenaBuscar;
    }

    public void setCadenaBuscar(String cadenaBuscar) {
        this.cadenaBuscar = cadenaBuscar;
    }

    @Override
    public String toString() {
        return "AutoBuses cuya Matricula contiene [" +cadenaBuscar  +']';
    }
}
