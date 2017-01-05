/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
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
    
    private void labels()
    {
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
    }
    
    @FXML
    private void testButton(ActionEvent event) 
    {
        for(int i = 0; i < listTeams.size(); i++) 
        {   
            System.out.println(listTeams.get(i));
        }
        
        if (listTeams.isEmpty()) 
        {
            System.out.println("EMPTY");
        }
//        hjemmebaneTeam1.getColumns().add("MAKO");
        labels();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
