import java.io.*;

public class Ejercicio_Siete_Ocho {


    public static void main(String[] args) {

        //Ejercicio SIETE

        try {
            DividePorCero(10, 5);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse" + e);
        }finally {
            System.out.println("Demo de código");
        }

        trascripcion("src/origen.txt", "src/destino.txt");


    }

    // Ejercicio SIETE

    public static void DividePorCero(int num1, int num2)throws ArithmeticException{

        int resul= num1/num2;
        System.out.println(resul);

    }

//---------------------------------------------------------------------------------------------------------------------------------------

    // Ejercicio OCHO

    public static void trascripcion(String filein, String fileout){

        try {
            InputStream entrada= new FileInputStream(filein);
            BufferedInputStream almacen= new BufferedInputStream(entrada);

            PrintStream salida= new PrintStream(fileout);

            int letra= almacen.read();

            while(letra!=-1){
                salida.print((char)letra);
                letra= almacen.read();
            }
            salida.close();

        }catch (FileNotFoundException e){
            System.out.println("No se encotró el archivo.");
        }catch (IOException e){
            System.out.println("Ups, algo salió mal");
        }



    }

}
