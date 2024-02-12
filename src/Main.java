import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> myMap1 = new HashMap<>();
        ArrayList<String> cities = new ArrayList();
        Scanner input = new Scanner(System.in);
        String name = recieveInput();
        while(!(name.equals("END"))){
            cities.add(recieveInput());
        }
        for (int i = 0; i < cities.size(); i++) {
            myMap1.put(cities.get(i), tempAvg());
        }
        System.out.println(myMap1);
    }
    static String recieveInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a City:");
        String a = input.nextLine();
        return a;
    }
    static double tempAvg(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp for the next day:");
        double temp1 = parseDouble(input.nextLine());
        System.out.println("Enter the temp for the next day:");
        double temp2 = parseDouble(input.nextLine());
        System.out.println("Enter the temp for the next day:");
        double temp3 = parseDouble(input.nextLine());
        System.out.println("Enter the temp for the next day:");
        double temp4 = parseDouble(input.nextLine());
        System.out.println("Enter the temp for the next day:");
        double temp5 = parseDouble(input.nextLine());
        double a = (temp1 + temp2 + temp3+ temp4 + temp5)/5;
        return a;
    }
}