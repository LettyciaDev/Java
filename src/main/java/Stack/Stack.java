package Stack;

public class Stack{
    private StackNode topo;

    public void push (Integer valor){
        Stack novo;
        novo = new Stack(valor);
        novo.setProx(this.topo);
        this.topo = novo;
    }

    public StackNode pop(){
        StackNode aux;
        aux = this.topo.getProx();
        return aux.getInfo();
    }

    public Integer top(){
        return this.top.getInfo();
    }

    public boolen isEmpty(){
        return this.topo == null;
    }

    public boolean isFull(){
        return false;
    }


}