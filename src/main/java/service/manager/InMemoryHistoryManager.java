package service.manager;

import model.AbstractTask;
import service.interfaces.HistoryManager;
import service.storage.Node;

import java.util.ArrayList;
import java.util.HashMap;

public class InMemoryHistoryManager implements HistoryManager {
    private HashMap<Integer, Node> idToTasksHistory = new HashMap<>();
    private Node head;
    private Node tail;

    @Override
    public void add(AbstractTask task) {
        remove(task.getId());
        linkLast(task);
    }

    @Override
    public void remove(int id) {
        Node node = idToTasksHistory.get(id);
        removeNode(node);
        idToTasksHistory.remove(id);
    }

    @Override
    public ArrayList<AbstractTask> getHistory() {
        return new ArrayList<>(getTasks());
    }

    private ArrayList<AbstractTask> getTasks() {
        ArrayList<AbstractTask> tasks = new ArrayList<>();

        for (Node node = head; node != null; node = node.getNext()) {
            if (node.getItem() != null) {
                tasks.add(node.getItem());
            }
        }

        return tasks;
    }

    private void linkLast(AbstractTask task) {
        int taskId = task.getId();
        Node tail = this.tail;
        Node newNode = new Node(task, null, tail);
        this.tail = newNode;

        if (tail == null) {
            this.head = newNode;
        } else {
            tail.setNext(newNode);
        }

        idToTasksHistory.put(taskId, newNode);
    }

    private void removeNode(Node node) {
        if (node != null) {
            Node nextNode = node.getNext();
            Node lastNode = node.getLast();

            if (node == head) {
                head = nextNode;
                tail = null;
            } else if (node == tail) {
                tail = lastNode;
                tail.setNext(null);
            } else {
                lastNode.setNext(nextNode);
            }
        }
    }
}
