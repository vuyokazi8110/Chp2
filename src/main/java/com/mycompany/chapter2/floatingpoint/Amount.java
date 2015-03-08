/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.chapter2.floatingpoint;

/**
 *
 * @author sbm
 */
public class Amount {
    float amountpd = (float) 20.00;
    float amountdue =  (float)10.00;
    float total;
    
    public float calculate (){
    
        total = amountpd - amountdue;
        return total;
    
}
    
    
}
