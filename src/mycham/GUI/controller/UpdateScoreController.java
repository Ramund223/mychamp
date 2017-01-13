/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mycham.BE.Team;
import mycham.GUI.Model.TeamModel;

/**
 * FXML Controller class
 *
 * @author Nicolai
 */
public class UpdateScoreController implements Initializable {
    
    @FXML
    private Button updateScoreClose;
    @FXML
    private TextField homePointsTextfield;
    @FXML
    private Label homeTeam;
    @FXML
    private Label guestTeam;
    ObservableList<Team> listTeams;
    
    public UpdateScoreController() 
    {
        listTeams = TeamModel.getInstance().getTeam();
    }
    @FXML
    private void updateTeams()
    {
        homeTeam.setText("Hjemmebane: "+ "(" + listTeams.get(0) + ")");
        guestTeam.setText("Udebane: "+ "(" + listTeams.get(1) + ")");
        
        listTeams.get(0).setGoals(0);
    }
    
    @FXML
    private void updateScoreClose(ActionEvent event) 
    {
        Stage stage = (Stage) updateScoreClose.getScene().getWindow();
        stage.close();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        updateTeams();
    }    
    
}
