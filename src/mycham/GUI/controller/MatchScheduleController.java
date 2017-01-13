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
    private Button matchSelecter;
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
    private MainViewController mainClass;
    ObservableList<Team> listTeams;
   
    public MatchScheduleController() 
    {
        listTeams = TeamModel.getInstance().getTeam();
    }
    
    @FXML
    private void matchSelecter(ActionEvent event)throws IOException
    {
        if (listTeams.size() >= 2 )
        {
            Stage primStage = (Stage)matchSelecter.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/mycham/GUI/view/UpdateScore.fxml"));
            Parent root = loader.load();
            Stage stageGroupStage = new Stage();
            stageGroupStage.setScene(new Scene(root));
//            stageGroupStage.setTitle("Team (" + listTeams.get(0) + ")" + " VS Team (" + listTeams.get(1) + ")");
            stageGroupStage.setTitle("Match Selecter");
            stageGroupStage.initModality(Modality.WINDOW_MODAL);
            stageGroupStage.initOwner(primStage);
            stageGroupStage.show();
        }
        else
        {
            publicMessageLabel.setText("Not enought teams or too few teams! Choose between 12 and 16 team!");
        }
    }
    
private void updateTeams()
    {
//        if (listTeams.size() == 2)
//        {
//            match1ALabel.setText("Hjemmebane: "+ "(" + listTeams.get(0) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(1) + ")");
//        }
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
            match8D.setText("Hjem: "+ "(" + listTeams.get(15) + ")" + " VS " + "Ude: " + "(" + listTeams.get(11) + ")");
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
    
    @FXML
    private void updateTeams(ActionEvent event) 
    {
        updateTeams();
    }
    
    @FXML
    private void matchScheduleClose(ActionEvent event) 
    {
        Stage stage = (Stage) matchScheduleClose.getScene().getWindow();
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
