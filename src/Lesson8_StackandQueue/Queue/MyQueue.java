package Lesson8_StackandQueue.Queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue implements MyQueueInterface{

    private List<String> queue;

    public MyQueue(List<String> queue) {
        this.queue = new ArrayList<>();
    }


    @Override
    public void add(String string) {
        this.queue.add(string);
    }

    @Override
    public String poll() {
        String temp;
        if (!this.queue.isEmpty()) {
            temp = this.queue.get(0);
            this.queue.remove(0);
            return temp;
        }

        return null;
    }

    @Override
    public String peek() {
        if (!this.queue.isEmpty()) {
            return this.queue.get(0);
        }

        return null;
    }
}
