/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI.controller;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleObjectProperty;
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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import mycham.BE.Team;
import mycham.GUI.Model.TeamModel;

/**
 *
 * @author Emil
 */

public class MainViewController implements Initializable {
    
    public boolean eventStarted = false;
    private int teamNr = 0;
    private TeamModel teamModel;
    private Team team;
    @FXML
    private TextField textFieldAddTeam;
    @FXML
    private TableColumn<Team ,String> listTeamView;
    @FXML
    private Button finalsButton;
    @FXML
    private Label publicMessageLabel;
    @FXML
    private Button groupStageButton;
    @FXML
    private TableView<Team> tableTeam;
    @FXML
    private Label teamNumber;
    ObservableList<Team> listTeams;
    
    public MainViewController()
    {
        teamModel = TeamModel.getInstance();
        listTeams = TeamModel.getInstance().getTeam();
    }     
    
    //This method is bound to the add team button.
    @FXML
    private void addTeam(ActionEvent event) 
    {
        addTeamMethod();
    }
    
    //This method is the add team method which adds the text from the text field 
    // to the listTeams observerable list. It also adds to the team number counter
    // and increse the group ID number, and checks if the event have started
    // if the event have started its not possible to add new teams.
    public void addTeamMethod ()
    {
        if (!textFieldAddTeam.getText().isEmpty() && eventStarted == false)
        {
//            teamModel.createTeam(textFieldAddTeam.getText());
//            teamModel.createTeam(textFieldAddTeam.getText(), 0, 0, 0);
            teamModel.createTeam(textFieldAddTeam.getText(), teamModel.getTeam().size() + 1, 0, 0);
            textFieldAddTeam.clear();
            teamNr++;
            teamNumber.setText("Amount of teams: " + teamNr);
        }
    }
    
    //This method use the addTeamMethod when you press the "Enter" key.
    @FXML
    public void handleEnterPressed(KeyEvent event)
    {
        if (event.getCode() == KeyCode.ENTER) 
        {
            addTeamMethod();
        }
    }
    
    //This method adds the ability to edit the selected teams name.
    @FXML
    private void editTeam(ActionEvent event) 
    {
        final int selectedItem = tableTeam.getSelectionModel().getSelectedIndex();
        if (selectedItem != -1)
        {
            if(textFieldAddTeam.getText().isEmpty())
            {
                textFieldAddTeam.setText(tableTeam.getItems().get(selectedItem).toString());
            }
            else
            {
                teamModel.getTeam().get(selectedItem).setName(textFieldAddTeam.getText());
            }
            tableTeam.getColumns().get(0).setVisible(false);
            tableTeam.getColumns().get(0).setVisible(true);
        }
    }
    
    //This method deletes the selected team and decrease the team counter and
    // if the tournement have started it wont remove the selected team but rather
    // replace it with an empty space inoder not to mess the group match schedule up
    @FXML
    private void deleteTeam(ActionEvent event)
    {
        final int selectedItem = tableTeam.getSelectionModel().getSelectedIndex();
        if (selectedItem != -1 && eventStarted == false)
        {
            tableTeam.getItems().remove(selectedItem);
            teamNr--;
            teamNumber.setText("Amount of teams: " + teamNr);
        }
        else if(selectedItem != -1 && eventStarted == true)
        {
            teamModel.getTeam().get(selectedItem).setName("");
            tableTeam.getColumns().get(0).setVisible(false);
            tableTeam.getColumns().get(0).setVisible(true);
        }
 
//        for (int i = 0; i < teamModel.getTeam().size(); i++) 
//        {
//	    if (listTeams.get(i).getId() != i) 
//            {
//                listTeams.get(i).setId(100);
////                i = i - 1;
////                System.out.println("LOL");
//            }
//            else
//            System.out.println("didt du nuffin");
//            
//            System.out.println(listTeams.get(i).getPoints());
//	}   
    }
    
    //DELETE THIS -v
    @FXML
    private void testButton2(ActionEvent event) 
    {
//        for(int i = 0; i < teamModel.getTeam().size(); i++) 
//        {   
//            System.out.println(teamModel.getTeam().get(i));
//        }
        
//        if (!listTeams.isEmpty())
//        {
//            System.out.println(listTeams.get(0).getId());
//            System.out.println(listTeams.get(1).getId());
//            System.out.println(listTeams.get(2).getId());
//            System.out.println(listTeams.get(3).getId());
//            System.out.println(listTeams.get(4).getId());
//            System.out.println(listTeams.get(5).getId());
//            System.out.println(listTeams.get(6).getId());
//            System.out.println(listTeams.get(7).getId());
//            System.out.println(listTeams.get(8).getId());
//            System.out.println(listTeams.get(9).getId());
//            System.out.println(listTeams.get(10).getId());
//            System.out.println(listTeams.get(11).getId());
//            
//        }
//            System.out.println(listTeams.get(0).getId());
//            listTeams.get(0).setId(100);
//            System.out.println(listTeams.get(0).getId());
//            listTeams.get(0).getId();
//            listTeams.get(0).getId();
        
        listTeams.get(0).setName("Mango");
        tableTeam.getColumns().get(0).setVisible(false);
            tableTeam.getColumns().get(0).setVisible(true);
            
//            System.out.println(listTeams.get(0).getPoints() + 1);
            listTeams.get(0).setPoints(100);
//            System.out.println(listTeams.get(0).getPoints());
//            listTeams.get(0).setPoints(listTeams.get(0).getPoints() + 1);
            System.out.println(listTeams.get(0).getPoints());
    }
    
