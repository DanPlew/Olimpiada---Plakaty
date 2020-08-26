package Program;

import java.util.*;

/**
 * Zadanie rekrutacyjnę: Olimpiada informatyczna XV - Plakaty.
 */

public class Main {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int numberOfBuildings = Integer.parseInt(scanner.nextLine());

        if(numberOfBuildings != 0) {
            int[] stos = new int[numberOfBuildings];
            stos[0] = Integer.parseInt(scanner.nextLine().split(" ")[1]);

            int loadedBuilding;
            int posters = 0;
            int index = 0;

            for (int i = 1; i < stos.length; i++) {
                loadedBuilding = Integer.parseInt(scanner.nextLine().split(" ")[1]);

                while (loadedBuilding < stos[index]) {
                    posters++;
                    index--;
                    if (index < 0) {
                        index = 0;
                        stos[index] = loadedBuilding;
                    }
                }
                if (loadedBuilding > stos[index]) {
                    index++;
                    stos[index] = loadedBuilding;
                }
            }
            posters = posters + index + 1;
            System.out.println(posters);
        }
        else System.out.println("0");
    }
}