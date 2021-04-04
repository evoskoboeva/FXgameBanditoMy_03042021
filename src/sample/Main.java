package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("auto.fxml"));
        root.styleProperty().setValue(" -fx-background-color: white;  -fx-border-color: white; -fx-border-width: 7px;");
        primaryStage.getIcons().add(new Image("sample/ikon.jpg"));

        primaryStage.setTitle("My Game");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        //Однорукий бандит - 3 потока, генерирующие числа от 0 до 9. По нажатию кнопки потоки
        // останавливаются и результат анализируется. При анализе использовать следующие комбинации
        // (три одинаковых числа, два одинаковых числа, три единицы, три семерки, две единицы, имеется четверка)

    }
}