package service.interfaces;

import model.AbstractTask;

import java.util.ArrayList;

public interface HistoryManager {

    void add(AbstractTask task);

    void remove(int id);

    ArrayList<AbstractTask> getHistory();
}
