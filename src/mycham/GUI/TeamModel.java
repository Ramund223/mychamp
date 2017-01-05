/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Emil
 */
public class TeamModel 
{
    private static TeamModel INSTANCE;
    
    private final ObservableList<String> teamList;

    public static synchronized TeamModel getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new TeamModel();
        }
        return INSTANCE;
    }
    
    private TeamModel() 
    {
        teamList = FXCollections.observableArrayList();
    }
    
    public ObservableList<String> getTeam()
    {
        return teamList;
    }
    
}
