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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Emil
 */

public class FXMLDocumentController implements Initializable {
    
    ObservableList<String> listTeams;
    
    @FXML
    private TextField textFieldAddTeam;
    
    @FXML
    private ListView listTeamView;
    
    public FXMLDocumentController()
    {
        listTeams = FXCollections.observableArrayList();
    }
    
    @FXML
    private void addTeam(ActionEvent event) 
    {
        listTeams.add(textFieldAddTeam.getText());
        textFieldAddTeam.clear();
    }
    
    @FXML
    private void testButton2(ActionEvent event) 
    {
        for(int i = 0; i < listTeams.size(); i++) 
        {   
            System.out.println(listTeams.get(i));
        }
    }
    
    @FXML
    private void shuffleButton(ActionEvent event) 
    {
        Collections.shuffle(listTeams);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        listTeamView.setItems(listTeams);
    }    
}
