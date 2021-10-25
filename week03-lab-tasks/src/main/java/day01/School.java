package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();
        students.addHeight(140);
        students.addHeight(150);
        students.addHeight(150);
        students.addHeight(162);
        students.addHeight(163);
        students.addHeight(170);
        //Igaz értéket várok, mert növekvő sorrendben van a lista
        System.out.println(students.isHeightsIncreasing());

        //Hamis értéket várok, mert az utolsó elem miatt már nem növekvő a lista
        students.addHeight(130);
        System.out.println(students.isHeightsIncreasing());
    }
}
