package data;

import utils.RandomUtils;

public class TestData {
    RandomUtils randomUtils = new RandomUtils();

    public String projectName = randomUtils.getRandomProjectName();
    public String projectNameUpdated = randomUtils.getRandomProjectNameUpdated();
    public String taskName = randomUtils.getRandomTaskName();
    public String taskNameUpdated = randomUtils.getRandomTaskNameUpdated();
    public String taskDescription = randomUtils.getRandomTaskDescription();
}
