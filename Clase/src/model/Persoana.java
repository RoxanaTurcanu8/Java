/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Roxy
 */
public class Persoana {
    String nume;
    String prenume;
    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
    public Persoana()
    {
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    

        
    @Override
    public String toString()
    {
        return  "Persoana{" + "nume=" + nume + ", prenume=" + prenume + '}';
        
    }

    
}
