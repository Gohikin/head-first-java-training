package methods;

/**
 * Created by wuhaijing on 2017/2/24.
 * TestDrive应当就是测试先行的概念，或者讲以测试来驱动开发
 * 整个流程的结构如下：
 * 1.在7格内随机选取连续的若干格
 * 2.用户猜测其中的一格
 * 3.当用户猜中所有的连续格子时结束
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper gameHelper = new GameHelper();
        int randomNum = (int) (Math.random() * 5);
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        simpleDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            String userGuess = gameHelper.getUserInput("Enter a number");
            String result = simpleDotCom.checkYourself(userGuess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses!");
            }
        }
    }
}
