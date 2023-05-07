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

        ArrayList <Integer> listaNumeros= new ArrayList<>();



        for(int i=0; i<=10; i++){ // si el límitie introducido es impar, devolverá hasta el último anterior a ese
            listaNumeros.add(i+1);

            int posList= listaNumeros.size()-1;

            if(listaNumeros.get(posList)%2== 0){
                listaNumeros.remove(posList);
                continue;
            }

            if(posList>0) System.out.print(listaNumeros.get(posList-1) + " ");

        }


    }
}
