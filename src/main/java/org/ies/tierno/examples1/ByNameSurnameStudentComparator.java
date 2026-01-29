package org.ies.tierno.examples1;

import java.util.Comparator;

public class ByNameSurnameStudentComparator implements Comparator <Student> {
    @Override
    public int compare(Student st1, Student st2) {
        int compare = st1.getName().compareTo(st2.getName());
        if(compare == 0) {
            compare = st1.getSurname().compareTo(st2.getSurname());
            if(compare == 0) {
                compare = st1.getNif().compareTo(st2.getNif());
            }
        }
        return compare;
    }
}
