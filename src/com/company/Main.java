package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Inventory> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = 1;
            for (Inventory item : items) {
                String checkbox = "[" + item.available + "]";

                System.out.println(i + ". " + item.text + " " + checkbox);
                i++;
            }

            System.out.println("Options:");
            System.out.println("[1] Create new Item");
            System.out.println("[2] Remove an item from inventory");
            System.out.println("[3] Update item's quantity");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.println("Enter new item:");
                String text = scanner.nextLine();

                Inventory item = new Inventory(text, 0);
                items.add(item);


            } else if (option.equals("2")) {
                System.out.println(" Enter the number of the item you want to remove:");
                int itemNum = Integer.parseInt(scanner.nextLine());
                items.remove(itemNum - 1);
                System.out.println("Item successfully removed!");

            } else if (option.equals("3")) {
                System.out.println(" Choose item you'd like to update");
                int itemNum = Integer.parseInt(scanner.nextLine());
                System.out.println(" What would you like to change the quantity to?");
                int available = Integer.parseInt(scanner.nextLine());

                Inventory item = items.get(itemNum - 1);
                item.available = available;

            }
        }

    }

}