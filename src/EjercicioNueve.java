
public class EjercicioNueve {


    public static void main(String[] args) {


        String pass= codificadorContrasena("Un texto de prueba");
        System.out.println(pass);

        String reverPass= decodificadorContrasena(pass);
        System.out.println(reverPass);




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

}

