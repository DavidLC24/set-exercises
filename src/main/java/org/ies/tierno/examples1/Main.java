package org.ies.tierno.examples1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
        public static void main(String[] args) {
            Set<Student> studentsOrderBySurname = new TreeSet<>(new BySurnameNameStudentComparator());
            studentsOrderBySurname.add(new Student("31X", "Bob", "Esponja"));
            studentsOrderBySurname.add(new Student("2X", "Peppa", "Cerda"));
            studentsOrderBySurname.add(new Student("1X", "George", "Cerdo"));
            studentsOrderBySurname.add(new Student("10X", "George", "Cerdo"));

            System.out.println("Ordenados por apellidos y nombre");
            for(var student: studentsOrderBySurname) {
                System.out.println(student);
            }

            Set<Student> studentsOrderByName = new TreeSet<>(new ByNameSurnameStudentComparator());
            studentsOrderByName.add(new Student("31X", "Bob", "Esponja"));
            studentsOrderByName.add(new Student("331X", "Pocoyo", "Pocoyo"));
            studentsOrderByName.add(new Student("2X", "Peppa", "Cerda"));
            studentsOrderByName.add(new Student("1X", "George", "Cerdo"));
            studentsOrderByName.add(new Student("10X", "George", "Cerdo"));

            System.out.println();
            System.out.println();
            System.out.println("Ordenados por nombre y apellidos");

            for(var student: studentsOrderByName) {
                System.out.println(student);
            }

        }
    }