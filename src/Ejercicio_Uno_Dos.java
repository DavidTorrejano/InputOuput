public class Ejercicio_Uno_Dos {

    public static void main(String[] args) {

//--------------------------------------------------------------------------------------------//

        // Ejercicio UNO


        String [] nombres= new String[5];

        nombres[0]= "Mateo";
        nombres[1]= "Camila";
        nombres[2]= "Juliana";
        nombres[3]= "Rodolfo";
        nombres[4]= "Andrea";

        for(String n: nombres){
            System.out.println(n);
        }

//------------------------------------------------------------------------------------------//

        // Ejercicio DOS

        int [][] enteros= new int[3][5];

        int num= 5;

        // Usando for, rellenamos el array e inmediatamente vamos imprimiendo el valor asignado

        for(int i=0; i<enteros.length; i++){
            for(int j=0; j<enteros[i].length; j++){
                enteros[i][j]= num;
                System.out.print(enteros[i][j] + " ");
                num+= 5;
            }
            System.out.println();
        }




    }

}
