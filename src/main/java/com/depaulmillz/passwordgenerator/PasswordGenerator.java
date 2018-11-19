/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depaulmillz.passwordgenerator;

import java.util.Random;
/**
 *
 * @author depaulmiller
 */
public final class PasswordGenerator
{
  private Random random;
  private static PasswordGenerator instance = null;
  
  private PasswordGenerator(){
    if(instance != null){
      throw new IllegalStateException("Already instantiated");
    } else {
      random = new Random();
    }
  }
  
  public static PasswordGenerator getInstance()
  {
    if(instance == null){
      instance = new PasswordGenerator();
    }
    return instance;
  }

  public String getPassword(int size){
    String s = "";
    for(int i = 0; i < size; i++){
      s+= (char) ((int)(getInstance().random.nextFloat()*(90-48))+48);
    }
    
    return s;
  }
  
}
