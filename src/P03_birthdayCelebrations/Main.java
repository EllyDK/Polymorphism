package P03_birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<String> dates = new ArrayList<>();

        while (!input[0].equals("End")){
            if (input[0].equals("Citizen")){
                Citizen citizen = new Citizen(input[1], Integer.parseInt(input[2]), input[3], input[4]);
                dates.add(citizen.getBirthDate());
            }else if (input[0].equals("Pet")) {
                Pet pet = new Pet(input[1], input[2]);
                dates.add(pet.getBirthDate());
            }

            input = scanner.nextLine().split("\\s+");
        }
        String year = scanner.nextLine();

        for (String date : dates){
            if (date.contains(year)){
                System.out.println(date);
            }
        }
    }
}
