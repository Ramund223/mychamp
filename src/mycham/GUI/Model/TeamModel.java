/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mycham.BE.Team;

/**
 *
 * @author Emil
 */
public class TeamModel 
{
    private static TeamModel INSTANCE;
    
    private final ObservableList<Team> teamList;

    private TeamModel() 
    {
        teamList = FXCollections.observableArrayList();
    }
    
    public void createTeam(String teamName, int teamId, int teamGoals, int teamPoints)
    {
        Team team = new Team(teamId, teamGoals, teamPoints, teamName);
        teamList.add(team);
    }
    
    public static synchronized TeamModel getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new TeamModel();
        }
        return INSTANCE;
    }
    
    public ObservableList<Team> getTeam()
    {
        return teamList;
    }
}
