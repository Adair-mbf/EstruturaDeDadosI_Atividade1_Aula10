package SemBiblioteca;

class Pilha {
    private char[] elementos;
    private int topo = -1;
    public Pilha(int capacidade) {
        this.elementos = new char[capacidade];
    }
    void push(char c){
        if (topo < elementos.length - 1) {
            elementos[++topo] = c;
        }
        else{
            System.out.println("Pilha Cheia!");
        }
    }
    char pop(){
        if (!estaVazia()) {
            return elementos[topo--];
        } else {
            System.out.println("Pilha Vazia!");
            return '\0';
        }
    }
    boolean estaVazia(){
        return topo == -1;
    }
    boolean estaCheia(){
        return topo == elementos.length - 1;
    }
    void limpar(){
        topo = -1;
    }
}
