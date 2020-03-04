/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author Danie
 */
public class Perimetro {
    
    private int base;
    private int resultadoPerimetro;
    
    public Perimetro (String base)
    {
    this.setBase(Integer.parseInt(base));
    }
    
    public void obtenerPerimetro()
    {
        int p=(this.getBase()*3);
        this.setResultadoPerimetro(p);
    }
    
    public int getBase()
    {
    return base;
    }
    
    public void setBase(int base)
    {
    this.base=base;
    }
    
    public int getResultadoPerimetro()
    {
    return resultadoPerimetro;
    }
    
    public void setResultadoPerimetro(int resultadoPerimetro)
    {
    this.resultadoPerimetro=resultadoPerimetro;
    }
    
}
