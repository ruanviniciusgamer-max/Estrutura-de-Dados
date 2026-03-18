import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        double valoresDigitados[] = receberValores;
    }
    

    public static double[] receberValores(){
        Scanner teclado = new Scanner(System.in);
        int qtdevalores;
        System.out.println("Informe quantos valores deseja digitar");
        qtdevalores = teclado.nextInt();
        double valores[] = new double[qtdevalores];
        double numero;
        for (int i = 0; i < qtdevalores; i++){
            System.out.println("Digite o " + (i+1) + "valor:");
            numero = teclado.nextDouble();
            if (i == 0){
                valores[i] numero;
            }else{
                 if (numero >= [i-1]){
                    valores[i] = numero;
                 }else{
                    System.out.println("Digite valor maior que: " + valores[i-1]);
                    i--;
                 }
            }
            return valores;
        }
    } 
}
