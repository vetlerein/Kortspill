package org.kortspill.view;

import org.kortspill.controller.Controller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private VBox mainLayout;
    private HBox kortBox = new HBox(); 
    private Label label = new Label("Trykk 'Deal' for å trekke kort!");

    @Override
    public void start(Stage window) throws Exception {
        Controller controller = new Controller();

        // Lager layouts
        mainLayout = new VBox();
        mainLayout.setSpacing(10);
        mainLayout.setPadding(new Insets(10));

        kortBox.setSpacing(10);
        
        HBox underKortBox = new HBox();
        underKortBox.setSpacing(10);

        Button dealButton = new Button("Deal");
        dealButton.setPrefSize(70, 35);
        dealButton.setOnAction(e -> {
            kortBox.getChildren().setAll(controller.handleDealButton(dealButton).getChildren());
            label.setText(controller.handleWinLabel().getText());
        });

        underKortBox.getChildren().addAll(dealButton, label);
        mainLayout.getChildren().addAll(kortBox, underKortBox);

        // Opprett scene
        Scene scene = new Scene(mainLayout, 800, 600, Color.LIGHTSKYBLUE);
        window.setScene(scene);
        window.setTitle("Kortspill");
        window.setResizable(false);
        window.show();
    }
}
