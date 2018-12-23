/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Roxy
 */
public class ManagerCursMock extends Manager<Curs> implements IOperatiiManagerCurs {
//extends e inainte de interfete pt ca pot pune dupa cate interfete vreau;

    public boolean Register(Student s, Curs c) {
        return true;
    }

    public boolean UnRegister(Student s, Curs c) {
        return true;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList<Curs> lista) {
        this.lista = lista;
    }

    public ManagerCursMock() {
        //instantierea sirului va avea loc aici
        this.lista = new ArrayList<Curs>();
        Add(new Curs());
        Add(new Curs("Java", "programare", new Profesor("A", "B"), null));
        Add(new Curs("dec", "disp circ elec", new Profesor("S", "F"),
                new ArrayList<Student>()));
        Add(new Curs("matematici speciale", "serii fourier", new Profesor("D", "F"), null));
    }

    public ManagerCursMock(int length) {
        //super(Curs.class,length);        
        super(new ArrayList<Curs>(length));
    }

    @Override
    public void Add(Curs c) {
        this.lista.add(c);
    }

    public void Delete(String Nume) {

        int index = 0;
        for (Curs curs : this.lista) {
            if (Nume.equals(curs.nume)) {
                lista.remove(index);
                break;
            }
            index++;
        }
    }

    public void Update(Curs c, String NumeVechi) {
        int index = 0;
        for (Curs curs : this.lista) {
            if (NumeVechi.equals(curs.nume)) {
                lista.set(index, c);
                break;
            }
            index++;
        }
    }

    @Override
    public void Search(Curs c) {
        int i = 0;
        for (; i < this.lista.size(); i++) {
            if (this.lista.get(i).nume == c.nume) {
                break;
            }
        }
        if (i < this.lista.size()) {
            System.out.println("Curs " + c.nume + " found at " + i);
        } else {
            System.out.println("Curs " + c.nume + " not found.");
        }
    }

    /**
     * *Ce am facut inainte de liste
     */
    /*
    public ManagerCursMock() {
            this.lista=new ArrayList<Curs>;
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
    public ManagerCursMock(int length){
        super(Curs.class,length);
    }

    @Override
    public void Add(Curs c) {
        try{
        Curs[] aux = new Curs[this.lista.length + 1];
        System.arraycopy(this.lista, 0, aux, 0, this.lista.length);
        aux[aux.length - 1] = c;
        this.lista = aux;
        }
        catch(Exception ex)
        {
                System.out.println(ex);
                throw(ex);
        }
    }

    @Override
    public void Delete(Curs c) {
        try{
        Curs[] aux = new Curs[this.lista.length - 1];
        int index = 0;
        for (Curs cr : this.lista) {

            if (cr.nume.equals(c.nume)) {
                System.arraycopy(this.lista, 0, aux, 0, index);
               if (index != this.lista.length - 1) { 
                    System.arraycopy(this.lista, index + 1, aux, index, this.lista.length - 1 - index);
                }
                this.lista = new Curs[this.lista.length - 4]; ///cursuri.length-1 e corect
                System.arraycopy(aux, 0, this.lista, 0, aux.length);
                break;
            }
            index++;
        }
        }
        catch(Exception ex)
        {
                        
                        for(int i = 0; i<2; i++)
                        {
                           System.out.println(Thread.currentThread().getStackTrace()[i]. 
                            getLineNumber()); 
                        }
                    
        }

    }

    public void Update(Curs c, String NumeVechi) {
        int index = 0;
        for (Curs curs : this.lista) {
            if (NumeVechi.equals(curs.nume)) {
                this.lista[index] = c;
                break;
            }
            index++;
        }
    }

    @Override
    public void Search(Curs c) {
        int index = 0;
        for (Curs cr : this.lista) {
            if (cr.nume.equals(c.nume)) {
                System.out.println("Cursul s-a gasit pe pozitia: " + index);
            }
            index++;
        }

    }
     
    public boolean Register(Student s,Curs c){ ///pt a sterge un student dintr un curs, cum am facut eu cin clasa curs
        int index=-1;
        for(Curs t:lista)
        {
            index ++;
            if(t.nume.equals(c.nume))
            {break;}
        }
        if(index>0&&index<lista.length)
            lista[index].getStudenti().add(s);
    }
    
     */
}
