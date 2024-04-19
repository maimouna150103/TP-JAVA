/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modele;

/**
 *
 * @author DESKLAPRO
 */
public class dossier_model {
    private int id;
    private String dateCreation ;
    private String nature_Examen;
    private String Date_Examen ;
    private String observation;

    public dossier_model(int codeP) {
    }
    private int codeP;
    
    public dossier_model(String dateCreation1, String nature_Examen1, String date_Examen, String observations, String codeP1) {
    }

    public dossier_model(int id, String dateCreation, String nature_Examen, String Date_Examen, String observation, int codeP) {
        this.id = id;
        this.dateCreation = dateCreation;
        this.nature_Examen = nature_Examen;
        this.Date_Examen = Date_Examen;
        this.observation = observation;
        this.codeP = codeP;
    }

  
      public dossier_model(String dateCreation, String nature_Examen, String Date_Examen, String observation, int codeP) {
        this.dateCreation = dateCreation;
        this.nature_Examen = nature_Examen;
        this.Date_Examen = Date_Examen;
        this.observation = observation;
        this.codeP = codeP;
    }

    public int getId() {
        return id;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public String getNature_Examen() {
        return nature_Examen;
    }

    public String getDate_Examen() {
        return Date_Examen;
    }

    public String getObservation() {
        return observation;
    }

    public int getCodeP() {
        return codeP;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setNature_Examen(String nature_Examen) {
        this.nature_Examen = nature_Examen;
    }

    public void setDate_Examen(String Date_Examen) {
        this.Date_Examen = Date_Examen;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }

    public String dateCreation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String nature_Examen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String Date_Examen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String observation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String codeP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

    

   