package com.dkit.gd2.johnloane;

import java.util.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * OOP CA3
 * @author John Loane
 */
public class App 
{
    public static void main( String[] args )
    {
        //Question 1
        List<Student> students = new ArrayList<>();
        questionOnePartA(students);
        System.out.println("Basic Arraylist");
        display(students);
        System.out.println();

        StudentNameComparator nameComparator = new StudentNameComparator();
        Collections.sort(students,nameComparator);
        System.out.println("Names Sorted");
        display(students);
        System.out.println();

        StudentAgeComparator ageComparator = new StudentAgeComparator();
        Collections.sort(students,ageComparator);
        System.out.println("Ages Sorted");
        display(students);
        System.out.println();

        //Question D
        //Adding one student to an Arraylist is quick and is there 0(1) however the more students
        //that you added it becomes 0(N)

        //Question 2

        List<Employee> employees = new ArrayList<Employee>();
        questionTwoPartA(employees);

        System.out.println();
        questionTwoPartB();

        System.out.println();
        questionTwoPartC();

        System.out.println();
        //questionTwoPartD();



        /*System.out.println("Using queue.remove() will retrieve the values in Priority Order");
        while(!waitlist.isEmpty())
            System.out.println(waitlist.remove());

        if(waitlist.isEmpty())
            System.out.println("The queue is now empty.");*/









        //Question 3
        List<String> oneHundredStrings = new ArrayList<>();
        populateOneHundredStrings(oneHundredStrings);
        questionThreePartA(oneHundredStrings);

        //Question 3 B
        //Searching through a List is 0(N) as it has to go through all the Strings in the list
        //However removing from a List is 0(1)



        //Question 4
        compareTwoStudents();
        //questionFourPartA();
        //Because they are two different objects and with the toEquals or Hashcode override and
        //therefore are declaring that they are not equal

        //questionFourPartB();
        //It is returning different as the override equals and hash has not been set
        //and therefore the original hashcode is going to treat the two objects are different
        //and thus returning different hashcodes
        //

        //QuestionFourPartC
        //Running the code will show the two alexs now have the same hashcode
        //To do this i generated hashcode and Equals in Student Class

    }




    //Question One
    private static void questionOnePartA(List list)
    {
        list.add(new Student(1, "Booker DeWitt", 21));
        list.add(new Student(2, "Elizabeth Comstock", 22));
        list.add(new Student(3, "Marc Specter", 19));
        list.add(new Student(4, "Callum Ainley", 18));



    }


    //Question2
    private static void questionTwoPartA(List employees)
    {
        employees.add(new Employee("John", "Smith"));
        employees.add(new Employee("Mary", "Kelly"));
        employees.add(new Employee("Francis", "O'hara"));
        employees.add(new Employee("Nathan", "Field" ));
        employees.add(new Employee("Michael", "Flynn" ));
    }

    private static void questionTwoPartB()
    {
        Set<String> names = new TreeSet<>();

        names.add("Sam");
        names.add("Dean");
        names.add("Mary");
        names.add("Mary");  // duplicate will not be added
        names.add("John");


        display2(names);
    }

    private static void questionTwoPartC()
    {
        String title = "John, Sarah, John, Louise, Mary";
        String array[] = title.split(" ");

        for(String s: array)
            System.out.println(s+", ");

        Map<String, Integer> wordCountMap = new HashMap<>();

        for(String word : array)
        {
            Integer count = wordCountMap.get(word);
            if (count != null)
            {

                wordCountMap.put(word,(count+1));

            } else
            {
                wordCountMap.put(word, 1); // add new word with count 1
            }
        }


    }

    private static void questionTwoPartD()
    {
        Queue <Employee> waitlist
                = new PriorityQueue<Employee>();

        waitlist.add(new Employee("John", "Smith"));
        waitlist.add(new Employee("Mary", "Kelly"));
        waitlist.add(new Employee("Francis", "O'hara"));
        waitlist.add(new Employee("Nathan", "Field" ));

        //System.out.println(waitlist);

    }



    //Question3
    //This is just a helper method to populate the list of strings for question 3. You do not need to read it to answer any of the questions in the CA
    private static void populateOneHundredStrings(List<String> oneHundredStrings)
    {
        for(int i=0; i < 100; i++)
        {
            if(i / 10 == 0)
            {
                oneHundredStrings.add("Java");
            }
            else if(i / 10 == 1)
            {
                oneHundredStrings.add("Python");
            }
            else if(i / 10 == 2)
            {
                oneHundredStrings.add("C++");
            }
            else if(i / 10 == 3)
            {
                oneHundredStrings.add("Javascript");
            }
            else if(i / 10 == 4)
            {
                oneHundredStrings.add("Ruby");
            }
            else if(i / 10 == 5)
            {
                oneHundredStrings.add("Golang");
            }
            else if(i / 10 == 6)
            {
                oneHundredStrings.add("C#");
            }
            else if(i / 10 == 7)
            {
                oneHundredStrings.add("C");
            }
            else if(i / 10 == 8)
            {
                oneHundredStrings.add("R");
            }
            else if(i / 10 == 9)
            {
                oneHundredStrings.add("Swift");
            }
        }
    }

    public static void questionThreePartA( List<String> list)
    {
        ListIterator<String> iterator = list.listIterator();


        while (iterator.hasNext())
        {
            if (iterator.next().equals(iterator.previous()))
            {
                iterator.remove();
            }
        }
    }

    //Question 4
    //The method below relates to Question 4
    private static void compareTwoStudents()
    {
        Student alex1 = new Student(1, "Alex", 22);
        Student alex2 = new Student(1, "Alex", 22);
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }






    //displays
    public static void display(List<Student> students)
    {
        for (Student s: students) { System.out.println(s); }
    }

    public static void display1(List<String> s1)
    {
        for (String s: s1) { System.out.println(s); }
    }


    public static void display3(Queue<Employee> employees)
    {
        for (Employee s: employees) { System.out.println(s); }
    }

    public static void display2(Set<String> set)  // The interface type 'Set' is used
    {                                     // to accept either HashSet or TreeSet

        System.out.println("Display set using for() loop:");
        for (String s : set)
            System.out.println(s);

    }



}
