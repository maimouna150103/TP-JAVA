/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DESKLAPRO
 */
public class connexionBase {
       public Connection co=null;
    public Statement st=null;
    public void connect (){
        try {
            //1. Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connexionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //2.SELECTION DE LA BASE DE DONNEES
         co=   DriverManager.getConnection("jdbc:mysql://localhost/basemvc","root","");
        } catch (SQLException ex) {
            Logger.getLogger(connexionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //3.CREATION DU STATEMENT
           st=  co.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(connexionBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
