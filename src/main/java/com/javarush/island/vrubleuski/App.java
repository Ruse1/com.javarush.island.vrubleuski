package com.javarush.island.vrubleuski;

import com.javarush.island.vrubleuski.configuration.ConfigIsland;
import com.javarush.island.vrubleuski.entity.animal.*;
import com.javarush.island.vrubleuski.entity.area.Island;
import com.javarush.island.vrubleuski.entity.area.Location;
import com.javarush.island.vrubleuski.entity.plant.Plant;

public class App {
    public final static Island island = new Island(ConfigIsland.WIDTH, ConfigIsland.HEIGHT);

    public static void main(String[] args) {
        //МОЙ ПРОЕКТ ЕЩЁ В РАБОТЕ!!!
        //МОЖНО НАЖАТЬ СТАРТ, ЧТОБЫ ЧУТЬ_ЧУТЬ ПРОТЕСТИРОВАТЬ))
        Location location = new Location();
        location.getAnimals().add(new Horse(location));
        location.getAnimals().add(new Mouse(location));
        location.getAnimals().add(new Mouse(location));
        location.getAnimals().add(new Rabbit(location));
        location.getAnimals().add(new Mouse(location));
        location.getAnimals().add(new Mouse(location));
        location.getAnimals().add(new Mouse(location));
        location.getAnimals().add(new Mouse(location));
        location.getAnimals().add(new Rabbit(location));
        location.getAnimals().add(new Mouse(location));
        location.getAnimals().add(new Mouse(location));
        location.getAnimals().add(new Mouse(location));
        location.getPlants().add(new Plant(location));
        location.getPlants().add(new Plant(location));
        location.getPlants().add(new Plant(location));
        location.getPlants().add(new Plant(location));
        location.getPlants().add(new Plant(location));
        Wolf wolf = new Wolf(location);
        Sheep sheep = new Sheep(location);
        for (int i = 0; i < 14; i++) {
            sheep.eat();
            wolf.eat();
        }

        System.out.println(location.getAnimals());
        System.out.println(location.getPlants());
    }

}
