/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author troeder
 */
public class AuthController implements Initializable {
    
    @FXML
    private Button btnLogin;
    
    @FXML
    private void btnLoginPressed(ActionEvent event) throws Exception {
        URL authViewURL = new File("src\\tms\\view\\App.fxml").toURI().toURL();
        //Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        Parent root = FXMLLoader.load(authViewURL);
       
            Scene scene = new Scene(root);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.centerOnScreen();
            appStage.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
