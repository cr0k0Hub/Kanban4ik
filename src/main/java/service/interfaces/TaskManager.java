package service.interfaces;

import model.BigTask;
import model.Subtask;
import model.Task;

import java.util.ArrayList;

public interface TaskManager {

    int create(Task task);
    int create(BigTask bigTask);
    int create(Subtask subtask);

    void update(Task task);
    void update(BigTask bigTask);
    void update(Subtask subtask);

    ArrayList<Task> getTasks();
    ArrayList<BigTask> getBigTasks();
    ArrayList<Subtask> getSubtasks();

    Task getTaskById(int taskId);
    BigTask getBigTaskById(int bigTaskId);
    Subtask getSubtaskById(int subtaskId);

    void deleteAllTasks();
    void deleteAllBigTasks();
    void deleteAllSubTasks();

    ArrayList<Subtask> getSubtasksInBigTask();

    void deleteTaskById(int taskId);
    void deleteBigTaskById(int bigTaskId);
    void deleteSubtaskById();
}
