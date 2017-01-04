/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
    
    @FXML
    private Button groupStageButton;
    
    public FXMLDocumentController()
    {
        listTeams = FXCollections.observableArrayList();
    }
    
    @FXML
    private void addTeam(ActionEvent event) 
    {
        if (!textFieldAddTeam.getText().isEmpty())
        {
            listTeams.add(textFieldAddTeam.getText());
            textFieldAddTeam.clear();
        }
    }
    
        @FXML
    private void deleteTeam(ActionEvent event) 
    {
        final int selectedItem = listTeamView.getSelectionModel().getSelectedIndex();
        if (selectedItem != -1)
        {
            listTeamView.getItems().remove(selectedItem);
        }
    }
    
    @FXML
    private void testButton2(ActionEvent event) 
    {
        for(int i = 0; i < listTeams.size(); i++) 
        {   
            System.out.println(listTeams.get(i));
        }
            final int selectedIdx = listTeamView.getSelectionModel().getSelectedIndex();
            listTeamView.getItems().remove(selectedIdx);
    }
    
    @FXML
    private void shuffleButton(ActionEvent event) 
    {
        Collections.shuffle(listTeams);
    }
 
  @FXML
 private void groupStage(ActionEvent event) throws IOException
    {
        
        Stage primStage = (Stage)groupStageButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MatchSchedule.fxml"));
        Parent root = loader.load();
  
        Stage stagePlaylist = new Stage();
        stagePlaylist.setScene(new Scene(root));
        
        stagePlaylist.initModality(Modality.WINDOW_MODAL);
        stagePlaylist.initOwner(primStage);
        
        stagePlaylist.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        listTeamView.setItems(listTeams);
    }    
}
