package model;

public class Curs {

    String nume;
    String descriere;
    Profesor profesor;
    /* private */ Student[] studenti;

    public Curs() {
        nume = "";
        descriere = "";
        profesor = new Profesor();
        studenti = new Student[0];

    }

    public Curs(String nume, String descriere, Profesor profesor,
            Student[] studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profesor = profesor;
        this.studenti = studenti;

    }

    public void setNume(String nume) {

        this.nume = nume;
    }

    public String getNume() {

        return nume;
    }

    public void setDescriere(String descriere) {

        this.descriere = descriere;
    }

    public String getDescriere() {

        return descriere;
    }

    @Override
    public String toString() { //pt a afisa. daca nu folosesc tostrng imi afiseaza id-ul/hashcodul
        String str = "";
        str += "Nume Curs: " + this.nume + System.lineSeparator();
        str += "Descriere " + this.descriere + System.lineSeparator();
        str += "Profesor " + this.profesor + "\n";
        str += "Studenti :\n";
        if (studenti != null) {
            for (Student s : studenti) {
                str += "\t" + s + "\n"; //\t este un artificiu;
            }
        } else {
            str += "lipsa";
        }

        return str;
    }

    public Student[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Student[] studenti) {
        this.studenti = studenti;
    }

    public void AddStudent(Student s) {

        Student[] aux = new Student[this.studenti.length + 1];
        System.arraycopy(this.studenti, 0, aux, 0, this.studenti.length);
        aux[aux.length - 1] = s;
        studenti = aux;
    }

    public void RemoveStudent(String numele) {
        Student[] aux = new Student[this.studenti.length - 1];
        int index = 0;
        for (Student n : studenti) {

            if (numele.equals(n.nume)) {
                System.arraycopy(studenti, 0, aux, 0, index);
                if (index != studenti.length - 1) {
                    System.arraycopy(studenti, index + 1, aux, index, studenti.length - 1 - index);
                }
                studenti = new Student[studenti.length - 1];
                System.arraycopy(aux, 0, studenti, 0, aux.length);
                break;
            }
            index++;
        }

    }

    public void RemoveProf() {
        profesor.setNume("");
        profesor.setPrenume("");

    }
    public void AdaugaProf(Profesor p) {
        profesor=p;
    }
    
    public void ModifStudent(String Numele, String NumeleNou,String Prenume, int grupa)
    {
        for(Student s :studenti)
        {
            if(Numele.equals(s.nume))
            {
                s.setNume(NumeleNou);
                s.setPrenume(Prenume);
                s.setGrupa(grupa);
            }
        }
    }
    
    
   
}
