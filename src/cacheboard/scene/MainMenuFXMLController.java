/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cacheboard.scene;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author gheidorn
 */
public class MainMenuFXMLController implements Initializable, ControlledScene {

    SceneController theSceneController;
    
    @FXML
    private Label welcomeLabel;

    @Override
    public void setSceneParent(SceneController sceneController) {
        theSceneController = sceneController;
    }

    @FXML
    private void handleScreenXButtonClick(ActionEvent e) {
        System.out.println("you clicked for screen x");
        
        theSceneController.setScene("ScreenX");
    }

    @FXML
    private void handleScreenYButtonClick(ActionEvent e) {
        System.out.println("you clicked for screen y");
        
        theSceneController.setScene("ScreenY");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
