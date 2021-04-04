package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    TextField txtNumber1;
    @FXML
    TextField txtNumber2;
    @FXML
    TextField txtNumber3;
    @FXML
    TextField txtInfo;
    @FXML
    ImageView img;
    @FXML
    Label lbl1;
    @FXML
    Label lbl2;
    @FXML
    Label lbl3;
    @FXML
    Label lbl4;
    @FXML
    Label lbl5;



    public void Go(ActionEvent actionEvent) {
        txtInfo.setText("");
        lbl1.setText("");
        lbl2.setText("");
        lbl3.setText("");
        lbl4.setText("");
        lbl5.setText("");

        Bandito bandito1 = new Bandito();
        Bandito bandito2 = new Bandito();
        Bandito bandito3 = new Bandito();

        bandito1.run();
        bandito2.run();
        bandito3.run();
        byte number1 = bandito1.number;
        byte number2 = bandito2.number;
        byte number3 = bandito3.number;

        txtNumber1.setText(String.valueOf(number1));
        txtNumber2.setText(String.valueOf(number2));
        txtNumber3.setText(String.valueOf(number3));

        System.out.println(number1+System.lineSeparator()+number2+System.lineSeparator()
                +number3);

        if (number1 == number2 && number1 == number3) {
            txtInfo.setStyle(    "-fx-text-fill: green;");
            lbl1.setText("★");
            lbl2.setText("★");
            lbl3.setText("★");
            lbl4.setText("★");
            lbl5.setText("★");


            if (number1 == 1 || number1 == 7){
                txtInfo.setStyle(    "-fx-text-fill: red;");
                txtInfo.setText("three nambers = "+number1);
                return;}
/*
                    Image image = new Image("@fon_uau.jpg");
                        img.setImage(image);
*/

                    txtInfo.setText("three identical nambers");
            return;
        }
        else
        if (number1 == number2 || number1 == number3 || number2 == number3) {
            txtInfo.setStyle(    "-fx-text-fill: white;");
            lbl1.setText("★");
            lbl2.setText("★");
            lbl3.setText("★");
            lbl4.setText("★");
            lbl5.setText("★");

            if ((number1 == 1 && number2 == 1) || (number1 == 1 && number3 == 1) || (number1 == 2 && number3 == 1)) {
                txtInfo.setText("two nambers = 1");
                return;
            }

            txtInfo.setText("two identical nambers");
            return;
        }
        else
        if (number1 == 4 || number2 == 4 || number3 == 4) {
            lbl1.setText("★");
            lbl2.setText("★");
            lbl3.setText("★");
            lbl4.setText("★");
            lbl5.setText("★");
            txtInfo.setText("one namber = 4");
            return;
        }


    }

    }

