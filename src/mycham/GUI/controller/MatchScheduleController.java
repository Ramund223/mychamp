/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI.controller;

import java.io.IOException;
import java.net.URL;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import mycham.BE.Team;
import mycham.GUI.Model.TeamModel;

/**
 * FXML Controller class
 *
 * @author Nicolai
 */
public class MatchScheduleController implements Initializable {
    
    @FXML
    private Button matchScheduleClose;
    @FXML
    private Label publicMessageLabel;
    @FXML
    private Label match1A;
    @FXML
    private Label match2A;
    @FXML
    private Label match3A;
    @FXML
    private Label match4A;
    @FXML
    private Label match5A;
    @FXML
    private Label match6A;
    @FXML
    private Label match7A;
    @FXML
    private Label match8A;
    @FXML
    private Label match9A;
    @FXML
    private Label match10A;
    @FXML
    private Label match11A;
    @FXML
    private Label match12A;
    @FXML
    private Label match1B;
    @FXML
    private Label match2B;
    @FXML
    private Label match3B;
    @FXML
    private Label match4B;
    @FXML
    private Label match5B;
    @FXML
    private Label match6B;
    @FXML
    private Label match7B;
    @FXML
    private Label match8B;
    @FXML
    private Label match9B;
    @FXML
    private Label match10B;
    @FXML
    private Label match11B;
    @FXML
    private Label match12B;
    @FXML
    private Label match1C;
    @FXML
    private Label match2C;
    @FXML
    private Label match3C;
    @FXML
    private Label match4C;
    @FXML
    private Label match5C;
    @FXML
    private Label match6C;
    @FXML
    private Label match7C;
    @FXML
    private Label match8C;
    @FXML
    private Label match9C;
    @FXML
    private Label match10C;
    @FXML
    private Label match11C;
    @FXML
    private Label match12C;
    @FXML
    private Label match1D;
    @FXML
    private Label match2D;
    @FXML
    private Label match3D;
    @FXML
    private Label match4D;
    @FXML
    private Label match5D;
    @FXML
    private Label match6D;
    @FXML
    private Label match7D;
    @FXML
    private Label match8D;
    @FXML
    private Label match9D;
    @FXML
    private Label match10D;
    @FXML
    private Label match11D;
    @FXML
    private Label match12D;
    @FXML
    private Label group1HomeLabel;
    @FXML
    private Label group1TieLabel;
    @FXML
    private Label group1OutLabel;
    @FXML
    private Label group2HomeLabel;
    @FXML
    private Label group2TieLabel;
    @FXML
    private Label group2OutLabel;
    @FXML
    private Label group3HomeLabel;
    @FXML
    private Label group3TieLabel;
    @FXML
    private Label group3OutLabel;
    @FXML
    private Label group4HomeLabel;
    @FXML
    private Label group4TieLabel;
    @FXML
    private Label group4OutLabel;
    @FXML
    private Label group2Label;
    @FXML
    private Label group3Label;
    @FXML
    private Label group1Label;
    @FXML
    private Label group4Label;
    
    private MainViewController mainClass;
    ObservableList<Team> listTeams;
    
    private int Group1Counter = 0;
    private int Group2Counter = 0;
    private int Group3Counter = 0;
    private int Group4Counter = 0;
   
    public MatchScheduleController() 
    {
        listTeams = TeamModel.getInstance().getTeam();
    }
    
