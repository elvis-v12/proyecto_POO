
package SofwareMatricula.login;

public class AdminstradorLogin {
    //Atributos
    private String Correo;
    private String password;
    //Constructor
    public AdminstradorLogin(String Correo, String password) {
        this.Correo = Correo;
        this.password = password;
    }
    //MetodosGeter and Seter
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}
