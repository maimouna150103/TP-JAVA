/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import Dao.connexionBase;
import com.mysql.cj.xdevapi.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.patient_model;

/**
 *
 * @author DESKLAPRO
 */
public class patient_Actions {
     //AJOUTER PATIENT
    
    public void patient_add(patient_model p){
        try {
            connexionBase cb=new connexionBase ();
            cb.connect();
            
            //requete
            String rep="insert into patient(codeP, prenom,nom,age, sexe, adresse) values(('"+p.getCodeP()+"','"+p.getPrenom()+"','"+p.getNom()+"','"+p.getAge()+"','"+p.getSexe()+"','"+p.getAdresse()+"')";
            //EXECUTER
            cb.st.executeUpdate(rep);
            JOptionPane.showMessageDialog(null,"Enregistrement effectuer avec succes");
        } catch (SQLException ex) {
            Logger.getLogger(patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   
  

//modifier
            public void patient_update(patient_model p){
        try {
            //ajouter
            connexionBase cb=new connexionBase();
            cb.connect();
            
            String rep="update patient set prenom='"+p.getPrenom()+"',age='"+p.getAge()+"',sexe='"+p.getSexe()+"'where codeP='"+p.getCodeP()+"'";
            //executer
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
           
            }
            //SUPPRIMER
            public void patient_DEl (patient_model p){
                
        try {
            connexionBase cb=new connexionBase();
            cb.connect();
            String codeP = null;
            
            
            
            
            String rep="'delete from patient where codeP ='"+codeP+"'";
            //EXECUTER
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            
            
            //rechercher
            public patient_model patient_find(int codeP){
                patient_model p=null;
  
          connexionBase cb=new connexionBase();
            cb.connect();
            //REQUETE
            String rep="Select*from patient where codeP='"+codeP+"'";
            try {
                //EXECUTER
                cb.st.executeQuery(rep);
            } catch (SQLException ex) {
                Logger.getLogger(patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
            }
         
             
       return p;
           }    
            //LISTER
            public ResultSet patient_liste(){
        
        try {
            ResultSet rs=null;
            //se connecter
            connexionBase cb=new connexionBase();
            cb.connect();
            //requete SQL
            String rep="select*from patient_model";
            //executer
            cb.st.executeQuery(rep);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
            
            }
        }
           
            
            
