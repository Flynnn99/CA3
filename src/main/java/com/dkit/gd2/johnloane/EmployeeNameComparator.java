package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>
{
    private SortType sortType;


    public EmployeeNameComparator(
    SortType sortType)
    {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee p1, Employee p2)
    {
        int direction = sortType.getValue();
        return direction * (p1.getFirstName().compareTo(p2.getFirstName()));
    }




}