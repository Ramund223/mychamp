/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import mycham.BE.Team;

/**
 *
 * @author Emil
 */
public class TeamController 
{
    @FXML
    private Label labelId;
    @FXML
    private Label labelName;
    @FXML
    private Label labelGoals;
    @FXML
    private Label labelPoints;
    @FXML
    private Button teamClose;
    private Team team; 
    
    //This method fills the labels
    public void setTeam(Team team)
    {
        this.team = team;
        labelInfo();
    }
    
    //This method show the teams infomation
    private void labelInfo()
    {
        labelName.setText("Team Name: " + team.getName());
        labelId.setText("ID: " + team.getId() + "");
        labelGoals.setText("Goals: " + team.getGoals() + "");
        labelPoints.setText("Points: " + team.getPoints() + "");
    }
    
    //This method closes the match schedule window by pressing the "Close" button.
    @FXML
    private void teamClose(ActionEvent event) 
    {
        Stage stage = (Stage) teamClose.getScene().getWindow();
        stage.close();
    }
    
    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb)
    {
    } 
}
