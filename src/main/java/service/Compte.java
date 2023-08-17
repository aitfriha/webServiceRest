package service;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    private Long code;
    private double solde;
    private Date dateCreation;
    public Compte() {

    }
    public Compte(Long code,double solde,Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

	public void setCode(Long code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    //GET THE CODE 
    public Long getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }
}
