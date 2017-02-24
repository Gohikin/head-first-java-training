package step3.dotcom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuhaijing on 2017/2/24.
 */
public class DotCom {
    //    private int[] locationCells;
    private List<String> locationCells;

    public List<String> getLocationCells() {
        return locationCells;
    }

    public void setLocationCells(List<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userGuess) {
        String result = "miss";
        int index = locationCells.indexOf(userGuess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result); // 提示用户此次猜测是否击中
        return result;
    }
}
