package P01_SortByNameAndAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            Person currentPerson = new Person(firstName, lastName, age);
            people.add(currentPerson);
        }
        people.sort((firstPerson, secondPerson) -> {
            int firstNameComparison = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
            if (firstNameComparison == 0){
                return firstNameComparison;
            }else {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
        });
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}