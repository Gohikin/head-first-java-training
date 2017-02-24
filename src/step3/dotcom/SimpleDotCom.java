package step3.dotcom;

/**
 * Created by wuhaijing on 2017/2/24.
 */
public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits;

    public int[] getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }


    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                // 对Primitive类型，使用==来判断相等，对于对象而言，如果使用==，则比较的是两者是否指向同一块内存区域
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result); // 提示用户此次猜测是否击中
        return result;
    }
}
