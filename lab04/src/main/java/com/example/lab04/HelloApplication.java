package com.example.lab04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import java.io.IOException;

public class HelloApplication extends Application {
    // launch the application
    public void start(Stage s)
    {
        // set title for the stage
        s.setTitle("Registration Form");
        VBox vBox = new VBox();
        // create a textfield
        TextField username = new TextField("Username");
        PasswordField password = new PasswordField();
        TextField fullname = new TextField("Full Name");
        TextField email = new TextField("Email Address");
        TextField phonenumber = new TextField("Phone Number");
        DatePicker dob = new DatePicker();
        Button submit = new Button("Submit");

        vBox.setSpacing(8);
        vBox.setPadding(new Insets(10, 50, 50, 50));
        vBox.getChildren().addAll(
                new Label("Username: "),
                username,
                new Label("Password: "),
                password,
                new Label("Full Name: "),
                fullname,
                new Label("Email: "),
                email,
                new Label("Phone Number: "),
                phonenumber,
                new Label("Date of Birth: "),
                dob,
                submit);

        // action event
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                System.out.println("Username: " + username.getText());
                System.out.println("Password: " + password.getText());
                System.out.println("Full Name: " + fullname.getText());
                System.out.println("Email: " + email.getText());
                System.out.println("Phone Number: " + phonenumber.getText());
                s.close();
            }
        };

        // when enter is pressed
       submit.setOnAction(event);




        // create a scene
        Scene sc = new Scene(vBox, 400, 500);

        // set the scene
        s.setScene(sc);

        s.show();
    }

    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}