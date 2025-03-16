package org.kortspill;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    Stage window;
    Button knapp = new Button();
    Button byttVinduKnapp = new Button("Bytt vindu");
    Line line = new Line();; 
    Text text = new Text("Kortspill");;

    @Override
    public void start(Stage window) throws Exception {
        
        AnchorPane layout2 = new AnchorPane();
        Group layout = new Group();
        Scene scene = new Scene(layout, Color.LIGHTSKYBLUE);
        Scene scene2 = new Scene(layout2);
        
        text.setX(10);
        text.setY(45);
        text.setFont(Font.font("Times new roman", 30));
        text.setFill(Color.BLACK);

        line.setStartX(10);
        line.setStartY(70);
        line.setEndX(775);
        line.setEndY(70);
        line.setStrokeWidth(5);;
        line.setStroke(Color.BLUE);

        knapp.setText("Hello");
        knapp.setLayoutX(20);
        knapp.setLayoutY(90);
        knapp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Test");
            }
        });
    
        byttVinduKnapp.setLayoutX(70);
        byttVinduKnapp.setLayoutY(90);
        byttVinduKnapp.setOnAction(e -> {
            window.setScene(scene2);
        });

        layout.getChildren().addAll(text, line, knapp, byttVinduKnapp);

        window.setScene(scene);
        window.setTitle("Kortspill");
        window.setWidth(800);
        window.setHeight(600);
        window.setResizable(false);
        window.show();

    }
}

