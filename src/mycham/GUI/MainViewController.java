/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI;

import mycham.GUI.Model.TeamModel;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
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
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import mycham.BE.Team;

/**
 *
 * @author Emil
 */

public class MainViewController implements Initializable {
    
    public boolean eventStarted = false;
    
    private TeamModel teamModel;
    
    private Team team;
    
    @FXML
    private TextField textFieldAddTeam;
    
    @FXML
    private ListView listTeamView;
    
    @FXML
    private Button finalsButton;
    
    @FXML
    private Label publicMessageLabel;
    
    public MainViewController()
    {
        teamModel = TeamModel.getInstance();
    }
    
    @FXML
    private Button groupStageButton;
     
    
    @FXML
    private void groupStage(ActionEvent event) throws IOException
    {
        
        Stage primStage = (Stage)groupStageButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MatchSchedule.fxml"));
        Parent root = loader.load();
  
        Stage stageMainView = new Stage();
        stageMainView.setScene(new Scene(root));
        
        stageMainView.setTitle("Group Stage");
        
        stageMainView.initModality(Modality.WINDOW_MODAL);
        stageMainView.initOwner(primStage);
        
        stageMainView.show();
    }
    
    @FXML
    private void finals(ActionEvent event) throws IOException
    {
        Stage primStage = (Stage)finalsButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Finals.fxml"));
        Parent root = loader.load();
  
        Stage stageFinals = new Stage();
        stageFinals.setScene(new Scene(root));
        
        stageFinals.setTitle("Finals");
        
        stageFinals.initModality(Modality.WINDOW_MODAL);
        stageFinals.initOwner(primStage);
        
        stageFinals.show();
    }
    
    
    @FXML
    private void addTeam(ActionEvent event) 
    {
        addTeamMethod();
    }
    
    public void addTeamMethod ()
    {
        if (!textFieldAddTeam.getText().isEmpty() && eventStarted == false)
        {
            teamModel.createTeam(textFieldAddTeam.getText());
            textFieldAddTeam.clear();
        }
    }
    
    @FXML
    public void handleEnterPressed(KeyEvent event)
    {
        if (event.getCode() == KeyCode.ENTER) 
        {
            addTeamMethod();
        }
    }
    
    @FXML
    private void editTeam(ActionEvent event) 
    {
        final int selectedItem = listTeamView.getSelectionModel().getSelectedIndex();
        if (selectedItem != -1)
        {
            if(textFieldAddTeam.getText().isEmpty())
            {
                textFieldAddTeam.setText((String) listTeamView.getItems().get(selectedItem));
            }
            else
            {
                teamModel.getTeam().get(selectedItem).setName(textFieldAddTeam.getText());
            }
        }
    }
    
    @FXML
    private void deleteTeam(ActionEvent event)
    {
        final int selectedItem = listTeamView.getSelectionModel().getSelectedIndex();
        if (selectedItem != -1 && eventStarted == false)
        {
            listTeamView.getItems().remove(selectedItem);
        }
        else if(selectedItem != -1 && eventStarted == true)
        {
            textFieldAddTeam.clear();
            teamModel.getTeam().remove(selectedItem);
        }
    }
    
    
    //DELETE THIS -v
    @FXML
    private void testButton2(ActionEvent event) 
    {
        for(int i = 0; i < teamModel.getTeam().size(); i++) 
        {   
            System.out.println(teamModel.getTeam().get(i));
        }
    }
    
    @FXML
    private void shuffleButton(ActionEvent event) 
    {
        Collections.shuffle(teamModel.getTeam());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        listTeamView.setItems(teamModel.getTeam());
//        listTeamView.setItems(team.getName());
    }    
    
    @FXML
    private void startTour(ActionEvent event) 
    {
        if(teamModel.getTeam().size() >= 12 && teamModel.getTeam().size() <= 16)
        {
            eventStarted = true;
            publicMessageLabel.setText("Tour started!");
        }
        else
        {
            publicMessageLabel.setText("Team is not correct size!");
        }
    }

    @FXML
    private void resetTour(ActionEvent event) 
    {
        eventStarted = false;
        listTeamView.getItems().removeAll(teamModel.getTeam());
        publicMessageLabel.setText("New event initiated!");
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
        if(eventStarted == false)
        {
            teamModel.getTeam().add(new Team("Alpha"));
            teamModel.getTeam().add(new Team("Bravo"));
            teamModel.getTeam().add(new Team("Charlie"));
            teamModel.getTeam().add(new Team("Delta"));
            teamModel.getTeam().add(new Team("Echo"));
            teamModel.getTeam().add(new Team("Foxtrot"));
            teamModel.getTeam().add(new Team("Golf"));
            teamModel.getTeam().add(new Team("Hotel"));
            teamModel.getTeam().add(new Team("India"));
            teamModel.getTeam().add(new Team("Juliett"));
            teamModel.getTeam().add(new Team("Kilo"));
            teamModel.getTeam().add(new Team("Magic Mike"));
            
        }       
    }
}
