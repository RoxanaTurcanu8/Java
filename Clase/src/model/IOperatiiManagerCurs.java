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
public interface IOperatiiManagerCurs {
    public void Add(Curs c);
    public void Delete(Curs c);
    public void Update (Curs c,String NumeVechi);
    public void Search (Curs c);
    
}
