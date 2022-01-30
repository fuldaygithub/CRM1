package com.example.crm.management;

import javafx.animation.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import javafx.util.Duration;


public final class Gui {
    Stage window;
    
    public Gui(Stage window) {
        this.window = window;
        window.setResizable(false);
        BorderPane mainLayout = new BorderPane();
        ImageView homeIcon = new ImageView(new Image(getClass().getResourceAsStream("/images/homeIcon.png")));
        ImageView storesIcon = new ImageView(new Image(getClass().getResourceAsStream("/images/storesIcon.png")));
        ImageView employeesIcon = new ImageView(new Image(getClass().getResourceAsStream("/images/employeesIcon.png")));
        ImageView addEmployeeIcon = new ImageView(new Image(getClass().getResourceAsStream("/images/addIcon.png")));
        ImageView removeEmployeeIcon = new ImageView(new Image(getClass().getResourceAsStream("/images/removeIcon.png")));
        ImageView addStoreIcon = new ImageView(new Image(getClass().getResourceAsStream("/images/addIcon.png")));
        ImageView removeStoreIcon = new ImageView(new Image(getClass().getResourceAsStream("/images/removeIcon.png")));

        storesIcon.setPreserveRatio(true);
        storesIcon.setFitWidth(180);

        employeesIcon.setPreserveRatio(true);
        employeesIcon.setFitWidth(180);

        addEmployeeIcon.setPreserveRatio(true);
        addEmployeeIcon.setFitWidth(75);

        removeEmployeeIcon.setPreserveRatio(true);
        removeEmployeeIcon.setFitWidth(75);

        addStoreIcon.setVisible(false);
        removeStoreIcon.setVisible(false);

        addStoreIcon.setPreserveRatio(true);
        addStoreIcon.setFitWidth(75);

        removeStoreIcon.setPreserveRatio(true);
        removeStoreIcon.setFitWidth(75);

        addEmployeeIcon.setVisible(false);
        removeEmployeeIcon.setVisible(false);

        homeIcon.setOnMouseEntered(e -> {
            ScaleTransition scale = new ScaleTransition();
            scale.setNode(homeIcon);
            scale.setFromX(1);
            scale.setToX(1.2);
            scale.setFromY(1);
            scale.setToY(1.2);
            scale.setDuration(new Duration(200));
            scale.play();
        });

        homeIcon.setOnMouseExited(e -> {
            ScaleTransition scale = new ScaleTransition();
            scale.setNode(homeIcon);
            scale.setFromX(1.2);
            scale.setToX(1);
            scale.setFromY(1.2);
            scale.setToY(1);
            scale.setDuration(new Duration(200));
            scale.play();
        });

        Label inRentLabel = new Label("In-Rent List");
        Label vehiclesLabel = new Label("Vehicles List");
        Label salesLabel = new Label("Sales");


        HBox topPane = new HBox(30);
        AnchorPane centerPane = new AnchorPane();
        AnchorPane.setLeftAnchor(storesIcon, 120d);
        AnchorPane.setTopAnchor(storesIcon, 160d);
        AnchorPane.setRightAnchor(employeesIcon, 150d);
        AnchorPane.setTopAnchor(employeesIcon, 160d);
        centerPane.getChildren().addAll(addEmployeeIcon, addStoreIcon, removeEmployeeIcon, removeStoreIcon, storesIcon, employeesIcon);

        homeIcon.setPreserveRatio(true);
        homeIcon.setFitWidth(50);
        inRentLabel.setPadding(new Insets(15, 0, 0, 0));
        vehiclesLabel.setPadding(new Insets(15, 0, 0, 0));
        salesLabel.setPadding(new Insets(15, 0, 0, 0));
        topPane.getChildren().addAll(homeIcon, inRentLabel, vehiclesLabel, salesLabel);
        mainLayout.setTop(topPane);
        mainLayout.setCenter(centerPane);

    }}