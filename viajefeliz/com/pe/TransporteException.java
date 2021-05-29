package clases.Parcial.viajefeliz.com.pe;

public class TransporteException extends RuntimeException{
    private static String msError="Existe error :";
    public TransporteException(String tipo){
        super(msError+ ":"+ tipo);
    }
    public TransporteException(){
        super(msError);
    }
}
