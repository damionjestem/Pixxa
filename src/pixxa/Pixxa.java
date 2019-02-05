package pixxa;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Pixxa extends Application{

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Pixxa - zmixxuj pizzę!");

        /*You can add text inside brackets of constructor*/
        button = new Button();
        button.setText("Naciśnij mnie");
        button.setOnAction(e -> System.out.println("O tak"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 500); //layout, x, y
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
