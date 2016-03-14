
package Text;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TextField field = new TextField();
        Button btn = new Button("Click!");
        
        btn.setOnAction( (event) -> { //wow, lambda in java 8
            System.out.println(field.getText());
        });
        
        field.setOnKeyReleased((event)-> {
            if(event.getCode() == KeyCode.ENTER) {
                System.out.println(field.getText());
            }
        });
    
                
        
        VBox root = new VBox();
        root.getChildren().addAll(field,btn);
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
