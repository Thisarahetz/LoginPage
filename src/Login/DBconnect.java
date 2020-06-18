/*
 * To change this license header, choose License Headers in Project Properties.
 * To change thishjgdgcngc template file, choose Tools | Templates
 * and open the temp fdgbdf  late in the editor.
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Thisara
 */
public class DBconnect {
    public Connection Connect(){
        
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root","");
            String sqlm = "Select * from logindatabase where username=? and password=?";
            preparedStatatement pst = con.prepareStatement(sqlm);
        }catch (Exception e){
            System.out.println(e);
        }
        return con;
    }
    
}
