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
public class PointsModel 
{
    private static PointsModel INSTANCE;
    
    private final ObservableList<String> pointsList;

    public static synchronized PointsModel getInstance()
    {
        if(INSTANCE == null)
        {
            INSTANCE = new PointsModel();
        }
        return INSTANCE;
    }
    
    private PointsModel() 
    {
        pointsList = FXCollections.observableArrayList();
    }
    
    public ObservableList<String> getPoints()
    {
        return pointsList;
    }
    
}
