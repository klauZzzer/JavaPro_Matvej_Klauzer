package Homework_20_11.Part1;

public class Library {
    private String name;
    private String address;
    private static Librarian[] librarianList = new Librarian[0];


    public Library(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Librarian[] getLibrarianList() {
        return librarianList;
    }

    public void addLibrarian(String name, int experience) {
        Librarian librarian = new Librarian(name, experience);
        Librarian[] libList = new Librarian[librarianList.length+1];
        for (int i = 0; i < libList.length; i++) {
            if (i < librarianList.length) {
                libList[i] = librarianList[i];
            } else {
                libList[i] = librarian;
                librarianList = libList;
            }
        }
    }

    public void findLibrarian(String librarianName) {
        for (int i = 0; i < librarianList.length; i++) {
            if (librarianName.equals(librarianList[i].getName())) {
                System.out.println("Имя - " + librarianList[i].getName() +
                        ", опыт - " + librarianList[i].getExperience());
            }
        }
    }
}
