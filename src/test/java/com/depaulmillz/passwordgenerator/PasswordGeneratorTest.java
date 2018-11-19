/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depaulmillz.passwordgenerator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author depaulmiller
 */
public class PasswordGeneratorTest
{
  
  public PasswordGeneratorTest()
  {
  }
  
  @BeforeClass
  public static void setUpClass()
  {
  }
  
  @AfterClass
  public static void tearDownClass()
  {
  }
  
  @Before
  public void setUp()
  {
  }
  
  @After
  public void tearDown()
  {
  }

  /**
   * Test of getInstance method, of class PasswordGenerator.
   */
  @Test
  public void testGetInstance()
  {
    System.out.println("getInstance");
    PasswordGenerator result = PasswordGenerator.getInstance();
    assertNotEquals(null,result);
    PasswordGenerator result2 = PasswordGenerator.getInstance();
    assertEquals(result, result2);
  }

  /**
   * Test of getPassword method, of class PasswordGenerator.
   */
  @Test
  public void testGetPassword()
  {
    System.out.println("getPassword");
    int size = 0;
    PasswordGenerator instance = PasswordGenerator.getInstance();
    String expResult = "";
    String result = instance.getPassword(size);
    assertEquals(expResult, result);
    size = 20;
    String password = instance.getPassword(size);
    System.out.println(password);
    assertEquals(password.length(), size);
  }
  
}
