
package SofwareMatricula.login;


public class AlumnoLogin {
    //Atributos
    private String Correo;
    private String Password;
    //Costructor
    public AlumnoLogin(String Correo,String Password){
        this.Correo=Correo;
        this.Password=Password;
        
    }
    
    //Meotodos Get and Set

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
