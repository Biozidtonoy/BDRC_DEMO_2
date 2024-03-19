/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;

import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tonoy
 */
public class RegisterAccountController implements Initializable {

    @FXML
    private TextField usernameRegisterTXT;
    @FXML
    private PasswordField passwordRegisterTXT;
    @FXML
    private DatePicker birthdayPicker;
    @FXML
    private ComboBox<String> questionComboBox;
    @FXML
    private TextField answerTXT;
    Alert unfilled = new Alert(Alert.AlertType.WARNING,"Please Enter Everything!");
    Alert success = new Alert(Alert.AlertType.INFORMATION,"Congratulation your account has been created ");
    
    public static ArrayList<RegisterAccount> userDetails = new ArrayList<>();
    public static ArrayList<String> username = new ArrayList<>();
    public static ArrayList<String> userpass = new ArrayList<>();
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        questionComboBox.getItems().addAll("whats your favourite colour","what is your pet name","what is your dream job");
        
    }    

    @FXML
    private void signupButton(ActionEvent event) {
        String userName = usernameRegisterTXT.getText();
        String userPass = passwordRegisterTXT.getText();
        LocalDate birthday = birthdayPicker.getValue();
        String ques = questionComboBox.getValue();
        String ans = answerTXT.getText();
        
        RegisterAccount r = new RegisterAccount(userName,userPass,birthday,ques,ans);
        userDetails.add(r);
        
        username.add(userName);
        userpass.add(userPass);
        
        
//        userDetails.add(userName);
//        userDetails.add(userPass);
//        userDetails.add(ques);
//        userDetails.add(ans);
        
        
        
        
//        fileoutstream
 
        
        
        
       
//        any textfield is empty or not
        boolean anyEmpty = false;
        if(usernameRegisterTXT.getText().isEmpty()||
                passwordRegisterTXT.getText().isEmpty()||
                answerTXT.getText().isEmpty()||birthdayPicker.getValue()==null){
            anyEmpty = true ;
           
        }
        if (anyEmpty){
            unfilled.show();
            return;
        }
        success.show();
    }

    @FXML
    private void alreadyHaveAccountButton(ActionEvent event) throws IOException {
//        Scene Switching
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login_page.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene loginScene = new Scene(parent);

        currentStage.setScene(loginScene);
        currentStage.show();
    }

    @FXML
    private void backButtonRegister(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login_page.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene loginScene = new Scene(parent);

        currentStage.setScene(loginScene);
        currentStage.show();
    }
    
}
