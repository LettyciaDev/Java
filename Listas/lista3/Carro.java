interface veiculo{
    void acelerar();

    default void status(){
        System.out.println("Veículo pronto para uso");
    }
}

class Carro implements veiculo{
    @Override
    public void acelerar(){
        System.out.println("Carro acelerando...");
    }

    @Override 
    public void status(){
        // utilizar o super para reutilizar a implementação
        veiculo.super.status();
        System.out.println("Marca: Hyundai");
    }
}
