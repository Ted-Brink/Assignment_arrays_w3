package se.lexicon.tedbrink;

import java.util.Arrays;


public class AssignmArrayW3 {
    private static String[] arr = {"Adam svensson", "Bertil Karlsson", "Cesar Svensson", "David Eriksson",
            "Bertil Lindberg", "David Svensson"};

    public static void main(String[] args) {

        System.out.println("Arry storlek: " + getSize(arr));    // 1. Vilken storlek på array?

       // clear(arr); fungerar inte                             // 3. töm array XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

        find("Adam Svensson");                          // 5. Finns namnet?
       // System.out.println(find("adam Svensson"));


        String nyttNamn = "Olle Knas";  // namn att lägga till      // 4. lägg till namn
        add(nyttNamn);
        System.out.println(arr[arr.length-1]);

    }

    //______________________________________________________________________________________________

    public static int getSize(String[] source) { // 1. Storlek på array
        return source.length;
    }

    public static String[] clear(String[] source) {

        source = null;
        return source;

        //System.out.println(arr[0] + " testing");
    }

    public static String find(final String fullName) {  // 5. Sök efter hela namnet

        String fullNameFound = null;

        for (int i = 0; i < arr.length; i++) {

            if (fullName.equalsIgnoreCase(arr[i])) {
                fullNameFound = fullName;

              //  System.out.println(fullName + " Finns");
                break;

            }
            else {
                System.out.println(fullName +", finns inte");
                return null;
            }
        }
        System.out.println(fullNameFound +", Namnet finns.");
        return fullNameFound;
    }



    public static boolean add(final String nyttNamn) {  //XXXXXXXXXXXXXXXXXXXXXXXXXXXXX


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
        expandedArray[expandedArray.length -1] = nyttNamn;

        //Replacing OG Array, with newly created and with an element.
        arr = expandedArray;

        System.out.println("ny person");
        System.out.println("Arrays.toString(namnet) = " + Arrays.toString(arr));
        return true;


        public static String[] findAll() {       //Returns all names in a new array
          //  String[] copyArr = new String[0];
            //System.arraycopy( arr, 0, copyArr, 0, arr.length );

        String[] copyArr = Arrays.copyOfRange(arr,0,arr.length);
            return copyArr;
        }


        }

    }


}