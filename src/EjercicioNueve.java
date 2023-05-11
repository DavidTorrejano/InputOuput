import java.io.*;
import java.util.LinkedList;


public class EjercicioNueve {


    public static void main(String[] args) {


        crearUsuarioContrasena("Armani", "Lorenaesmiamiga");


        LinkedList<String> usuario= new LinkedList<>();
        lectorUsuarios(usuario);



        System.out.println(usuario.get(0));
        System.out.println(usuario.get(3));



    }

    public static String codificadorContrasena(String passMet) {

        StringBuilder temp= new StringBuilder();

        for(int i = 0; i< passMet.length(); i++){

            int aEntero= passMet.charAt(i);

            if(aEntero>10 && aEntero<20){
                aEntero+= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<30){
                aEntero-= 10;
                temp.append((char)aEntero);
            }
            else if(aEntero<40){
                aEntero+= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<50){
                aEntero-= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<60){
                aEntero-= 10;
                temp.append((char)aEntero);
            }
            else if(aEntero<70){
                aEntero+= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<80){
                aEntero-= 10;
                temp.append((char)aEntero);
            }
            else if(aEntero<90){
                aEntero+= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<100){
                aEntero-= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<110){
                aEntero-= 10;
                temp.append((char)aEntero);
            }
            else if(aEntero%2== 0 && aEntero>=110){
                aEntero+=10;
                temp.append((char)aEntero);
            }
            else if(aEntero%2!= 0 && aEntero>=110){
                aEntero+=12;
                temp.append((char)aEntero);
            }


        }

        return temp.toString();
    }

    //     REVERTIMOS CODIFICACIÓN

    public static String decodificadorContrasena(String passMet) {

        StringBuilder temp= new StringBuilder();

        for(int i = 0; i< passMet.length(); i++){

            int aEntero= passMet.charAt(i);

            if(aEntero>10 && aEntero<20){
                aEntero+=10;
                temp.append((char)aEntero);
            }
            else if(aEntero<30){
                aEntero+= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<40){
                aEntero-= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<50){
                aEntero+= 10;
                temp.append((char)aEntero);
            }
            else if(aEntero<60){
                aEntero-= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<70){
                aEntero+= 10;
                temp.append((char)aEntero);
            }
            else if(aEntero<80){
                aEntero+= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<90){
                aEntero-= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero<100){
                aEntero+= 10;
                temp.append((char)aEntero);
            }
            else if(aEntero<110){
                aEntero-= 20;
                temp.append((char)aEntero);
            }
            else if(aEntero%2== 0 && aEntero>=120){
                aEntero-=10;
                temp.append((char)aEntero);
            }
            else if(aEntero%2!= 0 && aEntero>=123){
                aEntero-=12;
                temp.append((char)aEntero);
            }
        }

        return temp.toString();
    }


    public static void crearUsuarioContrasena(String nUser, String passUser){

        String usuario= nUser + '±';
        String contra= passUser + '±';


        try {
            FileWriter outUser= new FileWriter("src/persona.txt", true);
            outUser.write(nUser);

            FileWriter outPass= new FileWriter("src/passw.txt", true);
            outPass.write(passUser);

            outUser.close();
            outPass.close();
        }catch (IOException e){
            System.out.println("Error malito " + e);
        }

    }

    public static void lectorUsuarios(LinkedList <String> usuarios){


        try{
            FileReader usEn= new FileReader("src/persona.txt");

            int almacen= 0;
            StringBuilder user= new StringBuilder();


            do {
                almacen= usEn.read();

                if(almacen==(int)'±'){
                    usuarios.add(user.toString());
                    user.delete(0,user.length());
                    continue;
                }
                user.append((char)almacen);
            }while(almacen!=-1);

            usEn.close();

        }catch (FileNotFoundException e){
            System.out.println("no encontrado" + e);
        }catch (IOException e){
            System.out.println("No sé qué ha pasado, pero no está bien " + e);
        }

    }

}

