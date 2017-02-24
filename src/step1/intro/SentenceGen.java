package step1.intro;

/**
 * Created by wuhaijing on 2017/2/23.
 * Generate some interesting sentence
 */
public class SentenceGen {

    private static String[] nameList;
    private static String[] placeList;
    private static String[] actionList;
    private static String[] nounList;

    public static void main(String[] args) {
        initPhraseList();
        int nameListRandNum = generateRandNum(nameList);
        int placeListRandNum = generateRandNum(placeList);
        int actionListRandNum = generateRandNum(actionList);
        int nounListRandNum = generateRandNum(nounList);
        String phrase = nameList[nameListRandNum] + "在" + placeList[placeListRandNum] + actionList[actionListRandNum] + nounList[nounListRandNum];
        System.out.println(phrase);
    }

    private static int generateRandNum(String[] list) {
        return (int) (Math.random() * list.length);
    }

    private static void initPhraseList() {
        nameList = new String[]{"令狐冲", "张飞", "独孤求败", "西门庆", "潘金莲", "梵高", "莫扎特", "爱因斯坦", "孙悟空", "哈利波特"};
        placeList = new String[]{"景阳冈", "喜马拉雅山", "菜市场", "洗手间", "动物园"};
        actionList = new String[]{"看", "踢", "抬", "甩", "吃", "洗", "灌", "听", "舔", "闻", "尝", "抽", "玩", "搞", "打"};
        nounList = new String[]{"音乐", "足球", "手", "袜子", "西瓜", "电玩", "飞机", "抹布", "猴子"};
    }
}
