/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author troeder
 */
public class TMS extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        URL authViewURL = new File("src\\tms\\view\\Auth.fxml").toURI().toURL();
        //Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        Parent root = FXMLLoader.load(authViewURL);
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
