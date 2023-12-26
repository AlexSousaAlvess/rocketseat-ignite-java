package veiculo;

public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("Acelerar Carro");
    }

    @Override
    public void frear() {
        System.out.println("Frear moto");
    }
    
}
