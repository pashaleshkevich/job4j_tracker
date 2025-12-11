package ru.job4j.encapsulation;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Pavel Leshkevich");
        student.setGroup("OB-32z");
        student.setYearOfAdmission(2023);
        System.out.println(student.getName() + " "
                + student.getGroup() + " "
                + student.getYearOfAdmission());
    }
}
