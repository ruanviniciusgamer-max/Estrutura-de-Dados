import javax.sound.sampled.SourceDataLine;

public class PilhaEncadeada {

    private class Node {
        public Object valor;
        public Node proximo;
        
        public Node(Object valor) {
            this.valor = valor; 
            this.proximo = null;
        }
    }

    private Node topo;
    private int tamanho;

    public PilhaEncadeada() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(Object valor) {
        if(valor == null ) {
            throw new IllegalArgumentException("Não é permitido item nulo");
        }
        Node novoNode = new Node(valor);
        System.out.println("nó atual" + novoNode + " / anterior" + topo);
        novoNode.proximo = topo;
        topo = novoNode;
        tamanho++;
    } 

    public Object pop() {
        if(isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        Object valorTopo = topo.valor;
        topo = topo.proximo;
        tamanho--;
        return valorTopo;
    }

    public Object peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return topo.valor;
    }

    public boolean isEmpty(){
        return topo == null;
    }

    public int size(){
        return tamanho;
    }

    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();
        pilha.push("Maçã");
        pilha.push("Banana");
        pilha.push("Uva");
        System.out.println("Conteúdo da pilha");
        System.out.println("Topo: " + pilha.peek());
        System.out.println("Tamanho: " + pilha.size());
        while (!pilha.isEmpty()) {
            System.out.println("Retirando item:" + pilha.pop());
        }
    }
}   

