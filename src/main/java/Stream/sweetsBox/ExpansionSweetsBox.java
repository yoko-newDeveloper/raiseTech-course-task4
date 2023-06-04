package Stream.sweetsBox;

import java.util.ArrayList;
import java.util.List;

public class ExpansionSweetsBox {
    public static void main(String[] args) {

        // List.of使用
        List<String> sweets = List.of("cookie", "chocolate", "candy", "gum","chocolate");

        // ラムダ式を拡張for文で記述する
        for (String sweet : sweets) {
            System.out.println(sweets);
        }


    }

}
