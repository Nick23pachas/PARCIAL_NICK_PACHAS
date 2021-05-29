package clases.Parcial.viajefeliz.com.pe;

public class FiltroExpManejo implements Criterio{
    private int minAnios;

    public FiltroExpManejo(int minAnios) {
        if(minAnios<0){
            throw new TransporteException("Numeor de anios invalido");
        }
        else{
            this.minAnios = minAnios;
        }
    }
    public boolean busSeleccinable(Conductor conductor){
        if (conductor.getAniosManejo()>this.minAnios|| (conductor.getAniosManejo()-this.minAnios)<conductor.getCapacitaciones().size()){ //la fe
            return true;
        }
        else{
            return false;
        }
    }

    public int getMinAnios() {
        return minAnios;
    }

    public void setMinAnios(int minAnios) {
        this.minAnios = minAnios;
    }
}
