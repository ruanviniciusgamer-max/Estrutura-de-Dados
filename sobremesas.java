import java.util.ArrayList;

public class sobremesas {

    public static void main(String[] args) {
        ArrayList<String> sobremesas = new ArrayList<String>();
        sobremesas.add("pudim");
        sobremesas.add("brigadeiro");
        sobremesas.add("sorvete");
        System.out.println(sobremesas);
        sobremesas.add(0, "bolo de chocolate");
        System.out.println(sobremesas);
        System.out.println(sobremesas.get(2));
        sobremesas.set(2, "mouse de limão");
        System.out.println(sobremesas);
    }
}