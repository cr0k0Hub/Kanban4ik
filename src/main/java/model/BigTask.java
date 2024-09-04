package model;

import java.util.ArrayList;
import java.util.Objects;

public class BigTask extends AbstractTask {

    private ArrayList<Integer> subtasksIdList = new ArrayList<>();

    public BigTask(String name, String description, int id, Status status) {
        super(name, description, id, status);
    }

    public ArrayList<Integer> getSubtasksIdList() {
        return subtasksIdList;
    }

    public void addSubtaskId(int id) {
        subtasksIdList.add(id);
    }

    public void removeSubtaskId(int id) {
        int indexOfSubtaskId = subtasksIdList.indexOf(id);
        subtasksIdList.remove(indexOfSubtaskId);
    }

    @Override
    public TypesOfTasks getTypeOfTask() {
        return TypesOfTasks.BIG_TASK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BigTask bigTask = (BigTask) o;
        return Objects.equals(subtasksIdList, bigTask.subtasksIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subtasksIdList);
    }

    public String toString() {
        return "BigTask{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", id=" + getId() +
                ", status='" + getStatus() + '\'' +
                ", startTime='" + getStartTime() + '\'' +
                ", endTime='" + getEndTime() + '\'' +
                '}';
    }
}
