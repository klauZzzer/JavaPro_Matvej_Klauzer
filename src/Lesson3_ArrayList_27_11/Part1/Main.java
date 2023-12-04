package Lesson3_ArrayList_27_11.Part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();
        Third third = new Third();
        Fourth fourth = new Fourth();

        int[] intArray1 = {22, 3, 4, 5, 2, 6, 4, 2, 8, 1, 10};
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(3);
        arrayList1.add(10);
        arrayList1.add(2);
        arrayList1.add(5);
        arrayList1.add(7);
        arrayList1.add(8);
        first.sumOf2Numbers(intArray1, 10);
        first.sumOf2Numbers(arrayList1, 15);
        System.out.println();

        int[] intArray2 = {2,2,3,10,5,7,8,5,10,11,10,10,10,3,2,3,2,1};
        System.out.println();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(6);
        arrayList2.add(4);
        arrayList2.add(4);
        arrayList2.add(8);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(3);
        arrayList2.add(6);
        second.howMuchAre(intArray2);
        System.out.println();
        second.howMuchAre(arrayList2);
        System.out.println();

        int[] intArray3 = new int[]{1,10,7,2,2,2,2,2,3,6,5,6,6,5,5,4,6,7};
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(3);
        arrayList3.add(3);
        arrayList3.add(1);
        arrayList3.add(5);
        arrayList3.add(6);
        arrayList3.add(5);
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(2);
        third.removeDuplicates(intArray3);
        third.removeDuplicates(arrayList3);
        System.out.println();

        int[] intArray4 = new int[]{1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(1);
        arrayList4.add(2);
        arrayList4.add(3);
        arrayList4.add(4);
        arrayList4.add(5);
        arrayList4.add(6);
        arrayList4.add(7);
        arrayList4.add(8);
        arrayList4.add(9);
        arrayList4.add(10);
        fourth.turn(intArray4);
        fourth.turn(arrayList4);

    }
}
