package veiculo;

public class Moto implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelelar Moto");
    }

    @Override
    public void frear() {
        System.out.println("Frear Moto");
    }
    
}