    @FXML
    private void updateTeams()
    {
        if (listTeams.size() >= 12 && listTeams.size() <= 16)
        {
        //Group A
        if (listTeams.size() <= 12)
        {
            match1A.setText("Hjem: "+ "(" + listTeams.get(0) + ")" + " VS " + "Ude: " + "(" + listTeams.get(4) + ")");
            match3A.setText("Hjem: "+ "(" + listTeams.get(4) + ")" + " VS " + "Ude: " + "(" + listTeams.get(8) + ")");
            match5A.setText("Hjem: "+ "(" + listTeams.get(8) + ")" + " VS " + "Ude: " + "(" + listTeams.get(0) + ")");
            match7A.setText("Hjem: "+ "(" + listTeams.get(4) + ")" + " VS " + "Ude: " + "(" + listTeams.get(0) + ")");
            match9A.setText("Hjem: "+ "(" + listTeams.get(8) + ")" + " VS " + "Ude: " + "(" + listTeams.get(4) + ")");
            match11A.setText("Hjem: "+ "(" + listTeams.get(0) + ")" + " VS " + "Ude: " + "(" + listTeams.get(8) + ")");
        }
        if (listTeams.size() >= 13)
        {
            match1A.setText("Hjem: "+ "(" + listTeams.get(0) + ")" + " VS " + "Ude: " + "(" + listTeams.get(4) + ")");
            match2A.setText("Hjem: "+ "(" + listTeams.get(8) + ")" + " VS " + "Ude: " + "(" + listTeams.get(12) + ")");
            match3A.setText("Hjem: "+ "(" + listTeams.get(4) + ")" + " VS " + "Ude: " + "(" + listTeams.get(0) + ")");
            match4A.setText("Hjem: "+ "(" + listTeams.get(12) + ")" + " VS " + "Ude: " + "(" + listTeams.get(8) + ")");
            match5A.setText("Hjem: "+ "(" + listTeams.get(0) + ")" + " VS " + "Ude: " + "(" + listTeams.get(8) + ")");
            match6A.setText("Hjem: "+ "(" + listTeams.get(4) + ")" + " VS " + "Ude: " + "(" + listTeams.get(12) + ")");
            match7A.setText("Hjem: "+ "(" + listTeams.get(8) + ")" + " VS " + "Ude: " + "(" + listTeams.get(0) + ")");
            match8A.setText("Hjem: "+ "(" + listTeams.get(12) + ")" + " VS " + "Ude: " + "(" + listTeams.get(4) + ")");
            match9A.setText("Hjem: "+ "(" + listTeams.get(0) + ")" + " VS " + "Ude: " + "(" + listTeams.get(12) + ")");
            match10A.setText("Hjem: "+ "(" + listTeams.get(4) + ")" + " VS " + "Ude: " + "(" + listTeams.get(8) + ")");
            match11A.setText("Hjem: "+ "(" + listTeams.get(8) + ")" + " VS " + "Ude: " + "(" + listTeams.get(4) + ")");
            match12A.setText("Hjem: "+ "(" + listTeams.get(12) + ")" + " VS " + "Ude: " + "(" + listTeams.get(0) + ")");
        }
            
        //Group B
        if (listTeams.size() <= 13)
        {
            match1B.setText("Hjem: "+ "(" + listTeams.get(1) + ")" + " VS " + "Ude: " + "(" + listTeams.get(5) + ")");
            match3B.setText("Hjem: "+ "(" + listTeams.get(5) + ")" + " VS " + "Ude: " + "(" + listTeams.get(9) + ")");
            match5B.setText("Hjem: "+ "(" + listTeams.get(9) + ")" + " VS " + "Ude: " + "(" + listTeams.get(1) + ")");
            match7B.setText("Hjem: "+ "(" + listTeams.get(5) + ")" + " VS " + "Ude: " + "(" + listTeams.get(1) + ")");
            match9B.setText("Hjem: "+ "(" + listTeams.get(9) + ")" + " VS " + "Ude: " + "(" + listTeams.get(5) + ")");
            match11B.setText("Hjem: "+ "(" + listTeams.get(1) + ")" + " VS " + "Ude: " + "(" + listTeams.get(9) + ")");
        }
        if (listTeams.size() >= 14)
        {
            match1B.setText("Hjem: "+ "(" + listTeams.get(1) + ")" + " VS " + "Ude: " + "(" + listTeams.get(5) + ")");
            match2B.setText("Hjem: "+ "(" + listTeams.get(9) + ")" + " VS " + "Ude: " + "(" + listTeams.get(13) + ")");
            match3B.setText("Hjem: "+ "(" + listTeams.get(5) + ")" + " VS " + "Ude: " + "(" + listTeams.get(1) + ")");
            match4B.setText("Hjem: "+ "(" + listTeams.get(13) + ")" + " VS " + "Ude: " + "(" + listTeams.get(9) + ")");
            match5B.setText("Hjem: "+ "(" + listTeams.get(1) + ")" + " VS " + "Ude: " + "(" + listTeams.get(9) + ")");
            match6B.setText("Hjem: "+ "(" + listTeams.get(5) + ")" + " VS " + "Ude: " + "(" + listTeams.get(13) + ")");
            match7B.setText("Hjem: "+ "(" + listTeams.get(9) + ")" + " VS " + "Ude: " + "(" + listTeams.get(1) + ")");
            match8B.setText("Hjem: "+ "(" + listTeams.get(13) + ")" + " VS " + "Ude: " + "(" + listTeams.get(5) + ")");
            match9B.setText("Hjem: "+ "(" + listTeams.get(1) + ")" + " VS " + "Ude: " + "(" + listTeams.get(13) + ")");
            match10B.setText("Hjem: "+ "(" + listTeams.get(5) + ")" + " VS " + "Ude: " + "(" + listTeams.get(9) + ")");
            match11B.setText("Hjem: "+ "(" + listTeams.get(9) + ")" + " VS " + "Ude: " + "(" + listTeams.get(5) + ")");
            match12B.setText("Hjem: "+ "(" + listTeams.get(13) + ")" + " VS " + "Ude: " + "(" + listTeams.get(1) + ")");
        }
        
        //Group C
        if (listTeams.size() <= 14)
        {
            match1C.setText("Hjem: "+ "(" + listTeams.get(2) + ")" + " VS " + "Ude: " + "(" + listTeams.get(6) + ")");
            match3C.setText("Hjem: "+ "(" + listTeams.get(6) + ")" + " VS " + "Ude: " + "(" + listTeams.get(10) + ")");
            match5C.setText("Hjem: "+ "(" + listTeams.get(10) + ")" + " VS " + "Ude: " + "(" + listTeams.get(2) + ")");
            match7C.setText("Hjem: "+ "(" + listTeams.get(6) + ")" + " VS " + "Ude: " + "(" + listTeams.get(2) + ")");
            match9C.setText("Hjem: "+ "(" + listTeams.get(10) + ")" + " VS " + "Ude: " + "(" + listTeams.get(6) + ")");
            match11C.setText("Hjem: "+ "(" + listTeams.get(2) + ")" + " VS " + "Ude: " + "(" + listTeams.get(10) + ")");
        }
        if (listTeams.size() >= 15)
        {
            match1C.setText("Hjem: "+ "(" + listTeams.get(2) + ")" + " VS " + "Ude: " + "(" + listTeams.get(6) + ")");
            match2C.setText("Hjem: "+ "(" + listTeams.get(10) + ")" + " VS " + "Ude: " + "(" + listTeams.get(14) + ")");
            match3C.setText("Hjem: "+ "(" + listTeams.get(6) + ")" + " VS " + "Ude: " + "(" + listTeams.get(2) + ")");
            match4C.setText("Hjem: "+ "(" + listTeams.get(14) + ")" + " VS " + "Ude: " + "(" + listTeams.get(10) + ")");
            match5C.setText("Hjem: "+ "(" + listTeams.get(2) + ")" + " VS " + "Ude: " + "(" + listTeams.get(10) + ")");
            match6C.setText("Hjem: "+ "(" + listTeams.get(6) + ")" + " VS " + "Ude: " + "(" + listTeams.get(14) + ")");
            match7C.setText("Hjem: "+ "(" + listTeams.get(10) + ")" + " VS " + "Ude: " + "(" + listTeams.get(2) + ")");
            match8C.setText("Hjem: "+ "(" + listTeams.get(14) + ")" + " VS " + "Ude: " + "(" + listTeams.get(6) + ")");
            match9C.setText("Hjem: "+ "(" + listTeams.get(2) + ")" + " VS " + "Ude: " + "(" + listTeams.get(14) + ")");
            match10C.setText("Hjem: "+ "(" + listTeams.get(6) + ")" + " VS " + "Ude: " + "(" + listTeams.get(10) + ")");
            match11C.setText("Hjem: "+ "(" + listTeams.get(10) + ")" + " VS " + "Ude: " + "(" + listTeams.get(6) + ")");
            match12C.setText("Hjem: "+ "(" + listTeams.get(14) + ")" + " VS " + "Ude: " + "(" + listTeams.get(2) + ")");
        }
            
        //Group D
        if (listTeams.size() <= 15)
        {
            match1D.setText("Hjem: "+ "(" + listTeams.get(3) + ")" + " VS " + "Ude: " + "(" + listTeams.get(7) + ")");
            match3D.setText("Hjem: "+ "(" + listTeams.get(7) + ")" + " VS " + "Ude: " + "(" + listTeams.get(11) + ")");
            match5D.setText("Hjem: "+ "(" + listTeams.get(11) + ")" + " VS " + "Ude: " + "(" + listTeams.get(3) + ")");
            match7D.setText("Hjem: "+ "(" + listTeams.get(7) + ")" + " VS " + "Ude: " + "(" + listTeams.get(3) + ")");
            match9D.setText("Hjem: "+ "(" + listTeams.get(11) + ")" + " VS " + "Ude: " + "(" + listTeams.get(7) + ")");
            match11D.setText("Hjem: "+ "(" + listTeams.get(3) + ")" + " VS " + "Ude: " + "(" + listTeams.get(11) + ")");
        }
        if (listTeams.size() == 16)
        {
            match1D.setText("Hjem: "+ "(" + listTeams.get(3) + ")" + " VS " + "Ude: " + "(" + listTeams.get(7) + ")");
            match2D.setText("Hjem: "+ "(" + listTeams.get(11) + ")" + " VS " + "Ude: " + "(" + listTeams.get(15) + ")");
            match3D.setText("Hjem: "+ "(" + listTeams.get(7) + ")" + " VS " + "Ude: " + "(" + listTeams.get(3) + ")");
            match4D.setText("Hjem: "+ "(" + listTeams.get(15) + ")" + " VS " + "Ude: " + "(" + listTeams.get(11) + ")");
            match5D.setText("Hjem: "+ "(" + listTeams.get(3) + ")" + " VS " + "Ude: " + "(" + listTeams.get(11) + ")");
            match6D.setText("Hjem: "+ "(" + listTeams.get(7) + ")" + " VS " + "Ude: " + "(" + listTeams.get(15) + ")");
            match7D.setText("Hjem: "+ "(" + listTeams.get(11) + ")" + " VS " + "Ude: " + "(" + listTeams.get(3) + ")");
            match8D.setText("Hjem: "+ "(" + listTeams.get(15) + ")" + " VS " + "Ude: " + "(" + listTeams.get(7) + ")");
            match9D.setText("Hjem: "+ "(" + listTeams.get(3) + ")" + " VS " + "Ude: " + "(" + listTeams.get(15) + ")");
            match10D.setText("Hjem: "+ "(" + listTeams.get(7) + ")" + " VS " + "Ude: " + "(" + listTeams.get(11) + ")");
            match11D.setText("Hjem: "+ "(" + listTeams.get(11) + ")" + " VS " + "Ude: " + "(" + listTeams.get(7) + ")");
            match12D.setText("Hjem: "+ "(" + listTeams.get(15) + ")" + " VS " + "Ude: " + "(" + listTeams.get(3) + ")");
        }
        }
        
        if (listTeams.size() < 12 || listTeams.size() > 16 || listTeams.isEmpty())
        {
            publicMessageLabel.setText("Not enought teams or too few teams! Choose between 12 and 16 team!");
        }
    }
    
