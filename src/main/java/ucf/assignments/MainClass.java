package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {




    public static void main(String[] args) {
        /*
        create todo list
         */
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TodoList.fxml"));

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("TodoList");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
