/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package floatingpoint;

import com.mycompany.chapter2.floatingpoint.Amount;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author sbm
 */
public class TestFloatingPoints {
    private static Amount amt;
    
    public TestFloatingPoints() {
    }
    
    @Before
    public void setUp() {
        amt = new Amount();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     public void floatingPoint() {
        Assert.assertEquals(10.00, amt.calculate());
        
    }
}
