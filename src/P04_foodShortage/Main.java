package P04_foodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input.length == 4){
                Citizen citizen = new Citizen
                        (input[0], Integer.parseInt(input[1]), input[2], input[3]);
                citizens.add(citizen);
            }else if (input.length == 3){
                Rebel rebel = new Rebel
                        (input[0], Integer.parseInt(input[1]), input[2]);
                rebels.add(rebel);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            for (Citizen citizen : citizens){
                if (citizen.getName().equals(command)){
                    citizen.buyFood();
                }
            }
            for (Rebel rebel : rebels){
                if (rebel.getName().equals(command)){
                    rebel.buyFood();
                }
            }
            command = scanner.nextLine();
        }
        int totalFood = 0;

        for (Citizen citizen : citizens){
            totalFood += citizen.getFood();
        }
        for (Rebel rebel : rebels){
            totalFood += rebel.getFood();
        }
        System.out.println(totalFood);
    }
}
