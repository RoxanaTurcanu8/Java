package demo;

import model.*;

public class Main 
{
    
    public static void main(String args[]){
            ManagerCursuri m = new ManagerCursuri();
             m.AfiseazaToateCursurile();
             
         
             System.out.println("ADAUGARE STUDENT => ");
             m.cursuri[0].AddStudent(new Student("Turcanu", "Roxana", 4));
             m.AfiseazaToateCursurile();
             System.out.println("===================================");
             
             System.out.println("STERGERE STUDENT => " );
             m.cursuri[1].RemoveStudent("Zaharia");
             m.AfiseazaToateCursurile();
             System.out.println("===================================");
             
             System.out.println("STERGERE PROF => ");
             m.cursuri[1].RemoveProf();
             System.out.println("ADAUGARE PROF => ");
             m.cursuri[0].AdaugaProf(new Profesor("Iosub", "Alexandru"));
             m.AfiseazaToateCursurile();
             System.out.println("===================================");
             
             System.out.println("MODIF CURS => ");
             m.ModifCurs("POO", "PCLP I", "C++");
             System.out.println("STERGERE STUDENT => ");
             m.cursuri[2].ModifStudent("C", "Cazacu", "Dumitru", 2);
             m.AfiseazaToateCursurile();
             System.out.println("===================================");
             
             System.out.println("AFISARE STUDENTII DE LA UN CURS(ex PCLP I) => ");
             m.StudentiiLaCurs("PCLP I");
             
             System.out.println("===================================");
             System.out.println("AFISARE CURSURI CURENTE => ");
             m.AfisCursuri();
         
            
    }

}
