package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AutoController {



    public void Auto(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        root.styleProperty().setValue(" -fx-background-color: white;  -fx-border-color: white; -fx-border-width: 7px;");
        Stage stage = new Stage();
        stage.getIcons().add(new Image("sample/ikon.jpg"));

        stage.setTitle("My Game");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
