package se.lexicon.tedbrink;

import java.util.Arrays;


public class AssignmArrayW3 {
    private static String[] arr = {"Adam svensson", "Bertil Karlsson", "Cesar Svensson", "David Eriksson",
            "Bertil Lindberg", "David Svensson"};

    public static void main(String[] args) {

        System.out.println("Arry storlek: " + getSize(arr));    // 1. antal moduler på array?



        String nyttNamn = "Olle Knas";  // namn att lägga till      // 4. lägg till namn
        add(nyttNamn);
        System.out.println(arr[arr.length - 1]);

        find("adam Svensson");                          // 5. Finns namnet?


        String a[] = findAll(arr);                               // 6. Returnerar alla namn i en ny array
        System.out.println(Arrays.toString(a));
    }

    //______________________________________________________________________________________________

    public static int getSize(String[] source) {                 // 1. Antal moduler på array?
        return source.length;
    }

    public static String find(final String fullName) {          // 5. Sök efter hela namnet

        String fullNameFound = null;
        for (int i = 0; i < arr.length; i++) {
            if (fullName.equalsIgnoreCase(arr[i])) {
                fullNameFound = fullName;
                //  System.out.println(fullName + " Finns");
                break;
            } else {
                System.out.println(fullName + ", finns inte");
                return null;
            }
        }
        System.out.println(fullNameFound + ", Namnet finns.");
        return fullNameFound;
    }


    public static boolean add(final String nyttNamn) {          // 4. Lägg till nytt namn
        // No duplicates allowed
        for (String nyPerson :
                arr) {
            if (nyttNamn.equalsIgnoreCase(nyPerson)) {
                return false;
            }
        }
        // Add behavior
        //"Expanding" Array
        String[] expandedArray = Arrays.copyOf(arr, arr.length + 1);
        System.out.println("Arrays.toString(expandedArray) = " + Arrays.toString(expandedArray));

        //Added Element to The Array
        expandedArray[expandedArray.length - 1] = nyttNamn;

        //Replacing OG Array, with newly created and with an element.
        arr = expandedArray;
        return true;
    }
    public static String[] findAll(String[] names) {                        // 6. Returns all names in a new array
        String[] nyArr = Arrays.copyOfRange(names, 0, names.length);
        return nyArr;
    }
}