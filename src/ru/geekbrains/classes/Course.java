package ru.geekbrains.classes;

import ru.geekbrains.classes.obstacles.Obstacle;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle[] IntObstacles){
        this.obstacles = IntObstacles;
    }

    public void doIt(Team intTeam){

        for (Participant pt : intTeam.GetParticipants()){
            for(Obstacle obst : this.obstacles){
                obst.doIt(pt);
            }

        }
    }
}
