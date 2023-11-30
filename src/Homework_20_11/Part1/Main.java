package Homework_20_11.Part1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //вроде было не слишком сложно, но очень даже прикольно.
        //теперь доконца понял как работает статик и многое другое.
        //я не доконца уверен что все работает так как вы хотите, но вроде все методы проверил
        //ну и извиняюсь что какая-то немного путаница получась, надеюсь поймете мои идеи.

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {10,11,-10,-4,5,2,-1,0,11};
        System.out.println(Arrays.toString(makeInvArray(array)));
        System.out.println(findMin(array2));
        System.out.println();

        Book book = new Book("Harry Potter", "J.K. Rowling", 1997);
        book.infoAboutBook();
        book.isBookOld();
        Reader reader = new Reader("Matvej Klauzer", 17, new String[]{"Time Machine", "Lord of the Rings"});
        System.out.println();
        reader.takeBook("Harry Potter");
        System.out.println();
        reader.returnBook("Time Machine");
        System.out.println();
        Library library = new Library("Central Library", "Schoenberg Str.31");
        library.addLibrarian("John Jonson", 11);
        library.addLibrarian("Conor McGregor", 5);
        library.findLibrarian("John Jonson");
        library.findLibrarian("Conor McGregor");
        System.out.println(Arrays.toString(library.getLibrarianList()));

    }

    private static int[] makeInvArray(int[] array) {
        int[] resultArray = new int[array.length];
        int temp = array.length-1;
        for (int i = 0; i < array.length; i++) {
            resultArray[temp] = array[i];
            temp--;
        }
        return resultArray;
    }

    private static int findMin(int[] array) {
        int firstMin = array[0];
        int secondMin = array[0];
        int thirdMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if (firstMin > array[i]) {
                firstMin = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (firstMin < array[i] && array[i] < secondMin) {
                secondMin = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (secondMin < array[i] && array[i] < thirdMin) {
                thirdMin = array[i];
            }
        }
        return thirdMin;
    }
}