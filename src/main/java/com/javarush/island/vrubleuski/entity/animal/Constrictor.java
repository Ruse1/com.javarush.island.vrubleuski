package com.javarush.island.vrubleuski.entity.animal;

import com.javarush.island.vrubleuski.configuration.ConfigAnimal;
import com.javarush.island.vrubleuski.configuration.ConfigIsland;
import com.javarush.island.vrubleuski.entity.area.Location;
import com.javarush.island.vrubleuski.service.ServiceIsland;

public class Constrictor extends Predator implements Eatable {

    public Constrictor(Location location) {
        super(location);
        this.animal = ConfigAnimal.CONSTRICTOR;
        this.behaviorWithAnimals = ConfigIsland.SETTINGS_BEHAVIOR_ANIMALS_WITH_ANIMALS.get(this.getClass());
        this.behaviorWithPlants = ConfigIsland.SETTINGS_BEHAVIOR_ANIMALS_WITH_PLANTS.get(this.getClass());
    }

    @Override
    public void breed() {
        int count = location.getCountAnimals(this.getClass());
        int random = ServiceIsland.randomIntFromTo(10, 25);
        for (int i = 0; i < count / 2; i++) {
            int countNewborn = location.getNewbornAnimals().size();
            if ((count + countNewborn) < animal.getCountInLocation()) {
                for (int j = 0; j < random; j++) {
                    location.getNewbornAnimals().add(new Constrictor(location));
                }
            }
        }
        removeExcess();
    }
}
