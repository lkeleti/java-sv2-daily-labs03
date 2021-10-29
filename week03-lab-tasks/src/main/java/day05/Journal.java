package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> names = new ArrayList<>();

    public boolean addStudent(String studentName) {
        if (studentName != null && studentName.trim().contains(" ")) {
            names.add(studentName.trim());
            return true;
        }
        else {
            return false;
        }
    }
}
