/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cacheboard;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 *
 * @author gheidorn
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label selectedCacheLabel;
    
    @FXML
    private TableView tableView;
    
    @FXML
    private Button chooseCacheButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        selectedCacheLabel.setText("Hello World!");
        
        NamedCache cache = CacheFactory.getCache("ReferenceCache");
        System.out.println("Cache accessed...");
        System.out.println(cache);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
