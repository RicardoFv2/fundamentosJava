package OOP;

import java.util.Arrays;
import java.util.Scanner;

public class Subject {
    private String nameSubject;
    private double subjectClass[] = new double[7];
    public Subject(String name) {
        this.nameSubject = name;
    }
    public String getNameSubject() {
        return nameSubject;
    }
    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }
    public double[] getSubjectClass() {
        return subjectClass;
    }
    public void setSubjectClass(double[] subjectClass) {
        subjectClass = subjectClass;
    }
    public void addGrades() {
        Scanner textReader = new Scanner(System.in);
        System.out.println("Add the notes of 7 students of each subject " + nameSubject);
        for (int i = 0; i < subjectClass.length; i++) {
            subjectClass[i] = textReader.nextDouble();
        }
    }
    public double calculateMedium() {
        Double total = 0.0;
        for (int i = 0; i < subjectClass.length; i++) {
            total += subjectClass[i];
        }
        return (total / subjectClass.length);
    }
    public void studentsMedium(){
        Scanner textReader = new Scanner(System.in);

        System.out.println("Ingrese el identificador del alumno (de 0 -  6) para la materia " + nameSubject);
        int id = textReader.nextInt();
        double studentsMedium = (subjectClass[id] + subjectClass[id] + subjectClass[id]) / 3;
        System.out.println("Promedio alumno Nro " + id + " : " + studentsMedium);
    }
    @Override
    public String toString() {
        return "Subject{" +
                "nameSubject='" + nameSubject + '\'' +
                ", SubjectClass=" + Arrays.toString(subjectClass) +
                '}';
    }
}
