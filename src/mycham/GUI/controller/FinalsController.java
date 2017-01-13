/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import mycham.BE.Team;
import mycham.GUI.Model.TeamModel;

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
    
    ObservableList<Team> listTeams;
    ArrayList<Team> group1 = new ArrayList<Team>() {};
    ArrayList<Team> group2 = new ArrayList<Team>() {};
    ArrayList<Team> group3 = new ArrayList<Team>() {};
    ArrayList<Team> group4 = new ArrayList<Team>() {};

    public FinalsController()
    {
        listTeams = TeamModel.getInstance().getTeam();
        
        
        group1.add(listTeams.get(0));
        group1.add(listTeams.get(4));
        group1.add(listTeams.get(8));
        if(listTeams.size() >= 13)
        {
            group1.add(listTeams.get(12));
        }
        
        group2.add(listTeams.get(1));
        group2.add(listTeams.get(5));
        group2.add(listTeams.get(9));
        if(listTeams.size() >= 14)
        {
            group2.add(listTeams.get(13));
        }
        
        group3.add(listTeams.get(2));
        group3.add(listTeams.get(6));
        group3.add(listTeams.get(10));
        if(listTeams.size() >= 15)
        {
            group3.add(listTeams.get(14));
        }
        
        group4.add(listTeams.get(3));
        group4.add(listTeams.get(7));
        group4.add(listTeams.get(11));
        if(listTeams.size() >= 16)
        {
            group4.add(listTeams.get(15));
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        Finalists();
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
        Team winner1 = group1.get(0);
        Team winner2 = group2.get(0);
        Team winner3 = group3.get(0);
        Team winner4 = group4.get(0);
        
        for (Team a : group1) 
        {
            if(winner1.getPoints()<a.getPoints())
                winner1 = a;
        }
        System.out.println(winner1 + " is the winner");
        
        for (Team b : group2) 
        {
            if(winner2.getPoints()<b.getPoints())
                winner2 = b;
        }
        System.out.println(winner2 + " is the winner");

        for (Team c : group3) 
        {
            if(winner3.getPoints()<c.getPoints())
                winner3 = c;
        }
        System.out.println(winner3 + " is the winner");

        for (Team d : group4) 
        {
            if(winner4.getPoints()<d.getPoints())
                winner4 = d;
        }
        System.out.println(winner4 + " is the winner");    
        
        quaterFinal1Label.setText("" + winner1);
        quaterFinal4Label.setText("" + winner2);
        quaterFinal5Label.setText("" + winner3);
        quaterFinal8Label.setText("" + winner4);
        
        group1.remove(winner1);
        group2.remove(winner2);
        group3.remove(winner3);
        group4.remove(winner4);
        
        Team second1 = group1.get(0);
        Team second2 = group2.get(0);
        Team second3 = group3.get(0);
        Team second4 = group4.get(0);
        
        for (Team a : group1) 
        {
            if(second1.getPoints()<a.getPoints())
                second1 = a;
        }
        System.out.println(second1 + " is the second");
        
        for (Team b : group2) 
        {
            if(second2.getPoints()<b.getPoints())
                second2 = b;
        }
        System.out.println(second2 + " is the second");

        for (Team c : group3) 
        {
            if(second3.getPoints()<c.getPoints())
                second3 = c;
        }
        System.out.println(second3 + " is the second");

        for (Team d : group4) 
        {
            if(second4.getPoints()<d.getPoints())
                second4 = d;
        }
        System.out.println(second4 + " is the second");  
        
        quaterFinal3Label.setText("" + second1);
        quaterFinal2Label.setText("" + second2);
        quaterFinal7Label.setText("" + second3);
        quaterFinal6Label.setText("" + second4);
    }
        
//        System.out.println("Unsorted: " + listTeams);
//        listTeams.sort(new Comparator()
//        {
//            @Override
//            public int compare(Object o1, Object o2) 
//            {
//                Team a = (Team)o1;
//                Team b= (Team)o2;
//                return b.getPoints()-a.getPoints();
//            }
//        });
//        
//        System.out.println("Sorted: " + listTeams);
}
