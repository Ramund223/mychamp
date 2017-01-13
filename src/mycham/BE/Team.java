/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycham.BE;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Emil
 */
public class Team 
{
    private final StringProperty name = new SimpleStringProperty();
    private int id;
    private int goals;
    private int points;

    public Team(int id, int goals, int points, String name) 
    {
        this.name.set(name);
        this.id = id;
        this.goals = goals;
        this.points = points;
    }
    
    public String getName() 
    {
        return name.get();
    }
    
    public void setName(String value) 
    {
        name.set(value);
    }

    public StringProperty nameProperty() 
    {
        return name;
    }
    
    @Override
    public String toString() 
    {
        return name.get();
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getGoals() 
    {
        return goals;
    }

    public void setGoals(int goals) 
    {
        this.goals = goals;
    }

    public int getPoints() 
    {
        return points;
    }

    public void setPoints(int points) 
    {
        this.points = points;
    }
}
