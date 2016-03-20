

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
    boolean isPercentage = false;
    boolean isDivide = false;
    boolean isMultiply = false;
    boolean isSubtract = false;
    boolean isAddition = false;
    Integer first = null;
    Integer second = null;
    String[] tokens = null;
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(7);
        root.setHgap(7);
        TextField field = new TextField();
        Button zero = new Button();
        zero.setFont(new Font(15));
        root.add(zero, 3, 4);
        zero.setText("0");
        zero.setOnAction((event) -> {
            field.setText(field.getText() + zero.getText());
        });
        
        Button one = new Button();
        one.setFont(new Font(15));
        root.add(one, 0, 3);
        one.setText("1");
        one.setOnAction((event) -> {
            field.setText(field.getText() + one.getText());
        });
        
        Button two = new Button();
        two.setFont(new Font(15));
        root.add(two, 1, 3 );
        two.setText("2");
        two.setOnAction((event) -> {
            field.setText(field.getText() + two.getText());
        });
        
        Button three = new Button();
        three.setFont(new Font(15));
        root.add(three, 2, 3);
        three.setText("3");
        three.setOnAction((event) -> {
            field.setText(field.getText() + three.getText());
        });
        
        Button four = new Button();
        four.setFont(new Font(15));
        root.add(four, 0, 4);
        four.setText("4");
        four.setOnAction((event) -> {
                field.setText(field.getText() + four.getText());
        });
        
        Button five = new Button();
        five.setFont(new Font(15));
        root.add(five, 1, 4);
        five.setText("5");
        five.setOnAction((event) -> {
                field.setText(field.getText() + five.getText());
        });
        
        Button six = new Button();
        six.setFont(new Font(15));
        root.add(six, 2, 4);
        six.setText("6");
        six.setOnAction((event) -> {
            field.setText(field.getText() + six.getText());
        });
        
        Button seven = new Button();
        seven.setFont(new Font(15));
        root.add(seven, 0, 2);
        seven.setText("7");
        seven.setOnAction((event) -> {
                field.setText(field.getText() + seven.getText());
        });
        
        Button eight = new Button();
        eight.setFont(new Font(15));
        root.add(eight, 1, 2);
        eight.setText("8");
        eight.setOnAction((event) -> {
                field.setText(field.getText() + eight.getText());
        });
        
        Button nine = new Button();
        nine.setFont(new Font(15));
        root.add(nine, 2, 2);
        nine.setText("9");
        nine.setOnAction((event) -> {
                field.setText(field.getText() + nine.getText());
        });
        
        Button btnC = new Button();
        btnC.setFont(new Font(15));
        root.add(btnC, 0, 1);
        btnC.setText("C");
        btnC.setOnAction((event) -> {
                field.setText("");
        });
        
        Button btnPercentage = new Button();
         
        btnPercentage.setFont(new Font(15));
        root.add(btnPercentage, 3, 2);
        btnPercentage.setText("%");
        btnPercentage.setOnAction((event) -> {
                field.setText(field.getText() + btnPercentage.getText());
                isPercentage = true;
        });
        
        Button btnDivide = new Button();
        btnDivide.setFont(new Font(15));
        root.add(btnDivide, 4, 1);
        btnDivide.setText("÷");
        btnDivide.setOnAction((event) -> {
                field.setText(field.getText() + btnDivide.getText());
                isDivide = true;
        });
        
        Button btnMultiply = new Button();
        btnMultiply.setFont(new Font(15));
        root.add(btnMultiply, 3, 3);
        btnMultiply.setText("×");
        btnMultiply.setOnAction((event) -> {
                field.setText(field.getText() + btnMultiply.getText());
                isMultiply = true;
        });
        
        Button btnSubtract = new Button();
        btnSubtract.setFont(new Font(15));
        root.add(btnSubtract, 2, 1);
        btnSubtract.setText("-");
        btnSubtract.setOnAction((event) -> {
                field.setText(field.getText() + btnSubtract.getText());
                isSubtract = true;
        });
        
        Button btnAddition = new Button();
        btnAddition.setFont(new Font(15));
        root.add(btnAddition, 1, 1);
        btnAddition.setText("+");
        btnAddition.setOnAction((event) -> {
                field.setText(field.getText() + btnAddition.getText());
                isAddition = true;
        });
        
        Button btnEquality = new Button();
        btnEquality.setFont(new Font(15));
        root.add(btnEquality, 3, 1);
        btnEquality.setText("=");
        btnEquality.setOnAction((event) -> {
                if(isPercentage) {
                    tokens = field.getText().split("%");
                    first = Integer.parseInt(tokens[0]);
                    second = Integer.parseInt(tokens[1]);
                    field.setText(first.doubleValue() * (second.doubleValue()/100) + "");
                }
               if(isDivide) {
                    tokens = field.getText().split("÷");
                    first = Integer.parseInt(tokens[0]);
                    second = Integer.parseInt(tokens[1]);
                    field.setText(first.doubleValue() / second.doubleValue() + "");
               }
               if(isMultiply) {
                    tokens = field.getText().split("×");
                    first = Integer.parseInt(tokens[0]);
                    second = Integer.parseInt(tokens[1]);
                    field.setText(first.doubleValue() * second.doubleValue() + "");
               }
               if(isSubtract) {
                    tokens = field.getText().split("-");
                    first = Integer.parseInt(tokens[0]);
                    second = Integer.parseInt(tokens[1]);
                    field.setText(first.doubleValue() - second.doubleValue() + "");
               }
               if(isAddition) {
                    tokens = field.getText().split("[+]");
                    first = Integer.parseInt(tokens[0]);
                    second = Integer.parseInt(tokens[1]);
                    field.setText(first.doubleValue()+  second.doubleValue() + "");
               }
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
