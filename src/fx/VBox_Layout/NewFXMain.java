
package VBox_Layout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Your Name?");
        TextField field = new TextField("Name");
        Button btn = new Button("Send");
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(15);
        root.setPadding(new Insets(0,30,0,30));
        btn.setOnAction((event) -> {
            System.out.println("Hello " + field.getText());
        });
        root.getChildren().addAll(label, field, btn);
        Scene scene = new Scene(root, 300 , 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello");
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
