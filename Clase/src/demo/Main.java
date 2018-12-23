package demo;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import model.*;

public class Main {

    public static void main(String args[]) {
        try {
            ManagerCursCSV m = new ManagerCursCSV();
			m.CitesteDateDinFisiere();
                        
                        m.lista.get(1).AddStudent(new Student(3, "bla", "bla", 0));
                        //m.lista.add(e)
                                        
                        
                        m.ScrieDatedInFisier();
                        m.AfiseazaTot();
                        
            

        } catch (Exception ex) {
            System.out.println(ex);
        }
         
        /*Inainte de citirea din fisiere:
        ManagerCursMock m = new ManagerCursMock();
        m.Update(new Curs("Java", "programare"), "dec");
            System.out.println("=================================");
            m.Delete("Java");
            m.Search(new Curs("matematici speciale", "serii fourier", new Profesor("D", "F"), null));
            ((Curs) m.getLista().get(0)).AddStudent(new Student("Turcanu", "Roxana", 2));
            ((Curs) m.getLista().get(0)).AddNota(((Curs) m.getLista().get(0)).getStudenti().get(0), 10);
            ((Curs)m.getLista().get(0)).AdaugaProf(new Profesor("Ionel", "Popescu"));
            m.Search(new Curs("Modele Spice","circuite"));
            m.AfiseazaTot();*/
        
    }

}
