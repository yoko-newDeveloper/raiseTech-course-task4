package Stream;

import java.util.ArrayList;
import java.util.List;

public class forEachSweetsBox {
    public static void main(String[] args) {

        List<String> sweets = new ArrayList<String>();

        sweets.add("クッキー");
        sweets.add("チョコレート");
        sweets.add("せんべい");
        sweets.add("ガム");

        // ラムダ式
        sweets.forEach(sweetsBox -> System.out.println(sweetsBox));
    }
}
