package day05;

public class JournalMain {
    public static void main(String[] args) {
        Journal journal = new Journal();

        System.out.println(journal.addStudent(""));
        System.out.println(journal.addStudent(null));
        System.out.println(journal.addStudent("Natalie Portman "));
        System.out.println(journal.addStudent("  Anne Hathaway "));
        System.out.println(journal.addStudent("  Jennifer Lawrence  "));
        System.out.println(journal.addStudent("Madonna"));
        System.out.println(journal.addStudent("   Cher   "));
    }
}
