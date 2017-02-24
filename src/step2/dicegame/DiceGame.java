package step2.dicegame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhaijing on 2017/2/23.
 * 掷骰子比赛
 */
public class DiceGame {

    private Player player1;
    private Player player2;
    private Player player3;
    List<Integer> throwNumbers = new ArrayList<Integer>();

    public void startGame() {
        initData();
        System.out.println("欢迎来到不邀莲赌场，今天我们的参赛嘉宾有" + player1.name + "、" + player2.name + "、" + player3.name);
        while (true) {
            System.out.println("比赛开始");
            // 最开始的处理是throwDice方法返回一个int类型，但是也可以通过Player里面的number属性，
            // 将投掷的结果赋值给number，然后读取number的属性，这样的话，就可以将throwDice方法设置为void了
//            int player1Num = player1.throwDice();
//            int player2Num = player2.throwDice();
//            int player3Num = player3.throwDice();
            player1.throwDice();
            player2.throwDice();
            player3.throwDice();
            throwNumbers.clear();
            // 如果不加throwNumbers.clear()产生空指针异常的解析：
            /**
             * 1. 因为throwNumbers是一个实例变量，如果不在第二次循环时先清空原有的数据的话，第二次进入时，其中会留有上一次的数据
             * 2. 在findMaxNum的时候，找到的比如是第5个数字最大，那么switch就不会走到case 0，1，2中，返回一个null的player
             * 3. 在sout最终赢家的时候，取了winner的name，而winner此时为null，于是会报出空指针异常
             */
            throwNumbers.add(player1.number);
            throwNumbers.add(player2.number);
            throwNumbers.add(player3.number);

            if (isTie()) {
                System.out.println("不分胜负，怎么搞的，再来！");
            } else {
                Player winner = checkWinner(throwNumbers);
                System.out.println("Winner is " + winner.name);
                break;
            }
        }
    }

    private Player checkWinner(List<Integer> throwNumbers) {
        int i = throwNumbers.indexOf(findMaxNum(throwNumbers));
        switch (i) {
            case 0:
                return player1;
            case 1:
                return player2;
            case 2:
                return player3;
        }
        return null;
    }

    private int findMaxNum(List<Integer> numbers) {
        int maxNum = 0;
        for (int num : numbers) {
            if (num >= maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    private boolean isTie() {
        return player1.number == player2.number && player1.number == player3.number;
    }

    private void initData() {
        player1 = new Player();
        player1.name = "西施";
        player2 = new Player();
        player2.name = "王昭君";
        player3 = new Player();
        player3.name = "司马迁";
    }
}
