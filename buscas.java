public class buscas {

    public static void main(String[] args) {
        //Busca Sequencial
        double[] vetorDesordenado = {4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5};
        int pos = buscaSequencial(vetorDesordenado, 2.4);
        System.out.println("Localizado na posição (indice): " + pos);
    }

    public static int buscaSequencial(double[] vetor, double valorPesquisado){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == valorPesquisado){
                return i;
            }
        }
        return -1;
    }
    
}
