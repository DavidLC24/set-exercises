package org.ies.tierno.examples;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Comparable<Student>{
        private String nif;
        private String name;
        private String surname;

        @Override
        public int compareTo(Student o) {
            int compare = this.surname.compareTo(o.getSurname());
            if (compare == 0) {
                compare = this.name.compareTo(o.name);
                if(compare == 0) {
                    compare = this.nif.compareTo(o.nif);
                }
            }
            return compare;
        }

    }

