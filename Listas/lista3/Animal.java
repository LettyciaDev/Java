interface Animal {
    void emitirSom();
}

class Cachorro implements Animal{
    @Override
    public void emitirSom(){
        System.out.println("Au Au!");
    }
}

class Gato implements Animal{
    @Override
    public void emitirSom(){
        System.out.println("Miau!");
    }
}

