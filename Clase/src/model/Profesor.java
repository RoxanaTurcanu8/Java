package model;

public class Profesor extends Persoana {
    
    public Profesor(){
    }
    

    public Profesor(String nume, String prenume) {
        super(nume, prenume);
    }

        

    @Override
	public String toString() {
		return  "Profesor{" + super.toString();
	}

	
}
