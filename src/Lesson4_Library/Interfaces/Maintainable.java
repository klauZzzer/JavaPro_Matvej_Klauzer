package Lesson4_Library.Interfaces;

import Lesson4_Library.Enums.ItemCondition;

public interface Maintainable {
    void repairItem();
    void updateItemCondition(ItemCondition condition);
    ItemCondition checkCondition();
}
