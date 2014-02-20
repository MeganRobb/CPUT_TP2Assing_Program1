/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.tpprog1.service.Impl;

/**
 *
 * @author student
 */
public class CalculatorServiceImpl implements CalculatorService{

    public int add(int a, int b) {
        return a +b;
    }

    public float divide(int i, int j) {
        return i/j;
    }

    public int subtract(int c, int d) {
        return c - d;
    }
    
    public Object objEqul(Object e){
        return e;
    }

    public Object objIden(Object i) {
        return i;
    }
    
    public boolean smaller(int a, int b){
        return a<b;
    }
    
    public Object check(Object chk){
        return chk;
    }
}

    
