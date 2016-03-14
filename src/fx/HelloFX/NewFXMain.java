
package HelloFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.util.logging.*;
import javafx.scene.control.Alert;

public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*Label label = new Label("Hello World");
        label.setFont(new Font("Cambria", 20));*/
        
        Button btn = new Button("Click!");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("This is information");
                alert.showAndWait();
                System.out.println("Log");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hi, FX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
