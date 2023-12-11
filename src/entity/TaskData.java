package entity;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTask;
    private Set<Task> bobsTask;
    private Set<Task> carrollsTask;

    public TaskData(Set<Task> annsTask, Set<Task> bobsTask, Set<Task> carrollsTask) {
        this.annsTask = annsTask;
        this.bobsTask = bobsTask;
        this.carrollsTask = carrollsTask;
    }

    public Set<Task> getTask(String owner){
        if (owner.equalsIgnoreCase("ann")) {
            return this.annsTask;
        }
        if (owner.equalsIgnoreCase("bob")) {
            return this.bobsTask;
        }
        if (owner.equalsIgnoreCase("carroll")) {
            return this.carrollsTask;
        }
        if (owner.equalsIgnoreCase("all")) {
            return getUnion(bobsTask, annsTask, carrollsTask);
        }
        return new HashSet<>();
    }

    public Set<Task> getUnion(Set<Task>... sets){
        HashSet<Task> allSets = new LinkedHashSet<Task>();

        for (var taskSet :sets){
            allSets.addAll(taskSet);
        }

        return allSets;
    }

    public Set<Task> getIntersection(Set<Task> first,Set<Task> second){
        Set<Task> intersections = new HashSet<>(first);
        intersections.retainAll(second);
        return intersections;
    }
    public Set<Task> getDifferences(Set<Task> first,Set<Task> second){
        Set<Task> differences = new HashSet<>(first);
        differences.removeAll(second);
        return differences;
    }



    public Set<Task> getAnnsTask() {
        return annsTask;
    }

    public void setAnnsTask(Set<Task> annsTask) {
        this.annsTask = annsTask;
    }

    public Set<Task> getBobsTask() {
        return bobsTask;
    }

    public void setBobsTask(Set<Task> bobsTask) {
        this.bobsTask = bobsTask;
    }

    public Set<Task> getCarrollsTask() {
        return carrollsTask;
    }

    public void setCarrollsTask(Set<Task> carrollsTask) {
        this.carrollsTask = carrollsTask;
    }
}
