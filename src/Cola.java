import java.util.Random;
import java.util.Scanner;

/**
 * Genera una cola de 5 posiciones que trabaja con un array de enteros
 * Dispone de diferentes metodos para trbajar con ella
 */
public class Cola {

    private static int[] vector;

    //constr
    public Cola(){
        vector = new int[5];
    }

    /**
     * Genera la cola, muestra los valores y te dice
     * el valor maximo y minimo que hay en la pila
     * Tambien pide un valor que sera buscado en el vector de enteros
     */
    public static void crearCola(){
        Random rnd = new Random();

        //se crea la cola/Pila con numeros aleatorios
        //y los imprimimos para estudiar su orden
        System.out.println("----COLA----");

        for(int i = 0; i < vector.length; i++){//se crea la cola y/o pila
            vector[i] = rnd.nextInt();
            System.out.println("Elemento " + i + " " + vector[i]);
        }
        valorMinimo();
        valorMaximo();
        buscar();

    }

    /**
     * quita de la cola los enteros segun funcionamiento FIFO
     * (firts in first out)
     */
    public static void quitarDeLaCola(){
        //int indice = vector.length - 1;
        System.out.println("----QUITAR DE LA COLA----:");

        for(int i = 0; i < vector.length; i++){
            //int ultimoElemento = vector.length - indice;
            System.out.println("Elemento " + i + " " + vector[i] + " quitado de la cola");
            vector[i] = 0;
            //vector = new int[indice];
            //indice--;
        }
    }

    /**
     * Informa del valor minimo que hay en la pila
     */
    public static void valorMinimo(){
        int aux = vector[0];

        for(int i = 0; i < vector.length; i++){
            if(aux > vector[i]){
                aux = vector[i];
            }
        }
        System.out.println("Valor MINIMO de la cola: " + aux);
    }

    /**
     * Informa del valor maximo que hay en la pila
     */
    public static void valorMaximo(){
        int aux = vector[0];

        for(int i = 0; i < vector.length; i++){
            if(aux < vector[i]){
                aux = vector[i];
            }
        }
        System.out.println("Valor MAXIMO de la cola: " + aux);
    }

    /**
     * busca un valor entre la pila
     */
    public static void buscar(){
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Valor a buscar:");
        try{
            int valorAbuscar = input.nextInt();

            for(int i = 0; i < vector.length; i++){
                if(valorAbuscar == vector[i]){
                    System.out.println("Valor en posicion " + i + " con valor " + vector[i]);
                    flag = true;
                }
            }

            if(!flag){
                System.out.println("...valor inexistente");
            }

        }catch (Exception e){
            System.out.println("...valor incorrecto\n");
            e.printStackTrace();
        }


    }
}
