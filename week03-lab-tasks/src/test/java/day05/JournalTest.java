package day05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JournalTest {
    @Test void addStudentTest() {
        Journal journal = new Journal();

        assertFalse(journal.addStudent(""));
        assertFalse(journal.addStudent(null));
        assertTrue(journal.addStudent("Natalie Portman "));
        assertTrue(journal.addStudent("  Anne Hathaway "));
        assertTrue(journal.addStudent("  Jennifer Lawrence  "));
        assertFalse(journal.addStudent("Madonna"));
        assertFalse(journal.addStudent("   Cher   "));
    }
}
