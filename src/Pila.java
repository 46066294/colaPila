import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicios Clases Genéricas
 1. Crear una pila y cola , además de las siguientes funciones:
 ? Calcular el elemento mínimo de un array;
 ? Calcular el elemento máximo de un array;
 ? Buscar un Objeto en un array, devolviendo la posición de la primera aparición del Objeto en el array o -1 si no existe.
 2. Crear una pila y cola genéricas.
 */
public class Pila {

    private static int[] vector;

    //constr
    public Pila(){
        vector = new int[5];
    }

    public static void apilar(){
        Random rnd = new Random();

        //se crea la cola/Pila con numeros aleatorios
        //y los imprimimos para estudiar su orden
        System.out.println("----PILA----");
        for(int i = 0; i < vector.length; i++){//se crea la cola y/o pila
            vector[i] = rnd.nextInt();
            System.out.println("Elemento " + i + " " + vector[i]);
        }
        valorMinimo();
        valorMaximo();
        buscar();

    }

    public static void desApilar(){
        int indice = vector.length - 1;
        System.out.println("----DESAPILAR----:");

        for(int i = 0; i < vector.length; i++){
            //int ultimoElemento = vector.length - indice;
            System.out.println("Elemento " + i + " " + vector[indice] + " desapilado");
            vector[indice] = 0;
            //vector = new int[indice];
            indice--;
        }
    }

    public static void valorMinimo(){
        int aux = vector[0];

        for(int i = 0; i < vector.length; i++){
            if(aux > vector[i]){
                aux = vector[i];
            }
        }
        System.out.println("Valor MINIMO de la pila: " + aux);
    }

    public static void valorMaximo(){
        int aux = vector[0];

        for(int i = 0; i < vector.length; i++){
            if(aux < vector[i]){
                aux = vector[i];
            }
        }
        System.out.println("Valor MAXIMO de la pila: " + aux);
    }

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

