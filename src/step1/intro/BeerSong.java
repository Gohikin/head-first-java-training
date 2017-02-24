package step1.intro;

/**
 * Created by wuhaijing on 2017/2/23.
 * My version of BeerSong
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String[] singularPluralStrings = {"bottle", "bottles"};
        while (beerNum > 0) {
            String word = switchSingularPluralPair(singularPluralStrings, beerNum);
            printBeerSong(beerNum, word, true);
            printBeerSong(beerNum, word, false);
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum -= 1;
            word = switchSingularPluralPair(singularPluralStrings, beerNum);
            if (isPositive(beerNum)) {
                printBeerSong(beerNum, word, true);
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }
    }

    private static boolean isPositive(int num) {
        return num > 0;
    }

    private static void printBeerSong(int beerNum, String word, boolean isOnTheWall) {
        if (isOnTheWall) {
            System.out.println(beerNum + " " + word + " of beer on the wall");
        } else {
            System.out.println(beerNum + " " + word + " of beer.");
        }
    }

    private static String switchSingularPluralPair(String[] singularPluralStrings, int num) {
        return num == 1 ? singularPluralStrings[0] : singularPluralStrings[1];
    }
}

