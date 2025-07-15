interface Nadador{
    void nadar();
}

interface Corredor{
    void correr();
}

class Triatleta implements Nadador, Corredor{
    @Override
    public void nadar(){
        System.out.println("Nadando...");
    }

    @Override
    public void correr(){
        System.out.println("Correndo...");
    }
}