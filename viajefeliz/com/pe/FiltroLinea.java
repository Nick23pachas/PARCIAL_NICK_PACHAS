package clases.Parcial.viajefeliz.com.pe;

import java.util.Objects;

public class FiltroLinea implements Criterio{
    private int codLinea;

    public FiltroLinea(int codLinea) {
        if(codLinea<0){
            throw new TransporteException("Codigo de Linea NO valido");
        }
        else{
            this.codLinea = codLinea;
        }
    }
    public int getCodLinea() {
        return codLinea;
    }

    public void setCodLinea(int codLinea) {
        this.codLinea = codLinea;
    }

    public boolean busSeleccionable(Bus bus) {
        return bus.getCodLinea() == this.codLinea;
    }
    @Override
    public int hashCode() {
        return Objects.hash(codLinea);
    }

    @Override
    public String toString() {
        return "Autobuses de la linea ["+ codLinea +"]" ;
    }
}
