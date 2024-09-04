package service.storage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.AbstractTask;

@AllArgsConstructor
@Getter
@Setter
public class Node {
    private AbstractTask item;
    private Node next;
    private Node last;
}
