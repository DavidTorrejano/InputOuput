public class EjercicioNueve {

    //92: \ -----  34: "

    public static void main(String[] args) {

        Usuario usuario= new Usuario();

        usuario.setUsuario("RobertoDniro");
        usuario.setPassword("Creo que ha funcionado");



        System.out.println(usuario.getUsuario());
        System.out.println(usuario.getPassword());


    }
}


class Usuario{

    private String usuario;
    private String pass;

//-----------------------------------------------------------------------------------------------------------------------

    Password password= new Password(pass);


    //CONSTRUCTOR

    public Usuario(String usuario){
        this.usuario= usuario;
    }

    public Usuario(){}

//-----------------------------------------------------------------------------------------------------------------------

    //MÉTODOS

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //

    public void setPassword(String pass){
        password.codificadorContrasena(pass);
        this.pass= password.toString();
    }

    public Password getPassword() {
        return password;
    }


}





class Password {

    private String passAtr= "";

    public Password(String passAtr){
        this.passAtr= passAtr;
    }


    public void codificadorContrasena(String passMet) {

        String temp= "";

        for(int i = 0; i< passMet.length(); i++){

            int aEntero= passMet.charAt(i);

            if(aEntero%2== 0 && aEntero>=80) {
                aEntero += 10;
            }
            else if(aEntero%2!=0 && aEntero>=80){
                aEntero-=10;
            }
            else if(aEntero>30 && aEntero<40){
                aEntero+=10;
            }
            else if(aEntero<50){
                aEntero-=10;
            }
            else if (aEntero<60) {
                aEntero+=10;
            }
            else {
                aEntero-=10;
            }

            temp+= (char)aEntero;
        }

        this.passAtr = temp;
    }

    @Override
    public String toString() {
        return passAtr;
    }
}