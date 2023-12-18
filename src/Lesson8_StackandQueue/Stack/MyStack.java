package Lesson8_StackandQueue.Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyStack implements MyStackInterface<String> {

    private List<String> stack;

    public MyStack(List<String> stack) {
        this.stack = new ArrayList<>();
    }

    @Override
    public void put(String string) {
        this.stack.add(string);
    }

    @Override
    public boolean isEmpty() {
        if (this.stack.size() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public java.lang.String get() {
        if(!this.stack.isEmpty()) {
            System.out.println(this.stack.get(stack.size()-1));
        }
        return null;
    }
}
