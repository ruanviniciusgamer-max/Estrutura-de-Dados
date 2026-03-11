public class vetor{

    public static void main(String[] args){
        new vetor(); //vetor programa = new vetor();
        System.out.println("Rodou!!!!!!");

    }

    public vetor(){
        double a[] = {10, 20, 30, 4.3, 3.2, -1, -2};
        String msg = "Vetor de valores reais";
        visualizaVetor(msg, a);
    }

    public void visualizaVetor(String mensagem, double vet[]){
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " || ");
        }

    }
}