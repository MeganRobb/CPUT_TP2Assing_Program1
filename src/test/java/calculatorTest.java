/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.meganrobb.tpprog1.config.CalculatorConfig;
import com.meganrobb.tpprog1.service.Impl.CalculatorService;
import com.meganrobb.tpprog1.service.Impl.CalculatorServiceImpl;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class calculatorTest {

    private static CalculatorService service;

    public calculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    //Asserting message
    public void add() {
        Assert.assertEquals("Adding 2 and 5 equals 7", 7, service.add(2, 5));
        
    }

    //Asserting float
    public void divide() {
        Assert.assertEquals(2.5, service.divide(5, 2));
    }

    //Asserting integer
    public void subtract() {
        Assert.assertEquals(10, service.subtract(20, 10));
    }
    
    //Object Comparison (equality)
    public void objEqul() {
        String msg = "adding";
        Assert.assertEquals(service.objEqul("adding"), msg);
    }
    
    //Object Comparison (Indentity)
    public void objIden(){
        String msg = "Multiplication";
        Assert.assertSame(service.objIden("Multiplication"), msg);
        Assert.assertNotSame(service.objIden("Division"), msg);
    }
   
    public void assBool(){
        //Asserting true
        Assert.assertTrue("First number is smaller", service.smaller(2, 10));
        //Asserting false
        Assert.assertFalse( "First number is smaller", service.smaller(10, 5));
    }
    
    public void assNullest(){
        //Asserting null
        Integer num = null;
        Assert.assertNull(service.check(num));
        
        //Asserting nonNull
        String mgs = "Addition";
        Assert.assertNotNull(service.check(mgs));
    }
    
    
   

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CalculatorConfig.class);
        service = (CalculatorService) ctx.getBean("Calc");
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
