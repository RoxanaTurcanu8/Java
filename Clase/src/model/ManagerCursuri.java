/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Roxy
 */
public abstract class ManagerCursuri {
   public Curs[] cursuri;
    
   public ManagerCursuri(){
       cursuri = new Curs[0];
    }
    
    public void AfiseazaToateCursurile()
{
   for(Curs c : cursuri)
   {
       System.out.println(c);
   }
}





/*
public void AddNew(Curs c)
{
    Curs[] aux= new Curs[this.cursuri.length+1];
            System.arraycopy(this.cursuri, 0, aux, 0, this.cursuri.length);
            aux[aux.length-1]=c;
            cursuri=aux;
}

public void RemoveCurs(String NumeCurs)
{
    Curs[] aux= new Curs[this.cursuri.length-1];
    int index=0;
    for(Curs c: cursuri)
    {
        
        if(NumeCurs.equals(c.nume))
        {
           System.arraycopy(cursuri, 0,aux,0,index);
           if(index!=cursuri.length-1)
           {
            System.arraycopy(cursuri, index+1, aux, index, cursuri.length-1-index);
           }
           cursuri = new Curs[cursuri.length-1];
           System.arraycopy(aux,0,cursuri,0,aux.length);
           break;
        }  
        index++;
    }
 }


    public void ModifCurs(String NumeVechi, String NumeNou, String Descriere)
    {
        for(Curs c :cursuri)
        {
            if(NumeVechi.equals(c.nume))
            {
                c.setNume(NumeNou);
                c.setDescriere(Descriere);
            }
        }
    }
    
    public void StudentiiLaCurs(String NumeCurs)
    { 
        for(Curs c: cursuri)
        {
            if(NumeCurs.equals(c.nume))
            {
                for(Student s: c.studenti)
                System.out.println(s);
            }
        }
    }
      
    public void AfisCursuri()
    {
        for(Curs c:cursuri)
        {
            System.out.println(c.nume);
        }
    }*/

    

}