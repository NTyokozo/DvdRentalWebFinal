/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.dvdrentalweb.test.services;

import com.nobu.dvdrentalweb.domain.BlueRay;
import com.nobu.dvdrentalweb.services.BlueRayService;
import com.nobu.dvdrentalweb.test.ConnectionConfigTest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nobu
 */
public class BlueRayServiceTest{
    
    public BlueRayServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
       public static ApplicationContext ctx;
    public BlueRayService blueRayService;
    
    @Test
    public void DvdCostServiceTest() {
        BlueRay blueRay = new BlueRay.Builder().blueSpeed("56").visual("Hd").bluePrice(120.00).build();
        BlueRay blueRay1 = new BlueRay.Builder().blueSpeed("120").visual("3d").bluePrice(160.00).build();
        BlueRay blueRay2 = new BlueRay.Builder().blueSpeed("56").visual("4d").bluePrice(200.00).build();
        
        List<BlueRay> blueRays = new ArrayList<>();
        blueRays.add(blueRay);
        blueRays.add(blueRay1);
        blueRays.add(blueRay2);
        
      //  Assert.assertEquals(blueRayService.highestCost(blueRays), blueRay);
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(ConnectionConfigTest.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
