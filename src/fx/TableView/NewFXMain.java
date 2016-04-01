
package TableView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
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
        
        TextField nameField = new TextField();
        nameField.setFont(new Font("sylfaen", 13));
        nameField.setPromptText("სახელი");
        
        TextField surnameField = new TextField();
        surnameField.setFont(new Font("sylfaen", 13));
        surnameField.setPromptText("გვარი");
        ComboBox<Integer> combo = new ComboBox<>();
        combo.getItems().addAll(1,2,3,4,5,6,7,8,9,10);
        combo.setValue(1);
        
        Button addButton = new Button("დამატება");
        addButton.setFont(new Font("sylfaen", 13));
        addButton.setOnAction((event) -> {
            String name = nameField.getText();
            String surname = surnameField.getText();
            int mark = combo.getValue();
            Student s = new Student(name, surname, mark);
            table.getItems().add(s);
            nameField.setText("");
            surnameField.setText("");
            combo.setValue(1);
        });
        
        Button removeButton = new Button("წაშლა");
        removeButton.setFont(new Font("sylfaen", 13));
        
        removeButton.setOnAction((event) -> {
            ObservableList<Student> selected = table.getSelectionModel().getSelectedItems();
            if(selected.size() == 0) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Please select a row");
                alert.showAndWait();
            }
            else {
                ObservableList<Student> allStudents = table.getItems();
                for(Student s: selected) 
                    allStudents.remove(s);
            }
        });
        
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.getChildren().addAll(nameField,surnameField,combo,addButton,removeButton);
        
        root.getChildren().addAll(label,table,flowPane);
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
