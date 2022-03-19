package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        if (s1.getAge() < s2.getAge())
        {
            return -1;	// a negative value
        }
        else if (s1.getAge() == s2.getAge())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }


}





