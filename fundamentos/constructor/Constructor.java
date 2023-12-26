package constructor;

public class Constructor {

    private int numero;

    public Constructor(){

    }

    public Constructor(int numero){
        this.numero = numero;
    }

    public Constructor(int numero, String texto){
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}