/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sweetbank;
import java.sql.*;

/**
 *
 * @author davidmunro
 */
public class login {
    private Connection con;
    private Statement stat;
    private ResultSet res;
    private SignUpScreen sign;
    
    
    public login(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sweetBank", "root", "root");
            stat = con.createStatement();
            
            
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    
    public void getData(){
        try{
        res = stat.executeQuery("select * from user");
        System.out.println(res.getMetaData().getColumnName(2));
        }catch(Exception e){
           System.out.print(e); 
        }
    }
    
    public void addData(String str){
        try{
            res = stat.executeQuery("insert into fName values (`"+str+"`)");
        }catch(Exception ee){
            System.out.println(ee);
        }
    }
    
}
