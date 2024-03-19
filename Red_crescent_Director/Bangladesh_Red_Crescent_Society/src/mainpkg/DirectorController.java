/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import static mainpkg.RegisterAccountController.userDetails;

/**
 * FXML Controller class
 *
 * @author tonoy
 */
public class DirectorController implements Initializable {

    @FXML
    private TableView<RegisterAccount> userDetailsTableView;
    @FXML
    private TableColumn<RegisterAccount,String> usernameTableColomn;
    @FXML
    private TableColumn<RegisterAccount,String> passwordTableColomn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ArrayList<RegisterAccount> userDetails = RegisterAccountController.userDetails;
        usernameTableColomn.setCellValueFactory(new PropertyValueFactory<RegisterAccount,String>("username"));
        passwordTableColomn.setCellValueFactory(new PropertyValueFactory<RegisterAccount,String>("password"));
        
    }    

    @FXML
    private void logoutDirectorButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login_page.fxml"));
        Parent parent = loader.load();

        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();


        Scene loginScene = new Scene(parent);

        currentStage.setScene(loginScene);
        currentStage.show();
    }

    @FXML
    private void viewDetails(ActionEvent event) {
        for ( RegisterAccount re : userDetails){
            userDetailsTableView.getItems().add(re);
        }
    }
    
}
