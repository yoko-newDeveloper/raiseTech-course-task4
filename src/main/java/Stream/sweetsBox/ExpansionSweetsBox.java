package Stream;

import java.util.ArrayList;
import java.util.List;

public class ExpansionSweetsBox {
    public static void main(String[] args) {

        List<String> sweets = new ArrayList<String>();
        sweets.add("クッキー");
        sweets.add("チョコレート");
        sweets.add("せんべい");
        sweets.add("ガム");

        // ラムダ式を拡張for文で記述する
        for (String box : sweets) {
            System.out.println(box);
        }


    }

}
