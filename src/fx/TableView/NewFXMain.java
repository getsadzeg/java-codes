
package TableView;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        VBox root = new VBox();
        root.setPadding(new Insets(10, 10, 10, 10));
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        Label label = new Label("საგამოცდო ქულები");
        label.setFont(new Font("sylfaen", 15));
        
        
        TableView<Student> table = new TableView<Student>();
        
        TableColumn<Student, String> nameColumn = new TableColumn<>("სახელი");
        nameColumn.setMinWidth(200);
        nameColumn.setStyle("-fx-font-family:sylfaen");
        TableColumn<Student, String> surnameColumn = new TableColumn<>("გვარი");
        surnameColumn.setMinWidth(200);
        surnameColumn.setStyle("-fx-font-family:sylfaen");
        TableColumn<Student, Integer> markColumn = new TableColumn<>("ქულა");
        markColumn.setMinWidth(150);
        markColumn.setStyle("-fx-font-family:sylfaen");
        table.getColumns().addAll(nameColumn, surnameColumn, markColumn);
        
        root.getChildren().addAll(label, table);
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("TableView!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
