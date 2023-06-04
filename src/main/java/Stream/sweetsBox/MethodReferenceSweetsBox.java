package Stream.sweetsBox;

import java.util.List;

public class MethodReferenceSweetsBox {
    public static void main(String[] args) {
        List<String> sweets = List.of("cookie", "chocolate", "candy", "gum", "chocolate");
        long chocolateCount = sweets.stream()

                // ラムダ式をメソッド参照に変更する
                .filter("chocolate" :: contains)
                .count();

        System.out.println("chocolateの数：" + chocolateCount);
    }
}
