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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gheidorn
 */
public class MainMenuFXMLController implements Initializable, ControlledScene {

    SceneController theSceneController;

    @FXML
    private MenuBar menuBar;
    
    @FXML
    private RadioMenuItem fullscreenIndicator;

    @FXML
    private WebView webView;

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

    @FXML
    private void fullScreen(ActionEvent event) {
        
        Stage stage = (Stage) menuBar.getScene().getWindow();
        
        System.out.println("fullscreen? " + stage.isFullScreen());
        System.out.println("fullscreen indicator? " + fullscreenIndicator.isSelected());
        
        if (stage.isFullScreen()) {
            fullscreenIndicator.setSelected(false);
            stage.setFullScreen(false);
        } else {
            fullscreenIndicator.setSelected(true);
            stage.setFullScreen(true);
        }
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // recognize if the application startedin fullscreen mode
        /*
        Stage stage = (Stage) menuBar.getScene().getWindow();
        if (stage.isFullScreen()) {
            fullscreenIndicator.setSelected(false);
        } else {
            fullscreenIndicator.setSelected(true);
        }
        */
        
        // load the introduction video
        webView.getEngine().load("http://www.youtube.com/embed/lJ-km1DDQmg");
    }
}
