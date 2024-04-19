/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import Dao.connexionBase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.dossier_model;
import modele.patient_model;

/**
 *
 * @author DESKLAPRO
 */
public class Dossier_Actions {
    public void dossier_add(dossier_model d){
        try {
            connexionBase cb=new connexionBase ();
            cb.connect();
            
            String rep="insert into(id, dateCreation, nature_Examen, Date_Examen, observation, codeP)values(('"+d.getId()+"','"+d.getDateCreation()+"','"+d.getNature_Examen()+"','"+d.getDate_Examen()+"','"+d.getObservation()+"','"+d.getCodeP()+"' )";
//EXECUTER

cb.st.executeUpdate(rep);
JOptionPane.showMessageDialog(null,"Enregistrement effectuer avec succes");
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
    //MODIFIER
     
     public void dossier_update(dossier_model d){
        try {
            //ajouter
            connexionBase cb=new connexionBase();
            cb.connect();
            //requete
            String rep="update dossier set dateCreation='"+d.dateCreation()+"',nature_Examen='"+d.nature_Examen()+"',Date_Examen='"+d.Date_Examen()+"',observation='"+d.observation()+"',codeP='"+d.codeP()+"'where id='"+d.getId()+"'";
            
//EXCUTER
cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }

            }
            //SUPPRIMER
            public void dossier_DEl (patient_model p){
                
        try {
            connexionBase cb=new connexionBase();
            cb.connect();
            String id = null;
            
            
            
            
            String rep="'delete from patient where id ='"+id+"'";
            
            //EXECUTER
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            
            
            //rechercher
            public dossier_model dossier_find(int id){
        try {
            dossier_model d=null;
            connexionBase cb=new connexionBase();
            cb.connect();
            //REQUETE
            
            String rep="Select*from dossier where id='"+id+"'";
            //EXECUTER
            cb.st.executeQuery(rep);
            
            
            return d;
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
            }
            //LISTER
            public ResultSet dossier_liste(){
        
        try {
            ResultSet rs=null;
            //se connecter
            connexionBase cb=new connexionBase();
            cb.connect();
            //requete SQL
            String rep="select*from dossier_model";
            //executer
            cb.st.executeQuery(rep);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(Dossier_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
            
            }

    
    
    
}