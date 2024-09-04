package service.manager;

import model.BigTask;
import model.Subtask;
import model.Task;
import service.interfaces.HistoryManager;
import service.interfaces.TaskManager;
import service.storage.Repository;

import java.util.ArrayList;

public class InMemoryTaskManager implements TaskManager {
    protected int id = 1;
    protected Repository repository = new Repository();
    protected HistoryManager historyManager = Manager.getDefaultHistoryManager();

    @Override
    public int create(Task task) {
        task.setId(id++);
        repository.getTasksHashMap().put(task.getId(), task);

        return task.getId();
    }

    @Override
    public int create(BigTask bigTask) {
        bigTask.setId(id++);
        repository.getBigTasksHashMap().put(bigTask.getId(), bigTask);

        return bigTask.getId();
    }

    // TODO: добавить связку BigTask и Subtask
    @Override
    public int create(Subtask subtask) {
        subtask.setId(id++);
        repository.getTasksHashMap().put(sub)

        return subtask.getId();
    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void update(BigTask bigTask) {

    }

    @Override
    public void update(Subtask subtask) {

    }

    @Override
    public ArrayList<Task> getTasks() {
        return null;
    }

    @Override
    public ArrayList<BigTask> getBigTasks() {
        return null;
    }

    @Override
    public ArrayList<Subtask> getSubtasks() {
        return null;
    }

    @Override
    public Task getTaskById(int taskId) {
        return null;
    }

    @Override
    public BigTask getBigTaskById(int bigTaskId) {
        return null;
    }

    @Override
    public Subtask getSubtaskById(int subtaskId) {
        return null;
    }

    @Override
    public void deleteAllTasks() {

    }

    @Override
    public void deleteAllBigTasks() {

    }

    @Override
    public void deleteAllSubTasks() {

    }

    @Override
    public ArrayList<Subtask> getSubtasksInBigTask() {
        return null;
    }

    @Override
    public void deleteTaskById(int taskId) {

    }

    @Override
    public void deleteBigTaskById(int bigTaskId) {

    }

    @Override
    public void deleteSubtaskById() {

    }
}
