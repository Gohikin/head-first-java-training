package step3.dotcom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhaijing on 2017/2/24.
 * TestDrive应当就是测试先行的概念，或者讲以测试来驱动开发
 * 整个流程的结构如下：
 * 1.在7格内随机选取连续的若干格
 * 2.用户猜测其中的一格
 * 3.当用户猜中所有的连续格子时结束
 */
public class DotComTestDrive {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper gameHelper = new GameHelper();
        int randomNum = (int) (Math.random() * 5);
        DotCom dotCom = new DotCom();
        List<String> locationCells = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            locationCells.add(String.valueOf(randomNum + i));
        }
//        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        dotCom.setLocationCells(locationCells);
        boolean isAlive = true;
        while (isAlive) {
            String userGuess = gameHelper.getUserInput("Enter a number");
            String result = dotCom.checkYourself(userGuess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses!");
            }
        }
    }
}
