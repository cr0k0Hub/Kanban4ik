package service.storage;

import lombok.Getter;
import model.BigTask;
import model.Subtask;
import model.Task;

import java.util.HashMap;

@Getter
public class Repository {
    private HashMap<Integer, Task> tasksHashMap = new HashMap<>();
    private HashMap<Integer, BigTask> bigTasksHashMap = new HashMap<>();
    private HashMap<Integer, Subtask> subtasksHashMap = new HashMap<>();
}
