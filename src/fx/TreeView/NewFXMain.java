
package TreeView;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TreeView<String> tree = new TreeView<>();
        
        TreeItem<String> root = new TreeItem<>("root");
        TreeItem<String> item1 = new TreeItem<>("something first");
        TreeItem<String> item2 = new TreeItem<>("something second");
        root.getChildren().addAll(item1, item2);
        tree.setRoot(root);
        
        Scene scene = new Scene(tree, 300, 250);
        primaryStage.setTitle("TreeView example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
