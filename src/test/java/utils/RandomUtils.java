package utils;

import com.github.javafaker.Faker;

public class RandomUtils {

    Faker faker = new Faker();

    public String getRandomProjectName() {
        return faker.harryPotter().house();
    }

    public String getRandomProjectNameUpdated() {
        return faker.harryPotter().house();
    }

    public String getRandomTaskName() {
        return faker.harryPotter().spell();
    }

    public String getRandomTaskNameUpdated() {
        return faker.harryPotter().spell();
    }

    public String getRandomTaskDescription() {
        return faker.harryPotter().quote();
    }

}