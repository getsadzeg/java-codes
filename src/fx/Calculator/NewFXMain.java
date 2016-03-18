
package Calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        TextField field = new TextField();
        Button one = new Button();
        one.setFont(new Font(15));
        
        
        Button two = new Button();
        two.setFont(new Font(15));
        
        Button three = new Button();
        three.setFont(new Font(15));
        
        Button four = new Button();
        four.setFont(new Font(15));
        
        Button five = new Button();
        five.setFont(new Font(15));
        
        Button six = new Button();
        six.setFont(new Font(15));
        
        Button seven = new Button();
        seven.setFont(new Font(15));
        root.add(seven, 0, 1);
        
        Button eight = new Button();
        eight.setFont(new Font(15));
        root.add(eight, 1, 1);
        
        Button nine = new Button();
        nine.setFont(new Font(15));
        root.add(nine, 2, 1);
        
        Button btnC = new Button();
        btnC.setFont(new Font(15));
        
        Button btnPercentage = new Button();
        btnPercentage.setFont(new Font(15));
        
        Button btnDivide = new Button();
        btnDivide.setFont(new Font(15));
        
        Button btnMultiply = new Button();
        btnDivide.setFont(new Font(15));
        
        Button btnSubtract = new Button();
        btnSubtract.setFont(new Font(15));
        
        Button btnAddition = new Button();
        btnAddition.setFont(new Font(15));
        seven.setText("7");
        
        seven.setOnAction((event) -> {
                field.setText(field.getText() + seven.getText());
        });
        eight.setText("8");
        eight.setOnAction((event) -> {
                field.setText(field.getText() + eight.getText());
        });
        
        nine.setText("9");
        nine.setOnAction((event) -> {
                field.setText(field.getText() + nine.getText());
        });
        Scene scene = new Scene(root, 300, 250);
        root.add(field, 0, 0, 4, 1);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
