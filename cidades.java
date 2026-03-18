import java.util.ArrayList;

public class cidades {

    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<String>();
        cidades.add("Santos");
        cidades.add("Ribeirão Preto");
        cidades.add("Campinas");
        cidades.add("Brasília");
        cidades.add("Belo Horizonte");
        System.out.println(cidades);
        System.out.println(cidades.get(2));



        System.out.println(cidades);

        cidades.remove(1);
        System.out.println(cidades);

        System.out.println("Número de cidades: " + cidades.size());

        System.out.println("Lista de cidades com laço FOR");
        for(int i = 0; i < cidades.size(); i++){
            System.out.println(cidades.get(i));
        }

        System.out.println("Lista de cidades com laço For-Each");
        for (String cidade : cidades){
            System.out.println(cidade);
        }

    }
    
}
