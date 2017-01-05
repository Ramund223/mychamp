/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI;

import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Emil
 */

public class MainViewController implements Initializable {
    
    public boolean eventStarted = false;
    
    ObservableList<String> listTeams;
    
    @FXML
    private TextField textFieldAddTeam;
    
    @FXML
    private ListView listTeamView;
    
    public MainViewController()
    {
        listTeams = TeamModel.getInstance().getTeam();
    }
    
    @FXML
    private Button groupStageButton;
     
    
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
    
    
    @FXML
    private void addTeam(ActionEvent event) 
    {
        if (!textFieldAddTeam.getText().isEmpty() && eventStarted == false)
        {
            listTeams.add(textFieldAddTeam.getText());
            textFieldAddTeam.clear();
        }
    }
    
    @FXML
    private void editTeam(ActionEvent event) 
    {
        final int selectedItem = listTeamView.getSelectionModel().getSelectedIndex();
        if (selectedItem != -1)
        {
            listTeamView.getItems().get(selectedItem);
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        listTeamView.setItems(listTeams);
    }    
    
    @FXML
    private void startTour(ActionEvent event) 
    {
        if(listTeams.size() >= 12 && listTeams.size() <= 16)
        {
            eventStarted = true;
            System.out.println("Tour started");
        }
        else
        {
            System.out.println("Team is not correct size");
        }
    }

    @FXML
    private void resetTour(ActionEvent event) 
    {
        eventStarted = false;
        listTeamView.getItems().removeAll(listTeams);
        System.out.println("New event initiated");
    }
    
    /*
    NOTE TO EVERYONE!
    Hardcode below, to be removed!
    If you are a teacher, don't look at it!
    Unless you prefer to add 12 teams automatically
    */
    @FXML
    private void addDummy(ActionEvent event) 
    {
        listTeams.add("Alfa");
        listTeams.add("Bravo");
        listTeams.add("Charlie");
        listTeams.add("Delta");
        listTeams.add("Echo");
        listTeams.add("Foxtrot");
        listTeams.add("Golf");
        listTeams.add("Hotel");
        listTeams.add("India");
        listTeams.add("Juliett");
        listTeams.add("Kilo");
        listTeams.add("Lima");
        
    }
}
