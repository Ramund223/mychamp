/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Nicolai
 */
public class FinalsController implements Initializable {

    @FXML
    private Label quaterFinal1Label;
    @FXML
    private Label quaterFinal2Label;
    @FXML
    private Label quaterFinal3Label;
    @FXML
    private Label quaterFinal4Label;
    @FXML
    private Label quaterFinal8Label;
    @FXML
    private Label quaterFinal7Label;
    @FXML
    private Label quaterFinal5Label;
    @FXML
    private Label quaterFinal6Label;
    @FXML
    private Label final1Label;
    @FXML
    private Label winnerLabel;
    @FXML
    private Label semiFinal3Label;
    @FXML
    private Label semiFinal4Label;
    @FXML
    private Label semiFinal2Label;
    @FXML
    private Label semiFinal1Label;
    @FXML
    private Label final2Label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

    @FXML
    private void quarterFinal1Button(ActionEvent event) 
    {
        semiFinal1Label.setText("" + quaterFinal1Label.getText());
    }

    @FXML
    private void quarterFinal2Button(ActionEvent event) 
    {

        semiFinal1Label.setText("" + quaterFinal2Label.getText());

    }

    @FXML
    private void quarterFinal3Button(ActionEvent event) 
    {
        semiFinal2Label.setText("" + quaterFinal3Label.getText());
    }

    @FXML
    private void quarterFinal4Button(ActionEvent event)
    {
        semiFinal2Label.setText("" + quaterFinal4Label.getText());
    }

    @FXML
    private void quarterFinal5Button(ActionEvent event) 
    {
        semiFinal3Label.setText("" + quaterFinal5Label.getText());
    }

    @FXML
    private void quarterFinal6Button(ActionEvent event) 
    {
        semiFinal3Label.setText("" + quaterFinal6Label.getText());
    }
    
    @FXML
    private void quarterFinal7Button(ActionEvent event) 
    {
        semiFinal4Label.setText("" + quaterFinal7Label.getText());
    }
    
    @FXML
    private void quarterFinal8Button(ActionEvent event) 
    {
        semiFinal4Label.setText("" + quaterFinal8Label.getText());
    }

    @FXML
    private void semiFinal1Button(ActionEvent event) 
    {
        final1Label.setText("" + semiFinal1Label.getText());
    }
    
    @FXML
    private void semiFinal2Button(ActionEvent event) 
    {
        final1Label.setText("" + semiFinal2Label.getText());
    }
    
    @FXML
    private void semiFinal3Button(ActionEvent event) 
    {
        final2Label.setText("" + semiFinal3Label.getText());
    }

    @FXML
    private void semiFinal4Button(ActionEvent event) 
    {
        final2Label.setText("" + semiFinal4Label.getText());
    }

    @FXML
    private void final1Button(ActionEvent event) 
    {
        winnerLabel.setText("" + final1Label.getText());
    }

    @FXML
    private void final2Button(ActionEvent event) 
    {
        winnerLabel.setText("" + final2Label.getText());
    }

    @FXML
    private void winnerButton(ActionEvent event) 
    {
        
    }

    private void Finalists()
    {
        quaterFinal1Label.setText("Team 1");
        quaterFinal2Label.setText("Team four star");
        quaterFinal3Label.setText("Gruppen (husk det)");
        quaterFinal4Label.setText("6 treants");
        quaterFinal5Label.setText("4 flotte fyre");
        quaterFinal6Label.setText("mads har dumme ideer");
        quaterFinal7Label.setText("Team 7");
        quaterFinal8Label.setText("Nicolai er awesome");
    }
    
    @FXML
    private void readyButton(ActionEvent event) 
    {
        Finalists();
    }
    
}
