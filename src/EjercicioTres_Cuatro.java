import java.util.Vector;

public class EjercicioTres_Cuatro {

    public static void main(String[] args) {

        // Ejercicio TRES


        Vector <String> ingredientes= new Vector<>();

        ingredientes.add("Pastas");
        ingredientes.add("Queso");
        ingredientes.add("Mayonesa");
        ingredientes.add("Salsa de tomate");
        ingredientes.add("Carne molida");

        ingredientes.remove(1);
        ingredientes.remove(1);

        System.out.println(ingredientes);
        System.out.println("-------------------------------------------");
//----------------------------------------------------------------------------------------------------------------

        // Ejercicio CUATRO


        /* Si dejamos la capacidad por defecto de un vector, la cual es díez,
           cada 10 elementos tendrá que aumentar la capacidad del mismo, lo
           que genera que al momento de pasar de un vector de capacity= 500
           a uno de capacity= 510, se estará ocupando el espacio equivalente
           a 1010 elementos, lo cual podría generar lentitud en el programa.
         */

    }

}
