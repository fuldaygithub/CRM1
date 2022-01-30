package com.example.crm.management;

import javafx.application.Application;
import javafx.stage.Stage;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Management<args> extends Application {
    
    @Override
    public void start(Stage primaryStage) 
    {
        Gui gui = new Gui(primaryStage);

    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        launch(args);
    }}
    

