public class maximo {
    
    public static void main(String[] args) {
        new maximo();
    }

    public maximo() {
        int a[] = {12, 11, 21, 89, 99, 45, 89, 12, 24, 6, 70, 1002, 999, 987};
        System.out.println("Maior dos valores de 1: " + maximoIterativo(a));
    }

    public int maximoRecursivo(int vet[], int inicio, int fim, int nivel) {
        if(inicio == fim) return vet[inicio];
        int meio = (inicio + fim) / 2;
        int a = maximoRecursivo(vet, inicio, meio, ++nivel);
        int b = maximoRecursivo(vet, meio+1, fim, nivel);
        System.out.println("Nivel " + nivel + ": " + a + "> " + b);
        return ((a>b ? a:b));
    }


    public int maximoIterativo (int vet[]) {
        int max = vet[0];
        for(int i = 1; i < vet.length; i++) {
            if (vet [i] > max) max = vet [i];
        }
        return max;
    }
}