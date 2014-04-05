/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cacheboard;

import cacheboard.scene.SceneController;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author gheidorn
 */
public class Cacheboard extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        SceneController sceneController = new SceneController();
        sceneController.loadScreen("MainMenu", "MainMenu.fxml");
        sceneController.loadScreen("ScreenX", "ScreenX.fxml");
        sceneController.loadScreen("ScreenY", "ScreenY.fxml");
        
        sceneController.setScene("MainMenu");
        
        Group root = new Group();
        root.getChildren().addAll(sceneController);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
