package cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> { // Should accept only Player class and subclasses

    private String name;

    private List<T>member=new ArrayList();

    public Team(String name) {

        this.name = name;
    }



    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (member.contains(player)){
            System.out.println(((Player)player).getName()+" is already in the team");
            return false;
        }else {
            member.add(player);
            System.out.println(((Player)player).getName()+ " picked for team"+this.name);
        }return true;


    }
}
