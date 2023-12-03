package data;

import utils.RandomUtils;

public class TestData {
    RandomUtils randomUtils = new RandomUtils();

    public String projectName = randomUtils.getRandomProjectName();
    public String taskName = randomUtils.getRandomTaskName();
    public String taskDescription = randomUtils.getRandomTaskDescription();
    public String existsProjectName = "Дом";
    public String projectColour = randomUtils.getRandomProjectColour();
}