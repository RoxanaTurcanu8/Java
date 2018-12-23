package model;

import java.util.*;

public class Curs {
    int id;
    String nume;
    String descriere;
    Profesor profesor;
    ArrayList<Student> studenti;
    ArrayList<Integer> note;

    public int compareTo(Curs o) {
        if (this.descriere.equals(o.descriere) && this.nume.equals(o.nume)) {
            if (this.studenti.size() > o.studenti.size()) {
                return 1;
            } else if (this.studenti.size() < o.studenti.size()) {
                return -1;
            } else {
                return 0;
            }
        }

        return (this.nume.equals(o.nume)) ? this.descriere.compareTo(o.descriere)
                : this.nume.compareTo(o.nume);
    }

    public Curs() {
        nume = "";
        descriere = "";
        profesor = new Profesor();
        studenti = new ArrayList();
        note = new ArrayList();

    }

    public Curs(String nume, String descriere) {
        this.nume = nume;
        this.descriere = descriere;
        profesor = new Profesor();
        studenti = new ArrayList();
        note = new ArrayList();

    }
public Curs(int id,String nume, String descriere, Profesor profesor, ArrayList studenti) {
        this.id=id;
        this.nume = nume;
        this.descriere = descriere;
        this.profesor = profesor;
        this.studenti = studenti;
        note = new ArrayList();  //in loc de .length la liste e cu .size

    }
    public Curs(String nume, String descriere, Profesor profesor, ArrayList studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profesor = profesor;
        this.studenti = studenti;
        note = new ArrayList();  //in loc de .length la liste e cu .size

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
            int index = 0;
            for (Student s : studenti) {
                str += "\t" + s; //\t este un artificiu;
                //str += " - Nota Studentului: " + this.note.get(index) + "\n";
                index++;
            }
        } else {
            str += "lipsa";
        }

        return str;

    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
    }

    public void AddStudent(Student s) {

        studenti.add(s);
        this.AddNota(s, 0);
    }

    /*Student[] aux = new Student[this.studenti.length + 1];
        int[] auxnote = new int[studenti.size() + 1];
        System.arraycopy(this.studenti, 0, aux, 0, this.studenti.length);
        System.arraycopy(note, 0, auxnote, 0, this.studenti.size());
        aux[aux.length - 1] = s;
        auxnote[auxnote.length - 1] = 0;
        studenti = aux;
        note = auxnote;*/
    public void RemoveStudent(String numele) {
        int index = 0;
        for (Student n : studenti) {

            if (numele.equals(n.nume)) {
                studenti.remove(index);
                note.remove(index);
            }
            index++;
        }
    }

    /* Student[] aux = new Student[this.studenti.length - 1];
        int[] auxnote = new int[note.length - 1];
        int index = 0;
        for (Student n : studenti) {

            if (numele.equals(n.nume)) {
                System.arraycopy(studenti, 0, aux, 0, index);
                System.arraycopy(note, 0, auxnote, 0, index);
                if (index != studenti.length - 1) {
                    System.arraycopy(studenti, index + 1, aux, index, studenti.length - 1 - index);
                    System.arraycopy(note, index + 1, auxnote, index, studenti.length - 1 - index);
                }
                studenti = new Student[studenti.length - 1];
                note = new int[studenti.length - 1];
                System.arraycopy(aux, 0, studenti, 0, aux.length);
                System.arraycopy(auxnote, 0, note, 0, auxnote.length);
                break;
            }
            index++;
        }*/

    public void RemoveProf() {
        profesor.setNume("");
        profesor.setPrenume("");

    }

    public void AdaugaProf(Profesor p) {
        profesor = p;
    }

    public void ModifStudent(String Numele, String NumeleNou, String Prenume, int grupa) {
        for (Student s : studenti) {
            if (Numele.equals(s.nume)) {
                s.setNume(NumeleNou);
                s.setPrenume(Prenume);
                s.setGrupa(grupa);
            }
        }
    }

    public void AddNota(Student StudentulNotat, int nota) {
        int index = 0;
        for (Student s : studenti) {
            if (s.nume.equals(StudentulNotat.nume)) {
                if (s.prenume.equals(StudentulNotat.prenume)) {
                    this.note.add(index, nota);
                }
            }
        }
        index++;
    }
    
}

/*public void AddNota(Student StudentulNotat, int nota) {
        int index = 0;
        for (Student s : studenti) {
            if (s.nume.equals(StudentulNotat.nume)) {
                if (s.prenume.equals(StudentulNotat.prenume)) {
                    note[index] = nota;

                }
            }
            index++;
        }
    }*/
