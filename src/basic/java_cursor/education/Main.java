package basic.java_cursor.education;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Task 1:");
        System.out.println("-\tThere are an ArraList with values: 3,9,11,18,20,22.");
        System.out.println("\tRemove all numbers which are divisible by 3.");
        System.out.println("********************************************************");

        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(9);
        arrayList1.add(11);
        arrayList1.add(18);
        arrayList1.add(20);
        arrayList1.add(22);

        System.out.println("arrayList1: " + arrayList1);

        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) % 3 == 0) {
                arrayList1.remove(i);
                i--;
            }
        }
        System.out.println("After removal numbers are divisible by 3:");
        System.out.println("arrayList1:" + arrayList1);
        System.out.println("********************************************************");

        System.out.println("Task 2:");
        System.out.println("-\tArray list with list of fruits. Replace value “Orange” to “Grapefruit“");
        System.out.println("\tif it exist/ If not – return message, that value not present.");
        System.out.println("********************************************************");
        System.out.println();

        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Orange");
        arrayList2.add("Banana");
        arrayList2.add("Orange");
        arrayList2.add("Apricot");
        arrayList2.add("Avocado");
        arrayList2.add("Apple");
        arrayList2.add("Grapefruit");
        System.out.println("arrayList2: " + arrayList2);
        int count = 0;
        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2.get(i) == "Orange") {
                arrayList2.set(i, "Grapefruit");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Missing <Orange> is on the list");
        }
        System.out.println("arrayList2: " + arrayList2);
        System.out.println("********************************************************");
        System.out.println();

        System.out.println("Task 3:");
        System.out.println("-\tThere are two ArrayLists with data.Check if they both have at least ");
        System.out.println("\tone similar element.");
        System.out.println("********************************************************");
        System.out.println();

        List<String> animal = new ArrayList<>();
        List<String> pet = new ArrayList<>();

        animal.add("Stork");
        animal.add("Shark");
        animal.add("Squirrel");
        animal.add("Wild boar");
        animal.add("Kangaroo");
        animal.add("Rabbit");
        animal.add("Fox");

        pet.add("Chicken");
        pet.add("Horse");
        pet.add("Pig");
        pet.add("Kit");
        pet.add("Dog");
        pet.add("Cow");
        pet.add("Rabbit");

        boolean examination = false;

        for (int i = 0; i < animal.size(); i++) {
            for (int j = 0; j < pet.size(); j++) {
                if (animal.get(i) == pet.get(j)) {
                    examination = true;
                }
            }
        }
        if (examination) {
            System.out.println("ArrayList pet and animal have matching elements");
        } else {
            System.out.println("ArrayList pet and animal not have matching elements");
        }
        System.out.println("********************************************************");
        System.out.println();
    }
}
