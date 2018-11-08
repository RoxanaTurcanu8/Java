package model;

/**
 *
 */

public class Student extends Persoana {

    int grupa;

    public Student() {
        super("","");
    }

    public Student(String nume, String prenume, int grupa) {
        super(nume,prenume);
        this.grupa = grupa;

    }

    public int getGrupa() {

        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;

    }

    @Override
    public String toString() {
        return "Student{" + "nume=" + nume + ", prenume=" + prenume + ", grupa="
                + grupa + '}';
    }

}