    //This method closes the match schedule window by pressing the "Close" button.
    @FXML
    private void matchScheduleClose(ActionEvent event) 
    {
        Stage stage = (Stage) matchScheduleClose.getScene().getWindow();
        stage.close();
    }
    
    private void matchPoints() 
    {
        group1Label.setText("Match 1");
        group2Label.setText("Match 1");
        group3Label.setText("Match 1");
        group4Label.setText("Match 1");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        updateTeams();
        matchPoints();
    }    

    @FXML
    private void group1Home(ActionEvent event) 
    {
        if (listTeams.size() <= 12 )
        {
            if(Group1Counter == 0)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("Match 2");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 1)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 3");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 2)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("Match 4");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 3)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 5");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 4)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("Match 6");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 5)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("All Matches done");
                Group1Counter = Group1Counter + 1;
            }
        }
        else if(listTeams.size() >= 13)
        {
            if(Group1Counter == 0)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("Match 2");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 1)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("Match 3");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 2)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 4");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 3)
            {
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 3);
                group1Label.setText("Match 5");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 4)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("Match 6");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 5)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 7");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 6)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("Match 8");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 7)
            {
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 3);
                group1Label.setText("Match 9");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 8)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("Match 10");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 9)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 11");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 10)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("Match 12");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 11)
            {
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 3);
                group1Label.setText("All Matches done");
                Group1Counter = Group1Counter + 1;
            }
        }
    }

    @FXML
    private void group1Tie(ActionEvent event) 
    {
        if (listTeams.size() <= 12 )
        {
            if(Group1Counter == 0)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                group1Label.setText("Match 2");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 1)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                group1Label.setText("Match 3");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 2)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                group1Label.setText("Match 4");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 3)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                group1Label.setText("Match 5");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 4)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                group1Label.setText("Match 6");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 5)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                group1Label.setText("All Matches done");
                Group1Counter = Group1Counter + 1;
            }
        }
        else if(listTeams.size() >= 13)
        {
            if(Group1Counter == 0)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                group1Label.setText("Match 2");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 1)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 1);
                group1Label.setText("Match 3");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 2)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                group1Label.setText("Match 4");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 3)
            {
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 1);
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                group1Label.setText("Match 5");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 4)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                group1Label.setText("Match 6");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 5)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 1);
                group1Label.setText("Match 7");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 6)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                group1Label.setText("Match 8");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 7)
            {
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 3);
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                group1Label.setText("Match 9");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 8)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 1);
                group1Label.setText("Match 10");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 9)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                group1Label.setText("Match 11");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 10)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 1);
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 1);
                group1Label.setText("Match 12");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 11)
            {
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 1);
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
                group1Label.setText("All Matches done");
                Group1Counter = Group1Counter + 1;
            }
        }
    }

    @FXML
    private void group1Out(ActionEvent event) 
    {
        if (listTeams.size() <= 12 )
        {
            if(Group1Counter == 0)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 2");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 1)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("Match 3");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 2)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("Match 4");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 3)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("Match 5");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 4)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 6");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 5)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("All Matches done");
                Group1Counter = Group1Counter + 1;
            }
        }
        else if(listTeams.size() >= 13)
        {
            if(Group1Counter == 0)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 2");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 1)
            {
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 3);
                group1Label.setText("Match 3");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 2)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("Match 4");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 3)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("Match 5");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 4)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("Match 6");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 5)
            {
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 3);
                group1Label.setText("Match 7");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 6)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("Match 8");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 7)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 9");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 8)
            {
                listTeams.get(12).setPoints(listTeams.get(12).getPoints() + 3);
                group1Label.setText("Match 10");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 9)
            {
                listTeams.get(8).setPoints(listTeams.get(8).getPoints() + 3);
                group1Label.setText("Match 11");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 10)
            {
                listTeams.get(4).setPoints(listTeams.get(4).getPoints() + 3);
                group1Label.setText("Match 12");
                Group1Counter = Group1Counter + 1;
            }
            else if(Group1Counter == 11)
            {
                listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 3);
                group1Label.setText("All Matches done");
                Group1Counter = Group1Counter + 1;
            }
        }
    }

    @FXML
    private void group2Home(ActionEvent event) 
    {
        if (listTeams.size() <= 13 )
        {
            if(Group2Counter == 0)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("Match 2");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 1)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 3");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 2)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("Match 4");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 3)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 5");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 4)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("Match 6");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 5)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("All matches done");
                Group2Counter = Group2Counter + 1;
            }
        }
        else if(listTeams.size() >= 14)
        {
            if(Group2Counter == 0)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("Match 2");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 1)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("Match 3");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 2)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 4");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 3)
            {
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 3);
                group2Label.setText("Match 5");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 4)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("Match 6");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 5)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 7");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 6)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("Match 8");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 7)
            {
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 3);
                group2Label.setText("Match 9");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 8)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("Match 10");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 9)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 11");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 10)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("Match 12");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 11)
            {
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 3);
                group2Label.setText("All matches done");
                Group2Counter = Group2Counter + 1;
            }
        }
    }

    @FXML
    private void group2Tie(ActionEvent event) 
    {
        if (listTeams.size() <= 13 )
        {
            if(Group2Counter == 0)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                group2Label.setText("Match 2");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 1)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                group2Label.setText("Match 3");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 2)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                group2Label.setText("Match 4");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 3)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                group2Label.setText("Match 5");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 4)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                group2Label.setText("Match 6");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 5)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                group2Label.setText("All matches done");
                Group2Counter = Group2Counter + 1;
            }
        }
        else if(listTeams.size() >= 14)
        {
            if(Group2Counter == 0)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                group2Label.setText("Match 2");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 1)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 1);
                group2Label.setText("Match 3");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 2)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                group2Label.setText("Match 4");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 3)
            {
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 1);
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                group2Label.setText("Match 5");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 4)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                group2Label.setText("Match 6");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 5)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 1);
                group2Label.setText("Match 7");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 6)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                group2Label.setText("Match 8");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 7)
            {
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 1);
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                group2Label.setText("Match 9");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 8)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 1);
                group2Label.setText("Match 10");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 9)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                group2Label.setText("Match 11");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 10)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 1);
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 1);
                group2Label.setText("Match 12");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 11)
            {
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 1);
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 1);
                group2Label.setText("All matches done");
                Group2Counter = Group2Counter + 1;
            }
        }
    }
    
    @FXML
    private void group2Out(ActionEvent event) 
    {
        if (listTeams.size() <= 13 )
        {
            if(Group2Counter == 0)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 2");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 1)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("Match 3");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 2)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("Match 4");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group1Counter == 3)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("Match 5");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 4)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 6");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 5)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("All matches done");
                Group2Counter = Group2Counter + 1;
            }
        }
        else if(listTeams.size() >= 14)
        {
            if(Group2Counter == 0)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 2");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 1)
            {
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 3);
                group2Label.setText("Match 3");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 2)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("Match 4");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 3)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("Match 5");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 4)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("Match 6");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 5)
            {
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 3);
                group2Label.setText("Match 7");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 6)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("Match 8");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 7)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 9");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 8)
            {
                listTeams.get(13).setPoints(listTeams.get(13).getPoints() + 3);
                group2Label.setText("Match 10");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 9)
            {
                listTeams.get(9).setPoints(listTeams.get(9).getPoints() + 3);
                group2Label.setText("Match 11");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 10)
            {
                listTeams.get(5).setPoints(listTeams.get(5).getPoints() + 3);
                group2Label.setText("Match 12");
                Group2Counter = Group2Counter + 1;
            }
            else if(Group2Counter == 11)
            {
                listTeams.get(1).setPoints(listTeams.get(1).getPoints() + 3);
                group2Label.setText("All matches done");
                Group2Counter = Group2Counter + 1;
            }
        }
    }

    @FXML
    private void group3Home(ActionEvent event) 
    {
        if (listTeams.size() <= 14 )
        {
            if(Group3Counter == 0)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("Match 2");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 1)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 3");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 2)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("Match 4");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 3)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 5");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 4)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("Match 6");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 5)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("All matches done");
                Group3Counter = Group3Counter + 1;
            }
        }
        else if(listTeams.size() >= 15)
        {
            if(Group3Counter == 0)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("Match 2");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 1)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("Match 3");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 2)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 4");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 3)
            {
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 3);
                group3Label.setText("Match 5");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 4)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("Match 6");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 5)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 7");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 6)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("Match 8");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 7)
            {
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 3);
                group3Label.setText("Match 9");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 8)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("Match 10");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 9)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 11");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 10)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("Match 12");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 11)
            {
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 3);
                group3Label.setText("All matches done");
                Group3Counter = Group3Counter + 1;
            }
        }
    }

    @FXML
    private void group3Tie(ActionEvent event) 
    {
        if (listTeams.size() <= 14 )
        {
            if(Group3Counter == 0)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                group3Label.setText("Match 2");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 1)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                group3Label.setText("Match 3");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 2)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                group3Label.setText("Match 4");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 3)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                group3Label.setText("Match 5");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 4)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                group3Label.setText("Match 6");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 5)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                group3Label.setText("All matches done");
                Group3Counter = Group3Counter + 1;
            }
        }
        else if(listTeams.size() >= 15)
        {
            if(Group3Counter == 0)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                group3Label.setText("Match 2");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 1)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 1);
                group3Label.setText("Match 3");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 2)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                group3Label.setText("Match 4");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 3)
            {
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 1);
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                group3Label.setText("Match 5");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 4)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                group3Label.setText("Match 6");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 5)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 1);
                group3Label.setText("Match 7");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 6)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                group3Label.setText("Match 8");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 7)
            {
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 1);
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                group3Label.setText("Match 9");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 8)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 1);
                group3Label.setText("Match 10");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 9)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                group3Label.setText("Match 11");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 10)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 1);
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 1);
                group3Label.setText("Match 12");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 11)
            {
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 1);
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 1);
                group3Label.setText("All matches done");
                Group3Counter = Group3Counter + 1;
            }
        }
    }

    @FXML
    private void group3Out(ActionEvent event) 
    {
        if (listTeams.size() <= 14 )
        {
            if(Group3Counter == 0)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 2");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 1)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("Match 3");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 2)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("Match 4");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 3)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("Match 5");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 4)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 6");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 5)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("All matches done");
                Group3Counter = Group3Counter + 1;
            }
        }
        else if(listTeams.size() >= 15)
        {
            if(Group3Counter == 0)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 2");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 1)
            {
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 3);
                group3Label.setText("Match 3");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 2)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("Match 4");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 3)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("Match 5");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 4)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("Match 6");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 5)
            {
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 3);
                group3Label.setText("Match 7");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 6)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("Match 8");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 7)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 9");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 8)
            {
                listTeams.get(14).setPoints(listTeams.get(14).getPoints() + 3);
                group3Label.setText("Match 10");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 9)
            {
                listTeams.get(10).setPoints(listTeams.get(10).getPoints() + 3);
                group3Label.setText("Match 11");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 10)
            {
                listTeams.get(6).setPoints(listTeams.get(6).getPoints() + 3);
                group3Label.setText("Match 12");
                Group3Counter = Group3Counter + 1;
            }
            else if(Group3Counter == 11)
            {
                listTeams.get(2).setPoints(listTeams.get(2).getPoints() + 3);
                group3Label.setText("All matches done");
                Group3Counter = Group3Counter + 1;
            }
        }
    }

    @FXML
    private void group4Home(ActionEvent event) 
    {
        if (listTeams.size() <= 15 )
        {
            if(Group4Counter == 0)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("Match 2");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 1)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 3");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 2)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("Match 4");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 3)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 5");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 4)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("Match 6");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 5)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("All matches done");
                Group4Counter = Group4Counter + 1;
            }
        }
        else if(listTeams.size() == 16)
        {
            if(Group4Counter == 0)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("Match 2");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 1)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("Match 3");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 2)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 4");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 3)
            {
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 3);
                group4Label.setText("Match 5");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 4)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("Match 6");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 5)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 7");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 6)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("Match 8");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 7)
            {
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 3);
                group4Label.setText("Match 9");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 8)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("Match 10");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 9)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 11");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 10)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("Match 12");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 11)
            {
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 3);
                group4Label.setText("All matches done");
                Group4Counter = Group4Counter + 1;
            }
        }
    }

    @FXML
    private void group4Tie(ActionEvent event) 
    {
        if (listTeams.size() <= 15 )
        {
            if(Group4Counter == 0)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                group4Label.setText("Match 2");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 1)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                group4Label.setText("Match 3");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 2)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                group4Label.setText("Match 4");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 3)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                group4Label.setText("Match 5");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 4)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                group4Label.setText("Match 6");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 5)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                group4Label.setText("All matches done");
                Group4Counter = Group4Counter + 1;
            }
        }
        else if(listTeams.size() == 16)
        {
            if(Group4Counter == 0)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                group4Label.setText("Match 2");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 1)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 1);
                group4Label.setText("Match 3");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 2)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                group4Label.setText("Match 4");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 3)
            {
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 1);
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                group4Label.setText("Match 5");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 4)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                group4Label.setText("Match 6");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 5)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 1);
                group4Label.setText("Match 7");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 6)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                group4Label.setText("Match 8");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 7)
            {
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 1);
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                group4Label.setText("Match 9");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 8)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 1);
                group4Label.setText("Match 10");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 9)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                group4Label.setText("Match 11");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 10)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 1);
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 1);
                group4Label.setText("Match 12");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 11)
            {
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 1);
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 1);
                group4Label.setText("All matches done");
                Group4Counter = Group4Counter + 1;
            }
        }
    }

    @FXML
    private void group4Out(ActionEvent event) 
    {
        if (listTeams.size() <= 15 )
        {
            if(Group4Counter == 0)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 2");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 1)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("Match 3");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 2)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("Match 4");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 3)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("Match 5");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 4)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 6");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 5)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("All matches done");
                Group4Counter = Group4Counter + 1;
            }
        }
        else if(listTeams.size() == 16)
        {
            if(Group4Counter == 0)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 2");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 1)
            {
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 3);
                group4Label.setText("Match 3");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 2)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("Match 4");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 3)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("Match 5");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 4)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("Match 6");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 5)
            {
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 3);
                group4Label.setText("Match 7");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 6)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("Match 8");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 7)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 9");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 8)
            {
                listTeams.get(15).setPoints(listTeams.get(15).getPoints() + 3);
                group4Label.setText("Match 10");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 9)
            {
                listTeams.get(11).setPoints(listTeams.get(11).getPoints() + 3);
                group4Label.setText("Match 11");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 10)
            {
                listTeams.get(7).setPoints(listTeams.get(7).getPoints() + 3);
                group4Label.setText("Match 12");
                Group4Counter = Group4Counter + 1;
            }
            else if(Group4Counter == 11)
            {
                listTeams.get(3).setPoints(listTeams.get(3).getPoints() + 3);
                group4Label.setText("All matches done");
                Group4Counter = Group4Counter + 1;
            }
        }
    }
}
