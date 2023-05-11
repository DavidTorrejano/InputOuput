import java.io.*;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;


public class EjercicioNueve {


    public static void main(String[] args) {


        String user;
        String pass;
        int sel= 0;
        LinkedList<String> usuario= new LinkedList<>();
        LinkedList <String> contrasena= new LinkedList<>();



        do{
            boolean indi= false;
            int iterador= 0;
            System.out.println();
            System.out.println("Por favor seleccione una opción: " +
                    "\n1. Crear un nuevo usuario." +
                    "\n2. Mostrar usuario y contraseña \"encriptada\"." +
                    "\n3. Mostrar usuario y contraseña introducida." +
                    "\n4. Salir del programa.");

            Scanner entrada= new Scanner(System.in);
            lectorUsuarios(usuario);
            lectorContrasena(contrasena);
            try {
                sel = entrada.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Debe introducir un número del 1 al 4: ");
                continue;
            }
            switch (sel){
                case 1:
                    entrada.nextLine();
                    System.out.println("Por favor introduzca el nombre: ");
                    user= entrada.nextLine();
                    for(int i=0; i<usuario.size(); i++){
                        if(user.equalsIgnoreCase(usuario.get(i))){
                            indi= true;
                            break;
                        }
                    }
                    if(indi){
                        System.out.println("El usuario ya existe, seleccione opción dos para verlo.");
                    }else{
                        System.out.println("Por favor introduzca la contraseña");
                        pass= codificadorContrasena(entrada.nextLine());
                        crearUsuarioContrasena(user, pass);
                    }
                    continue;

                case 2:
                    System.out.println("Por favor introduzca el usuario a buscar");
                    entrada.nextLine();
                    user= entrada.nextLine();
                    for(int i=0; i<usuario.size(); i++){
                        if(user.equalsIgnoreCase(usuario.get(i))){
                            indi= true;
                            iterador= i;
                            break;
                        }
                    }
                    if(indi){
                        System.out.print("Usuario: " + usuario.get(iterador));
                        System.out.println("// Contraseña: " + contrasena.get(iterador));
                    }else System.out.println("El usuario no exite, por favor cree uno nuevo.");
                    continue;

                case 3:
                    System.out.println("Por favor introduzca el usuario: ");
                    entrada.nextLine();
                    user= entrada.nextLine();
                    for(int i=0; i<usuario.size(); i++){
                        if(user.equalsIgnoreCase(usuario.get(i))){
                            indi= true;
                            iterador= i;
                            break;
                        }
                    }
                    if(indi){
                        System.out.print("Usuario: " + usuario.get(iterador));
                        System.out.println("// Contraseña: " + decodificadorContrasena(contrasena.get(iterador)));
                    }else System.out.println("El usuario no exite, por favor cree uno nuevo.");
                    continue;

                case 4: break;
            }
        }while(sel!=4);



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
            outUser.write(usuario);

            FileWriter outPass= new FileWriter("src/passw.txt", true);
            outPass.write(contra);

            outUser.close();
            outPass.close();
        }catch (IOException e){
            System.out.println("Error malito " + e);
        }

    }


    public static void lectorUsuarios(LinkedList <String> usuarios){


        try{
            FileReader usEn= new FileReader("src/persona.txt");

            int almacen;
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


    public static void lectorContrasena(LinkedList <String> contra){


        try{
            FileReader usEn= new FileReader("src/passw.txt");

            int almacen;
            StringBuilder user= new StringBuilder();


            do {
                almacen= usEn.read();

                if(almacen==(int)'±'){
                    contra.add(user.toString());
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

