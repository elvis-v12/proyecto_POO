package SoftwareMatricula.config;
import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConexiónBBDD {
    Connection con;
    public ConexiónBBDD(){
        try{
            Class.forName("com.mysql.jbdc.Driver");
            con=DriverManager.getConnection("jbdc:mysql://localhost:3306/registrolab","root","12345678");
        } catch (Exception e) {
            System.err.println("Error: "+e);
        }
    }
    public static void main (String[] args){
    ConexiónBBDD cn= new ConexiónBBDD();
    Statement st;
    ResultSet rs;
    try{
        st=cn.con.createStatement();
        rs=st.executeQuery("Select * from usuario");
        while (rs.next()){
            System.out.println(rs.getInt("id")+" "+rs.getString("user")+" "+rs.getString("dni"));
        }
        cn.con.close();
    } catch (Exception e){
    }
}
}
