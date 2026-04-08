import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        new Exercicio01();
    }

    public Exercicio01() {
        // Agora trabalhamos com um array de Strings
        String[] valoresDigitados = receberValores();
        exibirValores(valoresDigitados);
        
        int pos = procurarValor(valoresDigitados, solicitarValorPesquisa());
        
        if (pos != -1) {
            System.out.println("O produto ja foi encontrado na lista" + pos);
        } else {
            System.out.println("O texto não foi encontrado no vetor.");
        }
    }

    String[] receberValores() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 10 produtos para comprar:");
        int qtdeValores = teclado.nextInt();10
        teclado.nextLine(); // Limpa o buffer do teclado

        String[] valores = new String[qtdeValores];
        
        for (int i = 0; i < qtdeValores; i++) {
            System.out.println("Digite o " + (i + 1) + "º texto:");
            String texto = teclado.nextLine();

            if (i == 0) {
                valores[i] = texto;
            } else {
                // compareTo retorna > 0 se o texto for "maior" alfabeticamente
                if (texto.compareTo(valores[i - 1]) >= 0) {
                    valores[i] = texto;
                } else {
                    System.out.println("Digite um texto que venha após (ou igual) a: " + valores[i - 1]);
                    i--; // Repete a iteração para garantir a ordem
                }
            }
        }
        return valores;
    }

    void exibirValores(String[] valores) {
        System.out.println("\nTextos digitados:");
        for (String s : valores) {
            System.out.print(s + " || ");
        }
        System.out.println("\n");
    }

    String solicitarValorPesquisa() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o texto que deseja pesquisar: ");
        return teclado.nextLine();
    }

    int procurarValor(String[] vetor, String valor) {
        int limiteInferior = 0;
        int limiteSuperior = vetor.length - 1;
        int meio;

        while (limiteInferior <= limiteSuperior) {
            meio = (limiteInferior + limiteSuperior) / 2;
            
            // Compara o valor buscado com o valor no meio do array
            int comparacao = valor.compareTo(vetor[meio]);

            if (comparacao == 0) { // Encontrou (são iguais)
                return meio;
            } else if (comparacao < 0) { // O valor buscado vem antes alfabeticamente
                limiteSuperior = meio - 1;
            } else { // O valor buscado vem depois
                limiteInferior = meio + 1;
            }
        }
        return -1;
    }
}