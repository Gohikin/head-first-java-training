package step2.dicegame;

import java.util.Random;

/**
 * Created by wuhaijing on 2017/2/23.
 */
public class Player {
    int number = 0;
    String name;

    public void throwDice() {
        Random random = new Random();
        number = random.nextInt(5) + 1;
        System.out.println(name + "掷出了" + number + "点");
    }
}
