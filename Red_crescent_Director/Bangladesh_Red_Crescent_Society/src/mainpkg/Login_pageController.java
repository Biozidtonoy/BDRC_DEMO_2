/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import helperClass.Utility;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tonoy
 */
public class Login_pageController implements Initializable {

    @FXML
    private TextField usernameTXTField;
    @FXML
    private PasswordField passwordTXTField;
    @FXML
    private Hyperlink forgotPasswordHyperlink;
//   Alert Type  
    Alert invaldInput = new Alert(Alert.AlertType.INFORMATION,"invalid username and password");
    

    
//    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
    }    

    @FXML
    private void loginButton(ActionEvent event) throws IOException {
        
        
        String enteredUserName = usernameTXTField.getText();
        String enteredPassword = passwordTXTField.getText();

        ArrayList<String> username = RegisterAccountController.username;
        ArrayList<String> userpass = RegisterAccountController.userpass;

        boolean validLogin = false;

        for (int i = 0; i < username.size(); i++) {
            if (username.get(i).equals(enteredUserName)&& userpass.get(i).equals(enteredPassword)){
                validLogin = true;
                break;
            }
        }
              
        if(validLogin){
//        Scene Switching
        FXMLLoader loader = new FXMLLoader(getClass().getResource("director.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene directorScene = new Scene(parent);

        currentStage.setScene(directorScene);
        currentStage.show();     
        }else{
            invaldInput.show();
        }
    }

    @FXML
    private void registerButton(ActionEvent event) throws IOException, Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("registerAccount.fxml"));
        Parent parent = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene registerScene = new Scene(parent);
        
        currentStage.setScene(registerScene);
        currentStage.show();
//          Utility.changeToScene (getClass(),event,"registerAccount.Fxml");


    }
    
}
