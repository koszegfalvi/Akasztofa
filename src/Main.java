import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int life = 8;
        String megoldas = "kecske";

        Scanner scanner = new Scanner(System.in);
        char[] eddigkitalalt = "_".repeat(megoldas.length()).toCharArray();


        while (Arrays.toString(eddigkitalalt).contains("_") && 0 < --life) {
            System.out.println(szepenFormaz(eddigkitalalt));
            System.out.printf("Ennyi életed maradt %d \n Mi a tipped?", life);
            Character beolvasott = scanner.nextLine().charAt(0);
            for (int i = 0; i < megoldas.length(); i++) {
                if (beolvasott == megoldas.charAt(i)) {
                    eddigkitalalt[i] = beolvasott;


                }

            }
            if (Arrays.toString(eddigkitalalt).contains(beolvasott.toString())) {
                life++;
            }
        }
        System.out.println(life>0?"nyertél, a kitalándó szó a: "+ megoldas.toUpperCase()+" volt":"vesztettél");
    }

    public static String szepenFormaz(char[] karakterek) {

        String result = "";
        for (char c : karakterek) {
            result += c + " ";
        }
        return result.toUpperCase();
    }
}