    //This method shuffles the teams.
    @FXML
    private void shuffleButton(ActionEvent event) 
    {
        Collections.shuffle(teamModel.getTeam());
    } 
    
    //This method starts the tournament, which removes the ability to add teams
    // and makes the delete teams button replace the team with a empty space
    // inorder not to make team match schedule mess up. 
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
            publicMessageLabel.setText("Roster is not correct size!");
        }
    }
    
    //This method resets the tournament by setting the event startet as false
    // and removes all the teams and resets the team counter.
    @FXML
    private void resetTour(ActionEvent event) 
    {
        eventStarted = false;
        tableTeam.getItems().removeAll(teamModel.getTeam());
        publicMessageLabel.setText("New event initiated!");
        teamNr = 0;
        teamNumber.setText("Amount of teams: " + teamNr);
    }
    
    //This method quickly adds 12 dummy teams to make the testing purpose faster.
    @FXML
    private void addDummy(ActionEvent event) 
    {
        if(eventStarted == false)
        {
            teamNr += 12;
            teamNumber.setText("Amount of teams: " + teamNr);

//            Structure:
//            teamModel.getTeam().add(new Team(id, goals, point, name))

            teamModel.getTeam().add(new Team(1, 0, 0, "Alpha"));
            teamModel.getTeam().add(new Team(3, 0, 0, "Bravo"));
            teamModel.getTeam().add(new Team(4, 0, 0, "Charlie"));
            teamModel.getTeam().add(new Team(5, 0, 0, "Delta"));
            teamModel.getTeam().add(new Team(6, 0, 0, "Echo"));
            teamModel.getTeam().add(new Team(7, 0, 0, "Foxtrot"));
            teamModel.getTeam().add(new Team(8, 0, 0, "Golf"));
            teamModel.getTeam().add(new Team(9, 0, 0, "Hotel"));
            teamModel.getTeam().add(new Team(10, 0, 0, "India"));
            teamModel.getTeam().add(new Team(11, 0, 0, "Juliett"));
            teamModel.getTeam().add(new Team(12, 0, 0, "Kilo"));
            teamModel.getTeam().add(new Team(13, 0, 0, "Magic Mike"));
        }       
    }
    
    //This method adds the ability to double click on the tableview inorder to see
    //team infomation on the selected team
    @FXML
    private void mousePressedOnTableView(MouseEvent event) throws IOException
    {
        if(event.isPrimaryButtonDown() && event.getClickCount()==2)
        {
            Team selectedTeam = tableTeam.getSelectionModel().getSelectedItem();
            teamInfo(selectedTeam);
        }
    }
    
    //This method is bound to team info window.
    private void teamInfo(Team team) throws IOException
    {
        Stage primStage = (Stage)tableTeam.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(
        getClass().getResource("/mycham/GUI/view/Team.fxml"));
        Parent root = loader.load();
        TeamController teamController = loader.getController();
        teamController.setTeam(team);
        Stage teamView = new Stage();
        teamView.setScene(new Scene(root));
        teamView.setTitle("Team: " + tableTeam.getSelectionModel().getSelectedItem());
        teamView.initModality(Modality.WINDOW_MODAL);
        teamView.initOwner(primStage);
        teamView.show();
    }
    
    //This method is bound to the group stage button and opens the group stage window.
    @FXML
    private void groupStage(ActionEvent event) throws IOException
    {
        Stage primStage = (Stage)groupStageButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mycham/GUI/view/MatchSchedule.fxml"));
        Parent root = loader.load();
        Stage stageMainView = new Stage();
        stageMainView.setScene(new Scene(root));
        stageMainView.setTitle("Group Stage");
        stageMainView.initModality(Modality.WINDOW_MODAL);
        stageMainView.initOwner(primStage);
        stageMainView.show();
    }
    
    //This method is bound to the final stage button and opens the final stage window.
    @FXML
    private void finals(ActionEvent event) throws IOException
    {
        Stage primStage = (Stage)finalsButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mycham/GUI/view/Finals.fxml"));
        Parent root = loader.load();
        Stage stageFinals = new Stage();
        stageFinals.setScene(new Scene(root));
        stageFinals.setTitle("Finals");
        stageFinals.initModality(Modality.WINDOW_MODAL);
        stageFinals.initOwner(primStage);
        stageFinals.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        tableTeam.setItems(teamModel.getTeam());
        listTeamView.setCellValueFactory(value -> new SimpleObjectProperty<>(value.getValue().getName()));
        teamNumber.setText("Amount of teams: " + teamNr);
    }   
}
