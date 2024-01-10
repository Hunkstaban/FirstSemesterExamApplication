package DataStructures;

import IO.Input;

import java.util.*;

public class DataStructures {

    static void peoplePlayground() {

        Person[] people = createPeople();

        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(people));
        System.out.println("The people you've created: ");
        System.out.println(personList);

        Map<Integer,Person> personMap = new HashMap<>();
        for (Person p : personList) {
            personMap.put(p.getAge(), p);
        } // TODO: handle if they have the same age

        System.out.println(personMap);

        /*while (true) {
            System.out.println("\nYou have the option to sort the people. How would you like them sorted?" +
                    "(1. Ascending age, 2. Descending age, 3. Ascending name, 4. Descending name");
            int choice = Input.getInt();
            switch (choice) {
                case 1:
                    System.out.println("\nYour people sorted in ascending order from age: ");
                    personList.sort(new ascAge());
                    System.out.println(personList);
                    break;
                case 2:
                    System.out.println("\nYour people sorted in descending order from age: ");
                    personList.sort(new descAge());
                    System.out.println(personList);
                    break;
                case 3:
                    System.out.println("\nYour people sorted in alphabetical order from name: ");
                    personList.sort(new alphabetName());
                    System.out.println(personList);
                    break;
                case 4:
                    System.out.println("\nYour people sorted in descending alphabetical order from name: ");
                    personList.sort(new alphabetDescName());
                    System.out.println(personList);
                    break;
            }
        }*/

    }

    static Person[] createPeople() {
        int amount = Input.getInt("How many people would you like to make?");
        Person[] people = new Person[amount];
        System.out.println("You've decided to create " + amount + " people");
        for (int i = 0; i < amount; i++) {
            people[i] = new Person(Input.getString("What's the name of person " + (i+1)), Input.getInt("How old are they?"));
            System.out.println(people[i].getName() + " has been saved");
        }
        return people;
    }


    private static class ascAge implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }
    }

    private static class descAge implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o2.getAge() - o1.getAge();
        }
    }

    private static class alphabetName implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    private static class alphabetDescName implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o2.getName().compareTo(o1.getName());
        }
    }
}
