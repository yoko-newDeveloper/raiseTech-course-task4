package stream.sweetsBox;

import java.util.List;

public class FilterSweetsBox {
    public static void main(String[] args) {
        List<String> sweets = List.of ("cookie", "chocolate", "candy", "gum", "chocolate");
        List<String> chocolateCount = sweets.stream()         // Listをstreamに変換する
                .filter(sweet -> sweet.contains("chocolate")) // chocolateをフィルター
                .toList();                                    // chocolateの数を数える
        System.out.println(chocolateCount);
    }
}
