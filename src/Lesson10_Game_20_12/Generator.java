package Lesson10_Game_20_12;


import com.github.javafaker.Faker;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Generator <T extends Participant> {

    private static final Faker FAKER = new Faker();

//    public Set<Team<T>> create25Teams(T t) {
//        Set<Team<T>> teams = new HashSet<>();
//        Random rd = new Random();
//        for (int i = 0; i < 25; i++) {
//            Team<T> team = new Team<>(FAKER.team().name());
//            for (int j = 0; j < 3; j++) {
//                int age;
//                if (teams instanceof Adult) {
//                    age = rd.nextInt(18, 90);
//                } else if (teams instanceof Teenager) {
//                    age = rd.nextInt(12, 18);
//                } else {
//                    age = rd.nextInt(4, 12);
//                }
//
//                T parcipant = new Participant(FAKER.name().name(), age);
//                team.addNewParticipant();
//            }
//
//
//        }
//
//
//        //return Set<Team<T>> teams;
//    }


}
