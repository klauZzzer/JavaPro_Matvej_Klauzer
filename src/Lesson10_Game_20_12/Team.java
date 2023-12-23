package Lesson10_Game_20_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T> {

    private String name;
    private List<T> participants = new ArrayList<>(100);

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getParticipants() {
        return participants;
    }

    public void setParticipants(List<T> participants) {
        this.participants = participants;
    }

    public void addNewParticipant(T newParticipant) {
        participants.add(newParticipant);
    }

    public void play(Team<T> teamPlayWith) {
        String winner;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winner = this.name;
        } else {
            winner = teamPlayWith.name;
        }

        System.out.println("*****Winner is: " + winner + "*****");

    }
}