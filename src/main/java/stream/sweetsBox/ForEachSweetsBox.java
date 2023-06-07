package stream.sweetsBox;

import java.util.ArrayList;
import java.util.List;

public class ForEachSweetsBox {
    public static void main(String[] args) {

        List<String> sweets = new ArrayList<>();

        sweets.add("cookie");
        sweets.add("chocolate");
        sweets.add("candy");
        sweets.add("gum");
        sweets.add("chocolate");

        // ラムダ式
        sweets.forEach(sweet -> System.out.println(sweet));
    }
}
