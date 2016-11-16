/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe_noFXML;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Thomas
 */
public class TicTac extends Application 
{
    
    @Override
    public void start(Stage primaryStage) 
    {
    //-----------Object Creation-----------\\
       
        //Pane Declarations
        BorderPane root = new BorderPane();
        GridPane grid = new GridPane();
        HBox hbTop = new HBox();
        HBox hbCenter = new HBox();
        
        //Buttons Declarations
        Button newGame = new Button();
        Button closeGame = new Button();
        Button btnZero = new Button();
        Button btnOne = new Button();
        Button btnTwo = new Button();
        Button btnThree = new Button();
        Button btnFour = new Button();
        Button btnFive = new Button();
        Button btnSix = new Button();
        Button btnSeven = new Button();
        Button btnEight = new Button();
        
    //-----------Adding Buttons to HBoxes-----------\\
        
        //HBox hbTop
        hbTop.getChildren().add(newGame);
        hbTop.getChildren().add(closeGame);
        
        //HBox hbCenter
        hbTop.getChildren().add(btnZero);
        hbTop.getChildren().add(btnOne);
        hbTop.getChildren().add(btnTwo);
        hbTop.getChildren().add(btnThree);
        hbTop.getChildren().add(btnFour);
        hbTop.getChildren().add(btnFive);
        hbTop.getChildren().add(btnSix);
        hbTop.getChildren().add(btnSeven);
        hbTop.getChildren().add(btnEight);
        
    //-----------Aligning and Sizing HBox-----------\\
    
        //HBox hbTop
        hbTop.
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
