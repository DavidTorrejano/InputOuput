import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio_Cinco_Seis {

    public static void main(String[] args) {

        ArrayList<String> marcaZapato= new ArrayList<>();

        marcaZapato.add("Nike");
        marcaZapato.add("Adidas");
        marcaZapato.add("Rebook");
        marcaZapato.add("New Balance");

        LinkedList <String> marcas= new LinkedList<>(marcaZapato);

        for(String a: marcaZapato){
            System.out.println(a);
        }

        System.out.println();

        for(String a: marcas){
            System.out.println(a);
        }
        System.out.println();

//----------------------------------------------------------------------------------------------------------------

        ArrayList <Integer> listaNumeros= new ArrayList<Integer>();



        for(int i=0; i<=30; i++){
            listaNumeros.add(i+1);

            int lar= listaNumeros.size();

            if(listaNumeros.get(lar-1)%2== 0){
                listaNumeros.remove(lar-1);
                continue;
            }

            if(lar>1) System.out.print(listaNumeros.get(lar-2) + " ");

        }


    }
}
