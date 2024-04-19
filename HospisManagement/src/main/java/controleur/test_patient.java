/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import Dao.connexionBase;
import modele.patient_model;

/**
 *
 * @author DESKLAPRO
 */
public class test_patient {
     public static void main(String[]args){
        connexionBase  cb=new connexionBase();
            cb.connect();
           
         patient_model p=new patient_model(7,"MAYNA","sene²","17","Feminin","rufisque");
        
         patient_Actions T=new patient_Actions();
         T.patient_add(p);
}
