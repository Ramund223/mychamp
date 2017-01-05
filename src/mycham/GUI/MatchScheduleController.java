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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nicolai
 */
public class MatchScheduleController implements Initializable {
    
    @FXML
    private Button matchScheduleClose;

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
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
