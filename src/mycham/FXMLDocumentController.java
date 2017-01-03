/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Emil
 */
public class FXMLDocumentController implements Initializable {
    
    ArrayList<String> teams = new ArrayList<String>();
    
    @FXML
    private Label label;
    
    @FXML
    private TextField addTeam;
    
    
    @FXML
    private void addTeam(ActionEvent event) {

        teams.add(addTeam.getText());
        addTeam.clear();
        
    }
    
    @FXML
    private void testButton2(ActionEvent event) {

        for(int i = 0; i < teams.size(); i++) {   
        System.out.print(teams.get(i));
}

    }
    
    @FXML
    private void shuffleButton(ActionEvent event) {

        Collections.shuffle(teams);

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
