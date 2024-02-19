package cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;

    private List<Player>member=new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
        if (member.contains(player)){
            System.out.println(player.getName()+" is already in the team");
            return false;
        }else {
            member.add(player);
            System.out.println(player.getName()+ " picked for team"+this.name);
        }return true;


    }
}
