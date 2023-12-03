package utils;

import com.github.javafaker.Faker;

public class RandomUtils {

    Faker faker = new Faker();

    public String getRandomProjectName() {
        return faker.harryPotter().house();
    }

    public String getRandomTaskName() {
        return faker.harryPotter().spell();
    }

    public String getRandomTaskDescription() {
        return faker.harryPotter().quote();
    }

    public String getRandomProjectColour() {return faker.options().option("Ягодно-красный", "Красный", "Оранжевый", "Желтый", "Оливковый", "Лайм");};

}