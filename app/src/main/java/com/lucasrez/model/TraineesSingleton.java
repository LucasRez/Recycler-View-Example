package com.lucasrez.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucasrez on 5/30/16.
 */
public class TraineesSingleton {
    private static TraineesSingleton ourInstance = new TraineesSingleton();
    private List<Trainees> traineesList = new ArrayList<>();

    public static TraineesSingleton getInstance() {
        return ourInstance;
    }

    private TraineesSingleton() {
        traineesList.add(new Trainees("Lucas", "20"));
        traineesList.add(new Trainees("Filipe", "19"));
        traineesList.add(new Trainees("Christian", "19"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));
        traineesList.add(new Trainees("Ednaldo Pereira", "40"));


    }

    public List<Trainees> getTraineesList() {
        return traineesList;
    }
}
