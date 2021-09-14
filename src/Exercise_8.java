/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people? ");
        String people_string = scanner.nextLine();
        int people = Integer.parseInt(people_string);

        System.out.print("How many pizzas do you have? ");
        String pizzas_string = scanner.nextLine();
        int pizzas = Integer.parseInt(pizzas_string);

        System.out.print("How many slices per pizza? ");
        String slices_string = scanner.nextLine();
        int slices = Integer.parseInt(slices_string);

        int total_slices = pizzas * slices;

        System.out.println(people_string + " people with " + pizzas_string +
                " pizzas (" + total_slices + " slices)");

        int slices_per_person = total_slices / people;
        int slices_per_person_float = total_slices / people;

        System.out.println("Each person gets " + slices_per_person + " pieces of pizzas. ");

        int left_over_num = slices_per_person_float - slices_per_person;
        System.out.println("There are " + left_over_num + " leftover pieces.");
    }
}