package model;

import java.util.Objects;

public class Subtask extends AbstractTask {

    private int bigTaskId;

    public Subtask(String name, String description, int id, Status status, int bigTaskId) {
        super(name, description, id, status);
        this.bigTaskId = bigTaskId;
    }

    public int getBigTaskId() {
        return bigTaskId;
    }

    @Override
    public TypesOfTasks getTypeOfTask() {
        return TypesOfTasks.SUBTASK;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Subtask subtask = (Subtask) o;
        return bigTaskId == subtask.bigTaskId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bigTaskId);
    }

    public String toString() {
        return "Subtask{" +
                "bigTaskId=" + bigTaskId +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", id=" + getId() +
                ", status='" + getStatus() + '\'' +
                ", startTime='" + getStartTime() + '\'' +
                ", endTime='" + getEndTime() + '\'' +
                '}';
    }
}
