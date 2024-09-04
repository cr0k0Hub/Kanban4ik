package model;

import java.time.LocalDateTime;

public class Task extends AbstractTask {

    public Task(String name, String description) {
        super(name, description);
        this.setStartTime(LocalDateTime.now());
    }

    public Task(String name, String description, int id, Status status) {
        super(name, description, id, status);
        this.setStartTime(LocalDateTime.now());
    }

    @Override
    public TypesOfTasks getTypeOfTask() {
        return TypesOfTasks.TASK;
    }

    public String toString() {
        return "Task{" +
                "name='" + getName() + "'" +
                " , description='" + getDescription() + "'" +
                " , id=" + getId() + "'" +
                " , status='" + getStatus() + "'" +
                " , startTime='" + getStartTime() + "'" +
                " , endTime='" + getEndTime() + "'" +
                '}';
    }
}
