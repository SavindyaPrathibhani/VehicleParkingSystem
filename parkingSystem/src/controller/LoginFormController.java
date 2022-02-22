package controller;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;



    public void btnLogin(ActionEvent actionEvent) throws IOException {
        if(txtUserName.getText().equals("admin") && txtPassword.getText().equals("1234")){
            URL resource = getClass().getResource("../view/ManagementForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Scene scene = new Scene(load);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Parking System");
            stage.show();
        }else{
            new Alert(Alert.AlertType.ERROR, "Incorrect User Name or Password !", ButtonType.CLOSE).show();
        }
    }
}
