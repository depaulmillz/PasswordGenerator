/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depaulmillz.passwordgenerator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author depaulmiller
 */
public class Display extends Application
{
  
  private final String passwordLabel = "Password: ";
  private String password = "";
  
  @Override
  public void start(Stage stage)
  {
    VBox box = new VBox();
    box.setSpacing(20);
    box.setPadding(new Insets(10,10,10,10));
    Label l = new Label(passwordLabel);
    TextField pass = new TextField(password);
    pass.setEditable(false);
    
    TextField sizeInput = new TextField();
    sizeInput.setPromptText("Size Of Password");
    Button getPassword = new Button("Get Password");
    getPassword.setOnAction(e -> {
      try{
      password = PasswordGenerator.getInstance().getPassword(Integer.parseInt(sizeInput.getText()));
      } catch(NumberFormatException ex){
        System.err.print(ex.getStackTrace());
      }
      pass.setText(password);
    });
    
    box.getChildren().addAll(l, pass, sizeInput, getPassword);
    
    Scene s = new Scene(box, 300, 200);
    stage.setScene(s);
    stage.setTitle("Password Generator");
    stage.show();
    
  }
  
  public static void main(String[] args){
    launch(args);
  }
  
}
