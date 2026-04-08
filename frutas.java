public class frutas {

    public static void main(String[] args) {
        String frutas1 = "morango";
        String frutas2 = "melão";

        if(frutas1.compareTo(frutas2) > 0){
            System.out.println(frutas1);
        }else{
            System.out.println(frutas2);
        }
        
        if(frutas1.equals(frutas2)) {
            System.out.println("frutas iguais");
        }else{
            System.out.println("frutas diferentes");
        }

        if(frutas1.equalsIgnoreCase("morango")) {
            System.out.println("frutas iguais");
        }else{
            System.out.println("frutas diferentes");
        }


        char a = "C";
        char b = 'a';
    }
    
}