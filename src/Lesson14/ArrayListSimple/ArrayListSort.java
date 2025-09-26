package Lesson14.ArrayListSimple;
import java.util.*;

public class ArrayListSort {

    public static void main(String[] args) {

        // Lav en ArrayList med nogle navne
        List<String> navne = new ArrayList<>(Arrays.asList(
                "Anders",
                "Maria",
                "Zara",
                "Bo",
                "karsten",
                "Line",
                "ole",
                "Anna"
        ));
    originalListe(navne);
    alfabetiskSort(navne);
    alfabetiskCaseInsensitive(navne);
    omvendtSort(navne);
    }

        public static void originalListe(List navne) {
            System.out.println("Original liste:");
            System.out.println(navne);
            System.out.println();
        }

        public static void alfabetiskSort(List navne) {
            // 1) Alfabetisk (standard sortering)
            List<String> alfabetisk = new ArrayList<>(navne);
            Collections.sort(alfabetisk);
            System.out.println("1) Alfabetisk (standard, store/små bogstaver adskilt):");
            System.out.println(alfabetisk);
            System.out.println();
        }

        public static void alfabetiskCaseInsensitive(List navne) {

            // 2) Alfabetisk case-insensitive (ignorer store/små bogstaver)
            List<String> alfabetiskCI = new ArrayList<>(navne);
            alfabetiskCI.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println("2) Alfabetisk (case-insensitive):");
            System.out.println(alfabetiskCI);
            System.out.println();
        }

        public static void omvendtSort(List navne) {
            // 3) Omvendt rækkefølge (case-insensitive)
            List<String> omvendt = new ArrayList<>(navne);
            omvendt.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
            System.out.println("3) Omvendt alfabetisk (case-insensitive):");
            System.out.println(omvendt);
        }

}


