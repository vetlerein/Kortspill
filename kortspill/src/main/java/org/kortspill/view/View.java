package org.kortspill.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    Stage window;
    VBox mainLayout;
    HBox kortBox;
    HBox underKortBox;
    StackPane cardLayout;

    @Override
    public void start(Stage window) throws Exception {
        
        //Lager layouts
        mainLayout = new VBox();
        mainLayout.setSpacing(10);
        mainLayout.setPadding(new Insets(10));
        
        kortBox = new HBox();
       //TODO kortBox.setStyle(Color.LIGHTSKYBLUE.toString());
        kortBox.setSpacing(10);
        
        underKortBox = new HBox();
        underKortBox.setSpacing(10);
        
        Scene scene = new Scene(mainLayout, 800, 600, Color.LIGHTSKYBLUE);

        //Legger til 5 kort (StackPane) i kortBox i det programmet starter
        for (int i = 0; i < 5; i++) {
            StackPane card = new StackPane();
            card.setPrefSize(200, 300);
            card.setStyle("-fx-background-color: white; -fx-border-color: black;");
            kortBox.getChildren().add(card);
        }

        //Legger til 5 kort (StackPane) i kortBox ved å trykke på knappen
        Button dealButton = new Button("Deal");
        dealButton.setPrefSize(70, 35);
        dealButton.setOnAction(e -> {
            kortBox.getChildren().clear();
            for (int i = 0; i < 5; i++) {
                StackPane card = new StackPane();
                card.setPrefSize(200, 300);
                card.setStyle("-fx-background-color: white; -fx-border-color: black;");
                kortBox.getChildren().add(card);
            }
        });

        //Tekst vedsiden av knappen
        Label label = new Label("You won");
        label.setFont(javafx.scene.text.Font.font("Calibri", 30));

        //Legger ting i layouts
        underKortBox.getChildren().addAll(dealButton, label);
        mainLayout.getChildren().addAll(kortBox, underKortBox);

        window.setScene(scene);
        window.setTitle("Kortspill");
        window.setResizable(false);
        window.show();
    }
}

        // mainLayout.getStylesheets().add(Objects.requireNonNull(getClass()
        //       .getResource("/org/kortspill/style.css")).toExternalForm());

        // mainLayout.getStyleClass().add("mainLayout");

        // text.setX(10);
        // text.setY(45);
        // text.setFont(Font.font("Times new roman", 30));
        // text.setFill(Color.BLACK);

                // line.setStartX(10);
        // line.setStartY(70);
        // line.setEndX(775);
        // line.setEndY(70);
        // line.setStrokeWidth(5);;
        // line.setStroke(Color.BLUE);

        // knapp.setText("Hello");
        // knapp.setLayoutX(20);
        // knapp.setLayoutY(90);
        // knapp.setOnAction(e -> System.out.println("Test"));
