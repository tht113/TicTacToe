/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe_noFXML;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
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
        Scene scene = new Scene(root, 300, 300);
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
       
        
    //-----------Adding to the Grid-----------\\
    
        //Adding Buttons to Grid
        grid.add(btnZero, 0 ,0);
        grid.add(btnOne, 0 , 1);
        grid.add(btnTwo, 0 , 2);
        grid.add(btnThree, 1 , 0);
        grid.add(btnFour, 1 , 1);
        grid.add(btnFive, 1 , 2);
        grid.add(btnSix , 2 , 0);
        grid.add(btnSeven, 2 , 1);
        grid.add(btnEight, 2 , 2);

        //Making buttons take up max width
        btnZero.setPrefWidth(Integer.MAX_VALUE);
        btnOne.setPrefWidth(Integer.MAX_VALUE);
        btnTwo.setPrefWidth(Integer.MAX_VALUE);
        btnThree.setPrefWidth(Integer.MAX_VALUE);
        btnFour.setPrefWidth(Integer.MAX_VALUE);
        btnFive.setPrefWidth(Integer.MAX_VALUE);
        btnSix.setPrefWidth(Integer.MAX_VALUE);
        btnSeven.setPrefWidth(Integer.MAX_VALUE);
        btnEight.setPrefWidth(Integer.MAX_VALUE);
        
        //Making buttons take up mex height
        btnZero.setPrefHeight(Integer.MAX_VALUE);
        btnOne.setPrefHeight(Integer.MAX_VALUE);
        btnTwo.setPrefHeight(Integer.MAX_VALUE);
        btnThree.setPrefHeight(Integer.MAX_VALUE);
        btnFour.setPrefHeight(Integer.MAX_VALUE);
        btnFive.setPrefHeight(Integer.MAX_VALUE);
        btnSix.setPrefHeight(Integer.MAX_VALUE);
        btnSeven.setPrefHeight(Integer.MAX_VALUE);
        btnEight.setPrefHeight(Integer.MAX_VALUE);
        
    //-----------Setting up Buttons-----------\\
    
        //New game Button
        newGame.setText("New Game!");
        
        //Close Game
        closeGame.setText("Close!");
        
    //-----------Adding Buttons to HBoxes-----------\\
        
        //HBox hbTop
        hbTop.getChildren().add(newGame);
        hbTop.getChildren().add(closeGame);
        
        //HBox hbCenter
        hbCenter.getChildren().add(grid);
        
        
    //-----------Aligning and Sizing HBox-----------\\
    
        //HBox hbTop
        hbTop.setAlignment(Pos.CENTER);
        hbTop.setSpacing(5);
        hbTop.setMinWidth(20);
        hbTop.setMinHeight(10);
        
        //HBox hbCenter
        hbCenter.setAlignment(Pos.CENTER);
        hbCenter.setMinWidth(10);
        hbCenter.setMinHeight(20);
       

    //-----------Adding to the BorderPane-----------\\
    
        root.setTop(hbTop);
        root.setCenter(hbCenter);
        
        
        

    //-----------Setting the Stage-----------\\
        
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
