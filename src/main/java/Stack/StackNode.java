class StackNode{
    private Integer info;
    private StackNode prox;

    StackNode(Integer info){
        this.info = info;
    }

    void setInfo(Integer info){
        this.info = info;
    }

    Integer getInfo(){
        return this.info;
    }

    void setProx(StackNode prox){
        this.prox = prox;
    }

    StackNode getProx(){
        return this.prox;
    }

}