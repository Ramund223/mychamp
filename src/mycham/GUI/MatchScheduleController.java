/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI;

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
import javafx.scene.control.TableColumn;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nicolai
 */
public class MatchScheduleController implements Initializable {
    
    
    @FXML
    private Button matchScheduleClose;
    
    @FXML
    private Button match1AButton;
    
    @FXML
    private Label notEnoughTeamsLabel;
    
    @FXML
    private Label match1A;
    
    @FXML
    private Label match1ALabel;
    
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

    ObservableList<String> listTeams;
   
    public MatchScheduleController() 
    {
        listTeams = TeamModel.getInstance().getTeam();
        
    }
    
    @FXML
    private void matchScheduleClose(ActionEvent event) 
    {
        Stage stage = (Stage) matchScheduleClose.getScene().getWindow();
        stage.close();
        
    }
    
    @FXML
    private void match1AButton(ActionEvent event)throws IOException
    {
                
        Stage primStage = (Stage)match1AButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UpdateScore.fxml"));
        Parent root = loader.load();
  
        Stage stageGroupStage = new Stage();
        stageGroupStage.setScene(new Scene(root));
        
        stageGroupStage.setTitle("Team (" + listTeams.get(0) + ")" + " VS Team (" + listTeams.get(1) + ")");
        
        stageGroupStage.initModality(Modality.WINDOW_MODAL);
        stageGroupStage.initOwner(primStage);
        
        stageGroupStage.show();
    }
    
private void updateTeams()
    {
        match1ALabel.setText("Hjemmebane: "+ "(" + listTeams.get(0) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(1) + ")");
        if (listTeams.size() >= 12 && listTeams.size() <= 16)
        {
            //Group A
            match1A.setText("Hjemmebane: "+ "(" + listTeams.get(0) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(1) + ")");
            match2A.setText("Hjemmebane: "+ "(" + listTeams.get(2) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(3) + ")");
            match3A.setText("Hjemmebane: "+ "(" + listTeams.get(1) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(0) + ")");
            match4A.setText("Hjemmebane: "+ "(" + listTeams.get(3) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(2) + ")");
            match5A.setText("Hjemmebane: "+ "(" + listTeams.get(0) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(2) + ")");
            match6A.setText("Hjemmebane: "+ "(" + listTeams.get(1) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(3) + ")");
            match7A.setText("Hjemmebane: "+ "(" + listTeams.get(2) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(0) + ")");
            match8A.setText("Hjemmebane: "+ "(" + listTeams.get(3) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(1) + ")");
            match9A.setText("Hjemmebane: "+ "(" + listTeams.get(0) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(3) + ")");
            match10A.setText("Hjemmebane: "+ "(" + listTeams.get(1) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(2) + ")");
            match11A.setText("Hjemmebane: "+ "(" + listTeams.get(2) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(1) + ")");
            match12A.setText("Hjemmebane: "+ "(" + listTeams.get(3) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(0) + ")");
            //Group B
            match1B.setText("Hjemmebane: "+ "(" + listTeams.get(4) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(5) + ")");
            match2B.setText("Hjemmebane: "+ "(" + listTeams.get(6) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(7) + ")");
            match3B.setText("Hjemmebane: "+ "(" + listTeams.get(5) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(4) + ")");
            match4B.setText("Hjemmebane: "+ "(" + listTeams.get(7) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(6) + ")");
            match5B.setText("Hjemmebane: "+ "(" + listTeams.get(4) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(6) + ")");
            match6B.setText("Hjemmebane: "+ "(" + listTeams.get(5) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(7) + ")");
            match7B.setText("Hjemmebane: "+ "(" + listTeams.get(6) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(4) + ")");
            match8B.setText("Hjemmebane: "+ "(" + listTeams.get(7) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(5) + ")");
            match9B.setText("Hjemmebane: "+ "(" + listTeams.get(4) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(7) + ")");
            match10B.setText("Hjemmebane: "+ "(" + listTeams.get(5) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(6) + ")");
            match11B.setText("Hjemmebane: "+ "(" + listTeams.get(6) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(5) + ")");
            match12B.setText("Hjemmebane: "+ "(" + listTeams.get(7) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(4) + ")");
            //Group C
            match1C.setText("Hjemmebane: "+ "(" + listTeams.get(8) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(9) + ")");
            match2C.setText("Hjemmebane: "+ "(" + listTeams.get(10) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(11) + ")");
            match3C.setText("Hjemmebane: "+ "(" + listTeams.get(9) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(8) + ")");
            match4C.setText("Hjemmebane: "+ "(" + listTeams.get(11) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(10) + ")");
            match5C.setText("Hjemmebane: "+ "(" + listTeams.get(8) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(10) + ")");
            match6C.setText("Hjemmebane: "+ "(" + listTeams.get(9) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(11) + ")");
            match7C.setText("Hjemmebane: "+ "(" + listTeams.get(10) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(8) + ")");
            match8C.setText("Hjemmebane: "+ "(" + listTeams.get(11) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(9) + ")");
            match9C.setText("Hjemmebane: "+ "(" + listTeams.get(8) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(11) + ")");
            match10C.setText("Hjemmebane: "+ "(" + listTeams.get(9) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(10) + ")");
            match11C.setText("Hjemmebane: "+ "(" + listTeams.get(10) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(9) + ")");
            match12C.setText("Hjemmebane: "+ "(" + listTeams.get(11) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(8) + ")");
        }
        //Group D
        if (listTeams.size() == 13)
        {
            match1D.setText("Too few teams! "+ "(" + listTeams.get(12) + ")" + "Proceeds to the tournament!");
        }
        
        if (listTeams.size() == 14)
        {
            match1D.setText("Hjemmebane: "+ "(" + listTeams.get(12) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(13) + ")");
            match3D.setText("Hjemmebane: "+ "(" + listTeams.get(13) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(12) + ")");
        }
        
        if (listTeams.size() == 15)
        {
            match1D.setText("Hjemmebane: "+ "(" + listTeams.get(12) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(13) + ")");
            match3D.setText("Hjemmebane: "+ "(" + listTeams.get(13) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(14) + ")");
            match5D.setText("Hjemmebane: "+ "(" + listTeams.get(14) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(12) + ")");
            match7D.setText("Hjemmebane: "+ "(" + listTeams.get(13) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(12) + ")");
            match9D.setText("Hjemmebane: "+ "(" + listTeams.get(14) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(13) + ")");
            match11D.setText("Hjemmebane: "+ "(" + listTeams.get(12) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(14) + ")");
        }
        if (listTeams.size() == 16)
        {
            match1D.setText("Hjemmebane: "+ "(" + listTeams.get(12) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(13) + ")");
            match2D.setText("Hjemmebane: "+ "(" + listTeams.get(14) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(15) + ")");
            match3D.setText("Hjemmebane: "+ "(" + listTeams.get(13) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(12) + ")");
            match4D.setText("Hjemmebane: "+ "(" + listTeams.get(15) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(14) + ")");
            match5D.setText("Hjemmebane: "+ "(" + listTeams.get(12) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(14) + ")");
            match6D.setText("Hjemmebane: "+ "(" + listTeams.get(13) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(15) + ")");
            match7D.setText("Hjemmebane: "+ "(" + listTeams.get(14) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(12) + ")");
            match8D.setText("Hjemmebane: "+ "(" + listTeams.get(15) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(14) + ")");
            match9D.setText("Hjemmebane: "+ "(" + listTeams.get(12) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(15) + ")");
            match10D.setText("Hjemmebane: "+ "(" + listTeams.get(13) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(14) + ")");
            match11D.setText("Hjemmebane: "+ "(" + listTeams.get(14) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(13) + ")");
            match12D.setText("Hjemmebane: "+ "(" + listTeams.get(15) + ")" + " VS " + "Udebane: " + "(" + listTeams.get(12) + ")");
        }
        
        if (listTeams.size() < 12 || listTeams.size() > 16)
        {
            notEnoughTeamsLabel.setText("Not enought teams or too few teams! Choose between 12 and 16 team!");
        }


    }
    
    @FXML
    private void updateTeams(ActionEvent event) 
    {
        updateTeams();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
