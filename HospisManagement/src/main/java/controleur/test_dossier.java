/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import Dao.connexionBase;
import modele.dossier_model;
import modele.patient_model;

/**
 *
 * @author DESKLAPRO
 */
public class test_dossier {
    public static void main(String[]args){
        connexionBase  cb=new connexionBase();
            cb.connect();
           
         dossier_model p=new dossier_model(7,"DECEMBRE","LIVRE²","JANVIER","Feminin","MOI");
        
         Dossier_Actions T=new Dossier_Actions();
         T.dossier_add(p);
}
