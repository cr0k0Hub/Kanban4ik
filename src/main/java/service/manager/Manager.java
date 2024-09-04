package service.manager;

import service.interfaces.HistoryManager;

public class Manager {
    public static HistoryManager getDefaultHistoryManager() {
        return new InMemoryHistoryManager();
    }
}
