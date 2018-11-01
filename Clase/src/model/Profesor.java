package model;

public class Profesor {
	String nume;
	String prenume;
    
	public Profesor()
	{
            nume="";
            prenume="";
        
	}
	
	public Profesor(String nume, String prenume) {
		this.nume = nume;
		this.prenume = prenume;

	}

	public String toString() {

		return "Profesor{" + " nume=" + nume + " prenume=" + prenume + "}";
	}

	public void setNume(String nume) {

		this.nume = nume;
	}

	public void setPrenume(String prenume) {

		this.prenume = prenume;
	}

	public String getNume() {

		return nume;
	}

	public String getPrenume() {

		return prenume;
	}
}
