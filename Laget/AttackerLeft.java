package laget;

import java.awt.Color;
import hockey.api.GoalKeeper;
import hockey.api.Player;
import hockey.api.ITeam;

public class AttackerLeft extends Player {

    private int index;
    private String name;

    public AttackerLeft(int index, String name) {
        this.index = index;
        this.name = name;
    }
    public int getNumber() { return Pucko.numbers[index]; }
    public String getName() { return name; }
    public boolean isLeftHanded() { return false; }
    public void step() {
        if (hasPuck()) // If we have the puck
            skate(2600, 0, 1000); // Go for the goal
        else // Else
            skate(getPuck(), 1000); // Go for the puck
    }
}