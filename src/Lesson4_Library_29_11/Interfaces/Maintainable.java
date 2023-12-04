package Lesson4_Library_29_11.Interfaces;

import Lesson4_Library_29_11.Enums.ItemCondition;

public interface Maintainable {
    void repairItem();
    void updateItemCondition(ItemCondition condition);
    ItemCondition checkCondition();
}
