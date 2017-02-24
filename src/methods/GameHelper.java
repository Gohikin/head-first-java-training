package methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wuhaijing on 2017/2/24.
 */
public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            inputLine = reader.readLine(); // reader.readLine会引起IO异常，需要进行捕捉
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
