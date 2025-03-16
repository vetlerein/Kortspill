package org.kortspill;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Group root = new Group();
        Scene scene = new Scene(root, Color.LIGHTSKYBLUE);
        
        Text text = new Text("Hei hei på deg");
        text.setX(70);
        text.setY(300);
        text.setFont(Font.font("Calibri", 30));
        root.getChildren().add(text);
        
        stage.setScene(scene);
        stage.setTitle("Kortspill");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setResizable(false);
        stage.show();

    }
}

