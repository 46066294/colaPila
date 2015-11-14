import java.util.Scanner;

public class ColaPila {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Elije una opcion");
        System.out.println("---MENU---");
        System.out.println("1) Pila");
        System.out.println("2) Cola");
        System.out.println("----------");

        String opcion = input.nextLine();

        switch (opcion){
            case "1":{
                Pila pila = new Pila();

                pila.apilar();
                pila.desApilar();
                break;
            }

            case "2":{
                Cola cola = new Cola();

                cola.crearCola();
                cola.quitarDeLaCola();
                break;
            }

            default:{
                System.out.println("...opcion incorrecta");
                break;
            }
        }






    }


}
