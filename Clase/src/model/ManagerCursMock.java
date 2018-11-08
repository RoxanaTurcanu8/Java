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
public class ManagerCursMock extends ManagerCursuri implements IOperatiiManagerCurs {
//extends e inainte de interfete pt ca pot pune dupa cate interfete vreau;

    public ManagerCursMock() {
        Add(new Curs());
        Add(new Curs("matemtici speciale", "serii fourier, tr fourier", new Profesor("A", "B"),
                new Student[]{
                    new Student("gh", "A", 2),
                    new Student("gdgs", "C", 3)}));
                            
        Add(new Curs("del", "disp circ", new Profesor("S", "P"),
                new Student[]{
                    new Student("ion", "A", 2),
                    new Student("bla", "C", 3)

                }));
    }

    @Override
    public void Add(Curs c) {
        Curs[] aux = new Curs[cursuri.length + 1];
        System.arraycopy(cursuri, 0, aux, 0, cursuri.length);
        aux[aux.length - 1] = c;
        cursuri = aux;
    }

    @Override
    public void Delete(Curs c) {
        Curs[] aux = new Curs[this.cursuri.length - 1];
        int index = 0;
        for (Curs cr : cursuri) {

            if (cr.nume.equals(c.nume)) {
                System.arraycopy(cursuri, 0, aux, 0, index);
                if (index != cursuri.length - 1) {
                    System.arraycopy(cursuri, index + 1, aux, index, cursuri.length - 1 - index);
                }
                cursuri = new Curs[cursuri.length - 1];
                System.arraycopy(aux, 0, cursuri, 0, aux.length);
                break;
            }
            index++;
        }

    }

    public void Update(Curs c, String NumeVechi) {
        int index = 0;
        for (Curs curs : cursuri) {
            if (NumeVechi.equals(curs.nume)) {
                cursuri[index] = c;
                break;
            }
            index++;
        }
    }

    @Override
    public void Search(Curs c) {
       int index=0;
        for(Curs cr:cursuri)
        {
            if(cr.nume.equals(c.nume))
            {    
               System.out.println("Cursul s-a gasit pe pozitia: "+index);
            }
           index++;
        }
         
    }

}
