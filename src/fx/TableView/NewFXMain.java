
package TableView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        TableColumn<Student, String> surnameColumn = new TableColumn<>("გვარი");
        surnameColumn.setMinWidth(200);
        surnameColumn.setStyle("-fx-font-family:sylfaen");
        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("Surname"));
        TableColumn<Student, Integer> markColumn = new TableColumn<>("ქულა");
        markColumn.setMinWidth(150);
        markColumn.setStyle("-fx-font-family:sylfaen");
        markColumn.setCellValueFactory(new PropertyValueFactory<>("mark"));
        table.getColumns().addAll(nameColumn, surnameColumn, markColumn);
        table.setItems(getStudents());
        root.getChildren().addAll(label, table);
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("TableView!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public ObservableList<Student> getStudents() {
        ObservableList<Student> students = FXCollections.observableArrayList();
        students.add(new Student("ილია", "ჭავჭავაძე", 9));
        students.add(new Student("აკაკი", "წერეთელს", 8));
        students.add(new Student("ლუკა", "რაზიკაშვილი", 10));
        return students;
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
