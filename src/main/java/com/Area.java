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
public class Area {
    
    private int base;
    private int altura;
    private int resultadoArea;
    
    public Area (String base, String altura)
    {
    this.setBase(Integer.parseInt(base));
    this.setAltura(Integer.parseInt(altura));
    }
    
    public void obtenerArea()
    {
        int a=((this.getBase()*this.getAltura())/2);
        this.setResultadoArea(a);
    }
    
    public int getBase()
    {
    return base;
    }
    
    public void setBase(int base)
    {
    this.base=base;
    }
    
     public int getAltura()
    {
    return altura;
    }
    
    public void setAltura(int altura)
    {
    this.altura=altura;
    }
    
    public int getResultadoArea()
    {
    return resultadoArea;
    }
    
    public void setResultadoArea(int resultadoArea)
    {
    this.resultadoArea=resultadoArea;
    }
}




