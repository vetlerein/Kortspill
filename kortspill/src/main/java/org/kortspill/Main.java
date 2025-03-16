package org.kortspill;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
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
        
        Text text = new Text("Kortspill");
        text.setX(10);
        text.setY(45);
        text.setFont(Font.font("Calibri", 30));
        text.setFill(Color.BLACK);
        
        Line line = new Line();
        line.setStartX(10);
        line.setStartY(70);
        line.setEndX(775);
        line.setEndY(70);
        line.setStrokeWidth(5);;
        line.setStroke(Color.BLUE);
        
        Button button = new Button();
        button.setMinWidth(200);
        button.setMinHeight(300);
        button.setScaleX(1);
        button.setScaleY(1);
        button.setText("Hello");

        Rectangle rectangle = new Rectangle();
       
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(button);

        rectangle.setX(0);
        rectangle.setY(0);
        rectangle.setWidth(0);
        rectangle.setHeight(0);
        rectangle.setFill(null);


        stage.setScene(scene);
        stage.setTitle("Kortspill");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setResizable(false);
        stage.show();

    }
}

